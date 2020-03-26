package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HimachalPradeshDistrictData {

	@SerializedName("Kangra")
	@Expose
	private Kangra kangra;

	public Kangra getKangra() {
		return kangra;
	}

	public void setKangra(Kangra kangra) {
		this.kangra = kangra;
	}

}
