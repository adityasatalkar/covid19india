package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnknownState {

	@SerializedName("districtData")
	@Expose
	private UnknownDistrictData districtData;

	public UnknownDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(UnknownDistrictData districtData) {
		this.districtData = districtData;
	}

}
