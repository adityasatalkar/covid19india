package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Manipur {

	@SerializedName("districtData")
	@Expose
	private ManipurDistrictData districtData;

	public ManipurDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(ManipurDistrictData districtData) {
		this.districtData = districtData;
	}

}
