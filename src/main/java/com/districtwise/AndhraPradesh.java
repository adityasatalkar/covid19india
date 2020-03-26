package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AndhraPradesh {

	@SerializedName("districtData")
	@Expose
	private AndhraPradeshDistrictData districtData;

	public AndhraPradeshDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(AndhraPradeshDistrictData districtData) {
		this.districtData = districtData;
	}

}
