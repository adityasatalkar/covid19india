package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TamilNadu {

	@SerializedName("districtData")
	@Expose
	private TamilNaduDistrictData districtData;

	public TamilNaduDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(TamilNaduDistrictData districtData) {
		this.districtData = districtData;
	}

}
