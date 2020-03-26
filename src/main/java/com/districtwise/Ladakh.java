package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ladakh {

	@SerializedName("districtData")
	@Expose
	private LadakhDistrictData districtData;

	public LadakhDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(LadakhDistrictData districtData) {
		this.districtData = districtData;
	}

}
