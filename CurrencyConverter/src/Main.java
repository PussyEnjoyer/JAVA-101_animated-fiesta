import java.net.*;
import java.util.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Main {
	

	public static void main(String[] args) throws IOException, InterruptedException {

		//Tworzymy request do strony z danymi 
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        		//Tu podajemy URL storny z kluczem (Klucz był darmowy)
                .uri(URI.create("https://v6.exchangerate-api.com/v6/6427a64d98991b526ef20dcf/latest/USD"))
                .build();
        //Ustalamy format otrzymajen odpowiedzi i wysyłąmy zapytanie
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        //response zamieniamy na zwykłego stringa aaby było prościej wykonywać na nim działania
        String RES = response.body();
        //response można odczytać łatwej przy pomocy JSON 
        //ale uznałem że trzymam się czysto JAVA'y
        //Wyszukujemy indeks poszukiwanej waluty
        int CONPosistion = RES.indexOf("PLN");
        //wycinamy przelicznik ze stringa i wyświetlamy go
        String CONChar = RES.substring(CONPosistion+5, CONPosistion+11);
        System.out.print("Aktualny przelicznik USD na PLN wynosi "+CONChar);
        //Self Note: dodać opcje wyboru typu case albo switch
  
       
	}
}
