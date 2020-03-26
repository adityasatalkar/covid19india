package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JammuAndKashmirDistrictData {

	@SerializedName("Unknown")
	@Expose
	private JammuAndKashmirUnknownDistrict unknown;
	@SerializedName("Jammu")
	@Expose
	private Jammu jammu;
	@SerializedName("Srinagar")
	@Expose
	private Srinagar srinagar;
	@SerializedName("Bandipora")
	@Expose
	private Bandipora bandipora;

	public JammuAndKashmirUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(JammuAndKashmirUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Jammu getJammu() {
		return jammu;
	}

	public void setJammu(Jammu jammu) {
		this.jammu = jammu;
	}

	public Srinagar getSrinagar() {
		return srinagar;
	}

	public void setSrinagar(Srinagar srinagar) {
		this.srinagar = srinagar;
	}

	public Bandipora getBandipora() {
		return bandipora;
	}

	public void setBandipora(Bandipora bandipora) {
		this.bandipora = bandipora;
	}

}
