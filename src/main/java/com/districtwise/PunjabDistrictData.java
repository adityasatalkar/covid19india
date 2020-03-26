package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PunjabDistrictData {

	@SerializedName("Amritsar")
	@Expose
	private Amritsar amritsar;
	@SerializedName("Shaheed Bhagat Singh Nagar")
	@Expose
	private ShaheedBhagatSinghNagar shaheedBhagatSinghNagar;
	@SerializedName("Sahibzada Ajit Singh Nagar")
	@Expose
	private SahibzadaAjitSinghNagar sahibzadaAjitSinghNagar;
	@SerializedName("Hoshiarpur")
	@Expose
	private Hoshiarpur hoshiarpur;
	@SerializedName("Jalandhar")
	@Expose
	private Jalandhar jalandhar;
	@SerializedName("Unknown")
	@Expose
	private PunjabUnknownDistrict unknown;
	@SerializedName("Ludhiana")
	@Expose
	private Ludhiana ludhiana;

	public Amritsar getAmritsar() {
		return amritsar;
	}

	public void setAmritsar(Amritsar amritsar) {
		this.amritsar = amritsar;
	}

	public ShaheedBhagatSinghNagar getShaheedBhagatSinghNagar() {
		return shaheedBhagatSinghNagar;
	}

	public void setShaheedBhagatSinghNagar(ShaheedBhagatSinghNagar shaheedBhagatSinghNagar) {
		this.shaheedBhagatSinghNagar = shaheedBhagatSinghNagar;
	}

	public SahibzadaAjitSinghNagar getSahibzadaAjitSinghNagar() {
		return sahibzadaAjitSinghNagar;
	}

	public void setSahibzadaAjitSinghNagar(SahibzadaAjitSinghNagar sahibzadaAjitSinghNagar) {
		this.sahibzadaAjitSinghNagar = sahibzadaAjitSinghNagar;
	}

	public Hoshiarpur getHoshiarpur() {
		return hoshiarpur;
	}

	public void setHoshiarpur(Hoshiarpur hoshiarpur) {
		this.hoshiarpur = hoshiarpur;
	}

	public Jalandhar getJalandhar() {
		return jalandhar;
	}

	public void setJalandhar(Jalandhar jalandhar) {
		this.jalandhar = jalandhar;
	}

	public PunjabUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(PunjabUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Ludhiana getLudhiana() {
		return ludhiana;
	}

	public void setLudhiana(Ludhiana ludhiana) {
		this.ludhiana = ludhiana;
	}

}
