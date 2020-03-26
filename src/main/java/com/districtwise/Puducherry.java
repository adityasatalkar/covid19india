package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Puducherry {

	@SerializedName("districtData")
	@Expose
	private PuducherryDistrictData districtData;

	public PuducherryDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(PuducherryDistrictData districtData) {
		this.districtData = districtData;
	}

}
