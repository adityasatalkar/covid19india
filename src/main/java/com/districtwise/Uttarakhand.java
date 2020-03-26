package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Uttarakhand {

	@SerializedName("districtData")
	@Expose
	private UttarakhandDistrictData districtData;

	public UttarakhandDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(UttarakhandDistrictData districtData) {
		this.districtData = districtData;
	}

}
