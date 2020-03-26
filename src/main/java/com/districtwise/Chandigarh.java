package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chandigarh {

	@SerializedName("districtData")
	@Expose
	private ChandigarhDistrictData districtData;

	public ChandigarhDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(ChandigarhDistrictData districtData) {
		this.districtData = districtData;
	}

}
