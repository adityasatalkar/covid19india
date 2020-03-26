package core;

import api.Data;
import com.districtwise.DistrictWise;
import com.districtwise.RawData;
import com.districtwise.RawDatum;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.List;

public class ApiCall {

    private static final String URL = "https://api.covid19india.org/raw_data.json";

    public static List<RawDatum> getRawData() throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(URL)
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        String jsonString = response.body().string();

        RawData rawDataObject = gson.fromJson(jsonString, RawData.class);
        List<RawDatum> rawDatumList = rawDataObject.getRawData();

        return rawDatumList;
    }

    public static DistrictWise getDistrictWise() throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.covid19india.org/state_district_wise.json")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        String jsonString = response.body().string();

        //System.out.println(jsonString);
        DistrictWise districtWiseObject = gson.fromJson(jsonString, DistrictWise.class);

        return districtWiseObject;
    }

    public static Data getData() throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.covid19india.org/data.json")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        String jsonString = response.body().string();

        //System.out.println(jsonString);
        Data dataObject = gson.fromJson(jsonString, Data.class);

        return dataObject;
    }
}
