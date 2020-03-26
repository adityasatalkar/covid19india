package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UttarPradesh {

	@SerializedName("districtData")
	@Expose
	private UttarPradeshDistrictData districtData;

	public UttarPradeshDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(UttarPradeshDistrictData districtData) {
		this.districtData = districtData;
	}

}
