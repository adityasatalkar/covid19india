package process_data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RawData {

	@SerializedName("raw_data")
	@Expose
	private List<RawDatum> rawData = null;

	public List<RawDatum> getRawData() {
		return rawData;
	}

	public void setRawData(List<RawDatum> rawData) {
		this.rawData = rawData;
	}

}