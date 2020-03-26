package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TamilNaduDistrictData {

	@SerializedName("Chennai")
	@Expose
	private Chennai chennai;
	@SerializedName("Unknown")
	@Expose
	private TamilNaduUnknownDistrict unknown;
	@SerializedName("Erode")
	@Expose
	private Erode erode;
	@SerializedName("Coimbatore")
	@Expose
	private Coimbatore coimbatore;
	@SerializedName("Tiruneveli")
	@Expose
	private Tiruneveli tiruneveli;
	@SerializedName("Tiruppur")
	@Expose
	private Tiruppur tiruppur;
	@SerializedName("Madurai")
	@Expose
	private Madurai madurai;
	@SerializedName("Salem")
	@Expose
	private Salem salem;

	public Chennai getChennai() {
		return chennai;
	}

	public void setChennai(Chennai chennai) {
		this.chennai = chennai;
	}

	public TamilNaduUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(TamilNaduUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Erode getErode() {
		return erode;
	}

	public void setErode(Erode erode) {
		this.erode = erode;
	}

	public Coimbatore getCoimbatore() {
		return coimbatore;
	}

	public void setCoimbatore(Coimbatore coimbatore) {
		this.coimbatore = coimbatore;
	}

	public Tiruneveli getTiruneveli() {
		return tiruneveli;
	}

	public void setTiruneveli(Tiruneveli tiruneveli) {
		this.tiruneveli = tiruneveli;
	}

	public Tiruppur getTiruppur() {
		return tiruppur;
	}

	public void setTiruppur(Tiruppur tiruppur) {
		this.tiruppur = tiruppur;
	}

	public Madurai getMadurai() {
		return madurai;
	}

	public void setMadurai(Madurai madurai) {
		this.madurai = madurai;
	}

	public Salem getSalem() {
		return salem;
	}

	public void setSalem(Salem salem) {
		this.salem = salem;
	}

}
