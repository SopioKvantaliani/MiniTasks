package weatherAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {

        String country = "New York";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dark-sky.p.rapidapi.com/%7Blatitude%7D,%7Blongitude%7D?units=auto&lang=en"))
                .header("X-RapidAPI-Key", "260e6bee97msh5ee7d438ff5eb1ep168da0jsn22275b650d7d")
                .header("X-RapidAPI-Host", "dark-sky.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
