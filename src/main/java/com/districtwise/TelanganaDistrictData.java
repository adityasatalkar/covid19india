package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TelanganaDistrictData {

	@SerializedName("Hyderabad")
	@Expose
	private Hyderabad hyderabad;
	@SerializedName("Karimnagar")
	@Expose
	private Karimnagar karimnagar;
	@SerializedName("Bhadradri Kothagudem")
	@Expose
	private BhadradriKothagudem bhadradriKothagudem;
	@SerializedName("Ranga Reddy")
	@Expose
	private RangaReddy rangaReddy;
	@SerializedName("Unknown")
	@Expose
	private TelanganaUnknownDistrict unknown;

	public Hyderabad getHyderabad() {
		return hyderabad;
	}

	public void setHyderabad(Hyderabad hyderabad) {
		this.hyderabad = hyderabad;
	}

	public Karimnagar getKarimnagar() {
		return karimnagar;
	}

	public void setKarimnagar(Karimnagar karimnagar) {
		this.karimnagar = karimnagar;
	}

	public BhadradriKothagudem getBhadradriKothagudem() {
		return bhadradriKothagudem;
	}

	public void setBhadradriKothagudem(BhadradriKothagudem bhadradriKothagudem) {
		this.bhadradriKothagudem = bhadradriKothagudem;
	}

	public RangaReddy getRangaReddy() {
		return rangaReddy;
	}

	public void setRangaReddy(RangaReddy rangaReddy) {
		this.rangaReddy = rangaReddy;
	}

	public TelanganaUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(TelanganaUnknownDistrict unknown) {
		this.unknown = unknown;
	}

}
