package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OdishaUnknownDistrict {

	@SerializedName("active")
	@Expose
	private int active;
	@SerializedName("confirmed")
	@Expose
	private int confirmed;
	@SerializedName("deaths")
	@Expose
	private int deaths;
	@SerializedName("lastupdatedtime")
	@Expose
	private String lastupdatedtime;
	@SerializedName("recovered")
	@Expose
	private int recovered;

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public String getLastupdatedtime() {
		return lastupdatedtime;
	}

	public void setLastupdatedtime(String lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

}
