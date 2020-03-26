package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MadhyaPradeshDistrictData {

	@SerializedName("Jabalpur")
	@Expose
	private Jabalpur jabalpur;
	@SerializedName("Bhopal")
	@Expose
	private Bhopal bhopal;
	@SerializedName("Unknown")
	@Expose
	private MadhyaPradeshUnknownDistrict unknown;
	@SerializedName("Gwalior")
	@Expose
	private Gwalior gwalior;
	@SerializedName("Shivpuri")
	@Expose
	private Shivpuri shivpuri;

	public Jabalpur getJabalpur() {
		return jabalpur;
	}

	public void setJabalpur(Jabalpur jabalpur) {
		this.jabalpur = jabalpur;
	}

	public Bhopal getBhopal() {
		return bhopal;
	}

	public void setBhopal(Bhopal bhopal) {
		this.bhopal = bhopal;
	}

	public MadhyaPradeshUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(MadhyaPradeshUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Gwalior getGwalior() {
		return gwalior;
	}

	public void setGwalior(Gwalior gwalior) {
		this.gwalior = gwalior;
	}

	public Shivpuri getShivpuri() {
		return shivpuri;
	}

	public void setShivpuri(Shivpuri shivpuri) {
		this.shivpuri = shivpuri;
	}

}
