package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bihar {

	@SerializedName("districtData")
	@Expose
	private BiharDistrictData districtData;

	public BiharDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(BiharDistrictData districtData) {
		this.districtData = districtData;
	}

}
