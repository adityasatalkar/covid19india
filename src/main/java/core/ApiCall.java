package core;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ApiCall {

    public static final String RAW_DATA_URL = "https://api.covid19india.org/raw_data.json";
    public static final String STATE_DISTRICT_WISE_URL = "https://api.covid19india.org/state_district_wise.json";
    public static final String STATE_DISTRICT_WISE_V2_URL = "https://api.covid19india.org/v2/state_district_wise.json";
    public static final String DATA_URL = "https://api.covid19india.org/data.json";

    public static String getDataFromApi(String urlString) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(urlString)
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();

        return response.body().string();
    }
}
