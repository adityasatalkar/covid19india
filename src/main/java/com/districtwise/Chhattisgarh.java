package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chhattisgarh {

	@SerializedName("districtData")
	@Expose
	private ChhattisgarhDistrictData districtData;

	public ChhattisgarhDistrictData getDistrictData() {
		return districtData;
	}

	public void setDistrictData(ChhattisgarhDistrictData districtData) {
		this.districtData = districtData;
	}

}
