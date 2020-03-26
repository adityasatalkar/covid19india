package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HaryanaDistrictData {

	@SerializedName("Gurugram")
	@Expose
	private Gurugram gurugram;
	@SerializedName("Faridabad")
	@Expose
	private Faridabad faridabad;
	@SerializedName("Panipat")
	@Expose
	private Panipat panipat;
	@SerializedName("Panchkula")
	@Expose
	private Panchkula panchkula;
	@SerializedName("Sonipat")
	@Expose
	private Sonipat sonipat;
	@SerializedName("Palwal")
	@Expose
	private Palwal palwal;
	@SerializedName("Unknown")
	@Expose
	private HaryanaUnknownDistrict unknown;
	@SerializedName("Guragon")
	@Expose
	private Guragon guragon;

	public Gurugram getGurugram() {
		return gurugram;
	}

	public void setGurugram(Gurugram gurugram) {
		this.gurugram = gurugram;
	}

	public Faridabad getFaridabad() {
		return faridabad;
	}

	public void setFaridabad(Faridabad faridabad) {
		this.faridabad = faridabad;
	}

	public Panipat getPanipat() {
		return panipat;
	}

	public void setPanipat(Panipat panipat) {
		this.panipat = panipat;
	}

	public Panchkula getPanchkula() {
		return panchkula;
	}

	public void setPanchkula(Panchkula panchkula) {
		this.panchkula = panchkula;
	}

	public Sonipat getSonipat() {
		return sonipat;
	}

	public void setSonipat(Sonipat sonipat) {
		this.sonipat = sonipat;
	}

	public Palwal getPalwal() {
		return palwal;
	}

	public void setPalwal(Palwal palwal) {
		this.palwal = palwal;
	}

	public HaryanaUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(HaryanaUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Guragon getGuragon() {
		return guragon;
	}

	public void setGuragon(Guragon guragon) {
		this.guragon = guragon;
	}

}
