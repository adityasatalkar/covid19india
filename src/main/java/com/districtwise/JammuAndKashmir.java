package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JammuAndKashmir {

	@SerializedName("districtData")
	@Expose
	private JammuAndKashmirDistrictData districtData;

	public JammuAndKashmirDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(JammuAndKashmirDistrictData districtData) {
		this.districtData = districtData;
	}

}
