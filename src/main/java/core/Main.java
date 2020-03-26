package core;

import api.Data;
import api.Statewise;
import com.districtwise.DistrictWise;
import com.districtwise.RawDatum;

import java.util.Collections;
import java.util.List;

public class Main {

	public static int DECEASED_COUNT = 0;
	public static int RECOVERED_COUNT = 0;
	public static int ACTIVE_COUNT = 0;
	public static int CONFIRMED_COUNT = 0;

	public static final String HOSPITALIZED = "Hospitalized";
	public static final String RECOVERED = "Recovered";
	public static final String DECEASED = "Deceased";
	public static final String CONFIRMED = "Confirmed";

	public static void main(String[] args) throws Exception {

		List<RawDatum> rawDatumList = ApiCall.getRawData();

		Collections.sort(rawDatumList, RawDatum.StateNameComparatorAscendingOrder);

//		for (RawDatum rawDatumObject: rawDatumList) {
//			if (rawDatumObject.getCurrentstatus().equalsIgnoreCase(HOSPITALIZED)) {
//				ACTIVE_COUNT++;
//			}
//			if (rawDatumObject.getCurrentstatus().equalsIgnoreCase(RECOVERED)) {
//				RECOVERED_COUNT++;
//			}
//			if (rawDatumObject.getCurrentstatus().equalsIgnoreCase(DECEASED)) {
//				DECEASED_COUNT++;
//			}
//		}
//
//		CONFIRMED_COUNT = ACTIVE_COUNT + RECOVERED_COUNT + DECEASED_COUNT;
//
//		System.out.println(CONFIRMED + " " + CONFIRMED_COUNT);
//		System.out.println(HOSPITALIZED + " " + ACTIVE_COUNT);
//		System.out.println(RECOVERED + " " + RECOVERED_COUNT);
//		System.out.println(DECEASED + " " + DECEASED_COUNT);
//
//		DistrictWise districtWise = ApiCall.getDistrictWise();
//
//		System.out.println(districtWise.getMaharashtra().getDistrictData().getPune().getActive());

		Data data = ApiCall.getData();
		List<Statewise> statewiseList = data.getStatewise();
		for (Statewise stateWiseObject: statewiseList) {
			System.out.println("*********");
			System.out.println("State " + stateWiseObject.getState());
			System.out.println(CONFIRMED + " " + stateWiseObject.getConfirmed());
			System.out.println(HOSPITALIZED + " " + stateWiseObject.getActive());
			System.out.println(DECEASED + " " + stateWiseObject.getDeaths());
		}
	}
}
