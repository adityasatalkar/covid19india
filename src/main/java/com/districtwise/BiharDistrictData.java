package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BiharDistrictData {

	@SerializedName("Munger")
	@Expose
	private Munger munger;
	@SerializedName("Patna")
	@Expose
	private Patna patna;

	public Munger getMunger() {
		return munger;
	}

	public void setMunger(Munger munger) {
		this.munger = munger;
	}

	public Patna getPatna() {
		return patna;
	}

	public void setPatna(Patna patna) {
		this.patna = patna;
	}

}
