package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RajasthanDistrictData {

	@SerializedName("Jaipur")
	@Expose
	private Jaipur jaipur;
	@SerializedName("Jhunjhunu")
	@Expose
	private Jhunjhunu jhunjhunu;
	@SerializedName("Bhilwara")
	@Expose
	private Bhilwara bhilwara;
	@SerializedName("Jodhpur")
	@Expose
	private Jodhpur jodhpur;
	@SerializedName("Unknown")
	@Expose
	private RajasthanUnknownDistrict unknown;
	@SerializedName("Pratapgarh ")
	@Expose
	private Pratapgarh pratapgarh;

	public Jaipur getJaipur() {
		return jaipur;
	}

	public void setJaipur(Jaipur jaipur) {
		this.jaipur = jaipur;
	}

	public Jhunjhunu getJhunjhunu() {
		return jhunjhunu;
	}

	public void setJhunjhunu(Jhunjhunu jhunjhunu) {
		this.jhunjhunu = jhunjhunu;
	}

	public Bhilwara getBhilwara() {
		return bhilwara;
	}

	public void setBhilwara(Bhilwara bhilwara) {
		this.bhilwara = bhilwara;
	}

	public Jodhpur getJodhpur() {
		return jodhpur;
	}

	public void setJodhpur(Jodhpur jodhpur) {
		this.jodhpur = jodhpur;
	}

	public RajasthanUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(RajasthanUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Pratapgarh getPratapgarh() {
		return pratapgarh;
	}

	public void setPratapgarh(Pratapgarh pratapgarh) {
		this.pratapgarh = pratapgarh;
	}

}
