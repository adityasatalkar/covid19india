package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChandigarhDistrictData {

	@SerializedName("Chandigarh")
	@Expose
	private ChandigarhCity chandigarh;

	public ChandigarhCity getChandigarh() {
		return chandigarh;
	}

	public void setChandigarh(ChandigarhCity chandigarh) {
		this.chandigarh = chandigarh;
	}

}
