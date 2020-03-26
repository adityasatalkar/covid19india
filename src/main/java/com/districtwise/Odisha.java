package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Odisha {

	@SerializedName("districtData")
	@Expose
	private OdishaDistrictData districtData;

	public OdishaDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(OdishaDistrictData districtData) {
		this.districtData = districtData;
	}

}
