package weatherAPI;
import java.net.*;
import java.io.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class WeatherAPI {
    public static void main(String[] args) throws IOException {

        String apiKey = "260e6bee97msh5ee7d438ff5eb1ep168da0jsn22275b650d7d"; // replace with your OpenWeatherMap API key
        String city = "New York"; // replace with the city you want to get weather data for

        try {
            // Construct the API endpoint URL
            URL url = new URL("rapidapi.com" + city + "&appid=" + apiKey);

            // Create an HTTP client to send the request
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Send the request and receive the response
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HTTP error code: " + responseCode);
            }

            // Parse the response
            Scanner scanner = new Scanner(url.openStream());
            String response = scanner.useDelimiter("\\Z").next();
            scanner.close();

            System.out.println("Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
