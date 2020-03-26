package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rajasthan {

	@SerializedName("districtData")
	@Expose
	private RajasthanDistrictData districtData;

	public RajasthanDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(RajasthanDistrictData districtData) {
		this.districtData = districtData;
	}

}
