package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HimachalPradesh {

	@SerializedName("districtData")
	@Expose
	private HimachalPradeshDistrictData districtData;

	public HimachalPradeshDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(HimachalPradeshDistrictData districtData) {
		this.districtData = districtData;
	}

}
