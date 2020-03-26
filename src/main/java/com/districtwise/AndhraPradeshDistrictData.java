package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AndhraPradeshDistrictData {

	@SerializedName("S.P.S. Nellore")
	@Expose
	private SPSNellore sPSNellore;
	@SerializedName("Prakasam")
	@Expose
	private Prakasam prakasam;
	@SerializedName("Visakhapatnam")
	@Expose
	private Visakhapatnam visakhapatnam;
	@SerializedName("East Godavari")
	@Expose
	private EastGodavari eastGodavari;
	@SerializedName("Krishna")
	@Expose
	private Krishna krishna;
	@SerializedName("Vishakhapatnam")
	@Expose
	private Vishakhapatnam vishakhapatnam;
	@SerializedName("Chitoor")
	@Expose
	private Chitoor chitoor;
	@SerializedName("Vijayawada")
	@Expose
	private Vijayawada vijayawada;
	@SerializedName("Guntur")
	@Expose
	private Guntur guntur;

	public SPSNellore getSPSNellore() {
		return sPSNellore;
	}

	public void setSPSNellore(SPSNellore sPSNellore) {
		this.sPSNellore = sPSNellore;
	}

	public Prakasam getPrakasam() {
		return prakasam;
	}

	public void setPrakasam(Prakasam prakasam) {
		this.prakasam = prakasam;
	}

	public Visakhapatnam getVisakhapatnam() {
		return visakhapatnam;
	}

	public void setVisakhapatnam(Visakhapatnam visakhapatnam) {
		this.visakhapatnam = visakhapatnam;
	}

	public EastGodavari getEastGodavari() {
		return eastGodavari;
	}

	public void setEastGodavari(EastGodavari eastGodavari) {
		this.eastGodavari = eastGodavari;
	}

	public Krishna getKrishna() {
		return krishna;
	}

	public void setKrishna(Krishna krishna) {
		this.krishna = krishna;
	}

	public Vishakhapatnam getVishakhapatnam() {
		return vishakhapatnam;
	}

	public void setVishakhapatnam(Vishakhapatnam vishakhapatnam) {
		this.vishakhapatnam = vishakhapatnam;
	}

	public Chitoor getChitoor() {
		return chitoor;
	}

	public void setChitoor(Chitoor chitoor) {
		this.chitoor = chitoor;
	}

	public Vijayawada getVijayawada() {
		return vijayawada;
	}

	public void setVijayawada(Vijayawada vijayawada) {
		this.vijayawada = vijayawada;
	}

	public Guntur getGuntur() {
		return guntur;
	}

	public void setGuntur(Guntur guntur) {
		this.guntur = guntur;
	}

}
