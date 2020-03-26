package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mizoram {

	@SerializedName("districtData")
	@Expose
	private MizoramDistrictData districtData;

	public MizoramDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(MizoramDistrictData districtData) {
		this.districtData = districtData;
	}

}
