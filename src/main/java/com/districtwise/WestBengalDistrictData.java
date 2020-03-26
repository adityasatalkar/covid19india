package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WestBengalDistrictData {

	@SerializedName("Kolkata")
	@Expose
	private Kolkata kolkata;
	@SerializedName("Unknown")
	@Expose
	private WestBengalUnknownDistrict unknown;
	@SerializedName("North 24 Parganas")
	@Expose
	private North24Parganas north24Parganas;
	@SerializedName("North Kolkata")
	@Expose
	private NorthKolkata northKolkata;

	public Kolkata getKolkata() {
		return kolkata;
	}

	public void setKolkata(Kolkata kolkata) {
		this.kolkata = kolkata;
	}

	public WestBengalUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(WestBengalUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public North24Parganas getNorth24Parganas() {
		return north24Parganas;
	}

	public void setNorth24Parganas(North24Parganas north24Parganas) {
		this.north24Parganas = north24Parganas;
	}

	public NorthKolkata getNorthKolkata() {
		return northKolkata;
	}

	public void setNorthKolkata(NorthKolkata northKolkata) {
		this.northKolkata = northKolkata;
	}

}
