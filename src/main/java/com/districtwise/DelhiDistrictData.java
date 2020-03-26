package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DelhiDistrictData {

	@SerializedName("East Delhi")
	@Expose
	private EastDelhi eastDelhi;
	@SerializedName("Unknown")
	@Expose
	private DelhiUnknownDistrict unknown;
	@SerializedName("West Delhi")
	@Expose
	private WestDelhi westDelhi;
	@SerializedName("South West Delhi")
	@Expose
	private SouthWestDelhi southWestDelhi;
	@SerializedName("Delhi")
	@Expose
	private DelhiCity delhi;

	public EastDelhi getEastDelhi() {
		return eastDelhi;
	}

	public void setEastDelhi(EastDelhi eastDelhi) {
		this.eastDelhi = eastDelhi;
	}

	public DelhiUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(DelhiUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public WestDelhi getWestDelhi() {
		return westDelhi;
	}

	public void setWestDelhi(WestDelhi westDelhi) {
		this.westDelhi = westDelhi;
	}

	public SouthWestDelhi getSouthWestDelhi() {
		return southWestDelhi;
	}

	public void setSouthWestDelhi(SouthWestDelhi southWestDelhi) {
		this.southWestDelhi = southWestDelhi;
	}

	public DelhiCity getDelhi() {
		return delhi;
	}

	public void setDelhi(DelhiCity delhi) {
		this.delhi = delhi;
	}

}
