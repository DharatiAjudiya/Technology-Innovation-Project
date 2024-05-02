package com.project.floodriskmanagementsystem;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class TestFlood {
    public static void main(String[] args) throws IOException {

        String originalInput = "Dharati:Dharati";
        String credentials = Base64.getEncoder().encodeToString(originalInput.getBytes());
        final String POST_PARAMS = "Replace this string with your JSON request string";

        URL obj = new URL("https://gatiosoft.ro/flooderizer.aspx");
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");
        postConnection.setRequestProperty("Authorization", "Basic " + credentials);
        postConnection.setRequestProperty("Content-Type", "application/json");
        postConnection.setRequestProperty("Accept", "application/json");
        postConnection.setDoOutput(true);
        OutputStream os = postConnection.getOutputStream();
        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();
        int responseCode = postConnection.getResponseCode();

        if (responseCode == 200) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    postConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();
            // print json string result
            System.out.println(response.toString());
        }
        else {
            System.out.println("POST NOT WORKED");
        }
    }
}
