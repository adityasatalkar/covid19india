package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ManipurDistrictData {

	@SerializedName("Imphal West")
	@Expose
	private ImphalWest imphalWest;

	public ImphalWest getImphalWest() {
		return imphalWest;
	}

	public void setImphalWest(ImphalWest imphalWest) {
		this.imphalWest = imphalWest;
	}

}
