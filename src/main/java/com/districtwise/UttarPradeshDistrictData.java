package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UttarPradeshDistrictData {

	@SerializedName("Agra")
	@Expose
	private Agra agra;
	@SerializedName("Unknown")
	@Expose
	private UttarPradeshUnknownDistrict unknown;
	@SerializedName("Ghaziabad")
	@Expose
	private Ghaziabad ghaziabad;
	@SerializedName("Lucknow")
	@Expose
	private Lucknow lucknow;
	@SerializedName("Gautam Buddh Nagar")
	@Expose
	private GautamBuddhNagar gautamBuddhNagar;
	@SerializedName("Gautam Buddha Nagar")
	@Expose
	private GautamBuddhaNagar gautamBuddhaNagar;
	@SerializedName("Moradabad")
	@Expose
	private Moradabad moradabad;
	@SerializedName("Kanpur")
	@Expose
	private Kanpur kanpur;
	@SerializedName("Pilibhit")
	@Expose
	private Pilibhit pilibhit;
	@SerializedName("Jaunpur")
	@Expose
	private Jaunpur jaunpur;

	public Agra getAgra() {
		return agra;
	}

	public void setAgra(Agra agra) {
		this.agra = agra;
	}

	public UttarPradeshUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(UttarPradeshUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Ghaziabad getGhaziabad() {
		return ghaziabad;
	}

	public void setGhaziabad(Ghaziabad ghaziabad) {
		this.ghaziabad = ghaziabad;
	}

	public Lucknow getLucknow() {
		return lucknow;
	}

	public void setLucknow(Lucknow lucknow) {
		this.lucknow = lucknow;
	}

	public GautamBuddhNagar getGautamBuddhNagar() {
		return gautamBuddhNagar;
	}

	public void setGautamBuddhNagar(GautamBuddhNagar gautamBuddhNagar) {
		this.gautamBuddhNagar = gautamBuddhNagar;
	}

	public GautamBuddhaNagar getGautamBuddhaNagar() {
		return gautamBuddhaNagar;
	}

	public void setGautamBuddhaNagar(GautamBuddhaNagar gautamBuddhaNagar) {
		this.gautamBuddhaNagar = gautamBuddhaNagar;
	}

	public Moradabad getMoradabad() {
		return moradabad;
	}

	public void setMoradabad(Moradabad moradabad) {
		this.moradabad = moradabad;
	}

	public Kanpur getKanpur() {
		return kanpur;
	}

	public void setKanpur(Kanpur kanpur) {
		this.kanpur = kanpur;
	}

	public Pilibhit getPilibhit() {
		return pilibhit;
	}

	public void setPilibhit(Pilibhit pilibhit) {
		this.pilibhit = pilibhit;
	}

	public Jaunpur getJaunpur() {
		return jaunpur;
	}

	public void setJaunpur(Jaunpur jaunpur) {
		this.jaunpur = jaunpur;
	}

}
