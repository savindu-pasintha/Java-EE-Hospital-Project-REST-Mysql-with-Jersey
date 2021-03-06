package connectRestServer;

import java.io.IOException;
import java.sql.SQLException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ConnectinServer {
	public static final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("text/x-markdown; charset=utf-8");
	private final OkHttpClient client = new OkHttpClient();
	private String httpUrl = "http://localhost:8080/HospitalRestServer/webapi/database";

	// whenAsynchronousGetRequest_thenCorrect
	//see web site https://square.github.io/okhttp/recipes/#posting-a-string-kt-java
	
	/*
	 * Request request = new Request.Builder()
	 * .url("https://api.github.com/repos/square/okhttp/issues")
	 * .header("User-Agent", "OkHttp Headers.java") .addHeader("Accept",
	 * "application/json; q=0.5") .addHeader("Accept",
	 * "application/vnd.github.v3+json") .build();
	 */
	public void getDatat() {
		Request request = new Request.Builder().url(httpUrl).build();
		String d = null;
		Call call = client.newCall(request);
		call.enqueue(new Callback() {
			public void onResponse(Call call, Response response) throws IOException {
				System.out.print(response.body().string());
			}

			public void onFailure(Call call, IOException e) {
				System.out.print(e.toString());
			}
		});

	}

	public void postData() throws Exception {

		String postBody = "";

		@SuppressWarnings("deprecation")
		Request request = new Request.Builder().url(httpUrl+"/message").post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postBody)).build();

		try (Response response = client.newCall(request).execute()) {
			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			else {
				System.out.println(response.body().string());
			}
			
		}
	}
	
	public void postDataabc() throws Exception {

		String postBody = "" + "Releases\n" + "--------\n" + "\n" + " * _1.0_ May 6, 2013\n"
				+ " * _1.1_ June 15, 2013\n" + " * _1.2_ August 11, 2013\n";

		@SuppressWarnings("deprecation")
		Request request = new Request.Builder().url(httpUrl+"/abc").post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postBody)).build();

		try (Response response = client.newCall(request).execute()) {
			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			else {
				System.out.println(response.body().string());
			}
			
		}
	}
	
	public void postLogin() throws Exception {

		String postBody = "savindu/pasintha";

		@SuppressWarnings("deprecation")
		Request request = new Request.Builder().url(httpUrl+"/login/"+postBody).post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postBody)).build();

		try (Response response = client.newCall(request).execute()) {
			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			else {
				System.out.println(response.body().string());
			}
			
		}
	}
	
	public void postRegistration() throws Exception {

		String postBody = "savindu/pasintha";

		@SuppressWarnings("deprecation")
		Request request = new Request.Builder().url(httpUrl+"/registartion/"+postBody).post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postBody)).build();

		try (Response response = client.newCall(request).execute()) {
			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			else {
				System.out.println(response.body().string());
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		new ConnectinServer().getDatat();
		new ConnectinServer().postData();
		new ConnectinServer().postDataabc();
		new ConnectinServer().postLogin();
	}

	
}
