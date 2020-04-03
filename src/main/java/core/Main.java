package core;

import api.Data;
import api.Statewise;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import process_data.*;

import java.util.*;

public class Main {

	static final String HOSPITALIZED = "Hospitalized";
	static final String RECOVERED = "Recovered";
	static final String DECEASED = "Deceased";
	static final String CONFIRMED = "Confirmed";

	static HashMap<String, List<String>> stateNamesHashMap = new HashMap<>();
	static HashMap<String, Integer> districtNamesHashMap = new HashMap<>();

	public static void getRawData() throws Exception {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String jsonString = ApiCall.getDataFromApi(ApiCall.RAW_DATA_URL);

		RawData rawDataObject = gson.fromJson(jsonString, RawData.class);

		List<RawDatum> rawDatumList = rawDataObject.getRawData();

		Collections.sort(rawDatumList, RawDatum.StateNameComparatorAscendingOrder);

		for (int i = 0; i < rawDatumList.size(); i++) {
			if (stateNamesHashMap.containsKey(rawDatumList.get(i).getDetectedstate())) {
				List<String> districtNames = stateNamesHashMap.get(rawDatumList.get(i).getDetectedstate());
				if (!districtNames.contains(rawDatumList.get(i).getDetecteddistrict())) {
					districtNames.add(rawDatumList.get(i).getDetecteddistrict());
				}
			}
			else {
				List<String> list = new ArrayList<>();
				if (rawDatumList.get(i).getDetectedstate().equalsIgnoreCase("")) {
					stateNamesHashMap.put("Unknown", list);
				}
				stateNamesHashMap.put(rawDatumList.get(i).getDetectedstate(), list);
			}
		}

		for (int i = 0; i < rawDatumList.size(); i++) {

			if (!districtNamesHashMap.containsKey(rawDatumList.get(i).getDetecteddistrict())) {
				if (rawDatumList.get(i).getDetecteddistrict().isEmpty()) {
					districtNamesHashMap.put(rawDatumList.get(i).getDetectedstate() + "Unknown", 1);
				}
				else {
					districtNamesHashMap.put(rawDatumList.get(i).getDetecteddistrict(), 1);
				}
			}
			else {
				int count;
				if (rawDatumList.get(i).getDetecteddistrict().isEmpty()) {
					count = districtNamesHashMap.get(rawDatumList.get(i).getDetectedstate() + "Unknown");
					districtNamesHashMap.put(rawDatumList.get(i).getDetectedstate() + "Unknown", ++count);
				}
				else {
					count = districtNamesHashMap.get(rawDatumList.get(i).getDetecteddistrict());
					districtNamesHashMap.put(rawDatumList.get(i).getDetecteddistrict(), ++count);
				}
			}
		}
	}

	public static Data getData() throws Exception {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String jsonString = ApiCall.getDataFromApi(ApiCall.DATA_URL);

		Data data = gson.fromJson(jsonString, Data.class);

		List<Statewise> statewiseList = data.getStatewise();
		List<DistrictWise> districtWiseList = new ArrayList<>();


		for (Statewise stateWiseObject: statewiseList) {

			DistrictWise districtWiseObject = new DistrictWise();
			districtWiseObject.setState(stateWiseObject.getState());

			System.out.println("*********");
			System.out.println("State " + stateWiseObject.getState());
			System.out.println(CONFIRMED + " " + stateWiseObject.getConfirmed());
			System.out.println(HOSPITALIZED + " " + stateWiseObject.getActive());
			System.out.println(RECOVERED + " " + stateWiseObject.getRecovered());
			System.out.println(DECEASED + " " + stateWiseObject.getDeaths());

			List<DistrictDatum> districtDatumList = new ArrayList<>();
			int count = 0;
			if (stateNamesHashMap.containsKey(stateWiseObject.getState())) {


				List<String> districtNamesList = stateNamesHashMap.get(stateWiseObject.getState());
				if (!districtNamesList.isEmpty()) {
					System.out.println();
					System.out.println("District Wise");
					HashMap<String, Integer> currentStateDistrictsHashMap = sortByValue(populateLocalHashMap(districtNamesList));
					for (Map.Entry<String,Integer> map: currentStateDistrictsHashMap.entrySet()) {
						String districtName = map.getKey();
						int value = map.getValue();

						DistrictDatum districtDatumObject = new DistrictDatum();
						districtDatumObject.setDistrict(districtName);
						districtDatumObject.setConfirmed(value);

						count += value;
						System.out.println(districtName + " " + value);

						districtDatumList.add(districtDatumObject);
					}
				}
			}
			if (count != Integer.parseInt(stateWiseObject.getConfirmed()) && !stateWiseObject.getState().equalsIgnoreCase("Total")) {
				int unknown = Integer.parseInt(stateWiseObject.getConfirmed()) - count;
				DistrictDatum districtDatumObject = new DistrictDatum();
				districtDatumObject.setDistrict("Unknown");
				districtDatumObject.setConfirmed(unknown);
				districtDatumList.add(districtDatumObject);
				districtNamesHashMap.put(stateWiseObject.getState() + "Unknown", unknown);
				System.out.println("Unknown" + " " + unknown);
			}
			districtWiseObject.setDistrictData(districtDatumList);
			districtWiseList.add(districtWiseObject);
		}
		System.out.println();
		//printData(districtWiseList);
		return data;
	}

	public static HashMap<String, Integer> populateLocalHashMap(List<String> districtNamesList) {
		HashMap<String, Integer> hashMap = new HashMap();
		for (int i = 0; i < districtNamesList.size(); i++) {
			if (!districtNamesList.get(i).isEmpty()) {
				hashMap.put(districtNamesList.get(i), districtNamesHashMap.get(districtNamesList.get(i)));
			}
		}
		return hashMap;
	}

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hashMap) {
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer> > list =
				new LinkedList<Map.Entry<String, Integer> >(hashMap.entrySet());

		// Sort the list in descending order based on values
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
			public int compare(Map.Entry<String, Integer> o1,
							   Map.Entry<String, Integer> o2)
			{
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	public static void printData(List<DistrictWise> districtWiseList) {
		for (DistrictWise districtWiseObject: districtWiseList) {
			System.out.println("State " + districtWiseObject.getState());
			List<DistrictDatum> districtDatumList = districtWiseObject.getDistrictData();
			for (DistrictDatum districtDatumObject: districtDatumList) {
				System.out.println(districtDatumObject.getDistrict() + " " + districtDatumObject.getConfirmed());
			}
		}
	}

	public static DistrictWise getDistrictWiseData(String state) {
		try {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String jsonString = "{\"districtWise\":" + ApiCall.getDataFromApi(ApiCall.STATE_DISTRICT_WISE_V2_URL) + "}";

			StateDistrictWise stateDistrictWise = gson.fromJson(jsonString, StateDistrictWise.class);
			List<DistrictWise> districtWiseList = stateDistrictWise.getDistrictWise();
			for (DistrictWise districtWiseObject: districtWiseList) {
				if (districtWiseObject.getState().equalsIgnoreCase(state)) {
					return districtWiseObject;
				}
				/*
				System.out.println(districtWiseObject.getState());
				List<DistrictDatum> districtDataList = districtWiseObject.getDistrictData();
				Collections.sort(districtDataList, DistrictDatum.DistrictConfirmedComparatorDescendingOrder);
				for (DistrictDatum districtDatumObject: districtDataList) {
					System.out.println(districtDatumObject.getDistrict() + " " + districtDatumObject.getConfirmed());
				}
				System.out.println();
				*/
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		//getRawData();
		getData();
		DistrictWise districtWiseObject = getDistrictWiseData("maharashtra");
		System.out.println("State " + districtWiseObject.getState());
		List<DistrictDatum> districtDataList = districtWiseObject.getDistrictData();
		Collections.sort(districtDataList, DistrictDatum.DistrictConfirmedComparatorDescendingOrder);
		for (DistrictDatum districtDatumObject: districtDataList) {
			System.out.println(districtDatumObject.getDistrict() + " " + districtDatumObject.getConfirmed());
		}
	}
}
