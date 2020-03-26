package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Haryana {

	@SerializedName("districtData")
	@Expose
	private HaryanaDistrictData districtData;

	public HaryanaDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(HaryanaDistrictData districtData) {
		this.districtData = districtData;
	}

}
