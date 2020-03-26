package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Delhi {

	@SerializedName("districtData")
	@Expose
	private DelhiDistrictData districtData;

	public DelhiDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(DelhiDistrictData districtData) {
		this.districtData = districtData;
	}

}
