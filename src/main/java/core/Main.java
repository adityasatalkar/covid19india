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


	public static Data getData() throws Exception {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String jsonString = ApiCall.getDataFromApi(ApiCall.DATA_URL);

		Data data = gson.fromJson(jsonString, Data.class);

		return data;
	}


	public static DistrictWise getDistrictWiseData(String state) throws Exception {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = "{\"districtWise\":" + ApiCall.getDataFromApi(ApiCall.STATE_DISTRICT_WISE_V2_URL) + "}";

		StateDistrictWise stateDistrictWise = gson.fromJson(jsonString, StateDistrictWise.class);
		List<DistrictWise> districtWiseList = stateDistrictWise.getDistrictWise();
		for (DistrictWise districtWiseObject: districtWiseList) {
			if (districtWiseObject.getState().equalsIgnoreCase(state)) {
				return districtWiseObject;
			}
		}
		return null;
	}

	public static void printAll(Data data) {
		List<Statewise> statewiseList = data.getStatewise();

		try {
			for (Statewise stateWiseObject : statewiseList) {

				System.out.println("*********");
				System.out.println("State " + stateWiseObject.getState());
				System.out.println(CONFIRMED + " " + stateWiseObject.getConfirmed());
				System.out.println(HOSPITALIZED + " " + stateWiseObject.getActive());
				System.out.println(RECOVERED + " " + stateWiseObject.getRecovered());
				System.out.println(DECEASED + " " + stateWiseObject.getDeaths());

				//printData(districtWiseObject);
				DistrictWise districtWiseObject = getDistrictWiseData(stateWiseObject.getState());
				if (!stateWiseObject.getState().equalsIgnoreCase("Total")) {
					System.out.println();
					try {
						List<DistrictDatum> districtDataList = districtWiseObject.getDistrictData();
						Collections.sort(districtDataList, DistrictDatum.DistrictConfirmedComparatorDescendingOrder);
						for (DistrictDatum districtDatumObject : districtDataList) {
							System.out.println(districtDatumObject.getDistrict() + " " + districtDatumObject.getConfirmed());
						}
					}
					catch (NullPointerException ne) {}
				}
				System.out.println();
			}
		}
		catch (Exception e) {}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		printAll(getData());
	}
}
