package com.project.city.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TiffinCenterUtil {

	public static final int TIFFIN_TYPE_NORTH_INDIAN = 0;
	public static final int TIFFIN_TYPE_SOUTH_INDIAN = 1;
	
	public static final int MEAL_TYPE_VEG = 0;
	public static final int MEAL_TYPE_NON_VEG = 1;
	
	public static final int USER_INACTIVE = 0;
	public static final int USER_ACTIVE = 1;
	
	public static final int IMAGE_NOT_SHOW = 0;
	public static final int IMAGE_SHOW = 1;
	
	public static final int REVIEW_NOT_SHOW = 0;
	public static final int REVIEW_SHOW = 1;
	
	public static final int USER_NAME_DOESNT_EXIST=0;
	public static final int USER_NAME_PWD_DOESNT_MATCH=1;
	public static final int ADMIN_LOGIN_SUCCESS=2;
	
	private static void readJasonData(String url){
		String output = "";
		String data = null;
			data = getOutputFromUrl(url);
			try {

				String car = "";
				String perkm = "";
				JSONArray jsonArray = new JSONArray(data);
				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject jsonObject = jsonArray.getJSONObject(i);
					car = jsonObject.getString("car");
					perkm = jsonObject.getString("per_km");
				}

			} catch (JSONException e) {
				e.printStackTrace();
			}
	}
	
	public static String getOutputFromUrl(String url) {
		StringBuffer output = new StringBuffer("");
		try {
			InputStream stream = getHttpConnection(url);
			BufferedReader buffer = new BufferedReader(
					new InputStreamReader(stream));
			String s = "";
			while ((s = buffer.readLine()) != null)
				output.append(s);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return output.toString();
	}
	
	private static InputStream getHttpConnection(String urlString)
			throws IOException {
		InputStream stream = null;
		URL url = new URL(urlString);
		URLConnection connection = url.openConnection();

		try {
			HttpURLConnection httpConnection = (HttpURLConnection) connection;
			httpConnection.setRequestMethod("GET");
			httpConnection.connect();

			if (httpConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				stream = httpConnection.getInputStream();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return stream;
	}
}
