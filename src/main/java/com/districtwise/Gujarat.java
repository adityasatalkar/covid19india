package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gujarat {

	@SerializedName("districtData")
	@Expose
	private GujaratDistrictData districtData;

	public GujaratDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(GujaratDistrictData districtData) {
		this.districtData = districtData;
	}

}
