package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Maharashtra {

	@SerializedName("districtData")
	@Expose
	private MaharashtraDistrictData districtData;

	public MaharashtraDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(MaharashtraDistrictData districtData) {
		this.districtData = districtData;
	}

}
