package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WestBengal {

	@SerializedName("districtData")
	@Expose
	private WestBengalDistrictData districtData;

	public WestBengalDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(WestBengalDistrictData districtData) {
		this.districtData = districtData;
	}

}
