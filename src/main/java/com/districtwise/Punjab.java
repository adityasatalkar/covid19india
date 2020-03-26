package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Punjab {

	@SerializedName("districtData")
	@Expose
	private PunjabDistrictData districtData;

	public PunjabDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(PunjabDistrictData districtData) {
		this.districtData = districtData;
	}

}
