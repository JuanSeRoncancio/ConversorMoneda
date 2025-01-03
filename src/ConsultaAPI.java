import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaAPI {

    public ConversionResult busqueda(String primerMoneda, String segundaMoneda, Double amount){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/25f418b69ec7c2e893d94f43/pair/"+primerMoneda+"/"+segundaMoneda+"/"+amount);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConversionResult.class);

        } catch (Exception e) {
            throw new RuntimeException("No se pudo convertir el monto.");
        }
    }




}
