package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MadhyaPradesh {

	@SerializedName("districtData")
	@Expose
	private MadhyaPradeshDistrictData districtData;

	public MadhyaPradeshDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(MadhyaPradeshDistrictData districtData) {
		this.districtData = districtData;
	}

}
