package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Telangana {

	@SerializedName("districtData")
	@Expose
	private TelanganaDistrictData districtData;

	public TelanganaDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(TelanganaDistrictData districtData) {
		this.districtData = districtData;
	}

}
