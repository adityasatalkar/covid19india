package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PuducherryDistrictData {

	@SerializedName("Mahe")
	@Expose
	private Mahe mahe;

	public Mahe getMahe() {
		return mahe;
	}

	public void setMahe(Mahe mahe) {
		this.mahe = mahe;
	}

}
