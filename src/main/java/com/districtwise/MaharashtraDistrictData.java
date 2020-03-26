package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaharashtraDistrictData {

	@SerializedName("Pune")
	@Expose
	private Pune pune;
	@SerializedName("Mumbai")
	@Expose
	private Mumbai mumbai;
	@SerializedName("Nagpur")
	@Expose
	private Nagpur nagpur;
	@SerializedName("Thane")
	@Expose
	private Thane thane;
	@SerializedName("Ahmadnagar")
	@Expose
	private Ahmadnagar ahmadnagar;
	@SerializedName("Yavatmal")
	@Expose
	private Yavatmal yavatmal;
	@SerializedName("Aurangabad")
	@Expose
	private Aurangabad aurangabad;
	@SerializedName("Unknown")
	@Expose
	private MaharashtraUnknownDistrict unknown;
	@SerializedName("Ratnagiri")
	@Expose
	private Ratnagiri ratnagiri;
	@SerializedName("Satara")
	@Expose
	private Satara satara;

	public Pune getPune() {
		return pune;
	}

	public void setPune(Pune pune) {
		this.pune = pune;
	}

	public Mumbai getMumbai() {
		return mumbai;
	}

	public void setMumbai(Mumbai mumbai) {
		this.mumbai = mumbai;
	}

	public Nagpur getNagpur() {
		return nagpur;
	}

	public void setNagpur(Nagpur nagpur) {
		this.nagpur = nagpur;
	}

	public Thane getThane() {
		return thane;
	}

	public void setThane(Thane thane) {
		this.thane = thane;
	}

	public Ahmadnagar getAhmadnagar() {
		return ahmadnagar;
	}

	public void setAhmadnagar(Ahmadnagar ahmadnagar) {
		this.ahmadnagar = ahmadnagar;
	}

	public Yavatmal getYavatmal() {
		return yavatmal;
	}

	public void setYavatmal(Yavatmal yavatmal) {
		this.yavatmal = yavatmal;
	}

	public Aurangabad getAurangabad() {
		return aurangabad;
	}

	public void setAurangabad(Aurangabad aurangabad) {
		this.aurangabad = aurangabad;
	}

	public MaharashtraUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(MaharashtraUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Ratnagiri getRatnagiri() {
		return ratnagiri;
	}

	public void setRatnagiri(Ratnagiri ratnagiri) {
		this.ratnagiri = ratnagiri;
	}

	public Satara getSatara() {
		return satara;
	}

	public void setSatara(Satara satara) {
		this.satara = satara;
	}

}
