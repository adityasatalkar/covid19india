package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Karnataka {

	@SerializedName("districtData")
	@Expose
	private KarnatakaDistrictData districtData;

	public KarnatakaDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(KarnatakaDistrictData districtData) {
		this.districtData = districtData;
	}

}
