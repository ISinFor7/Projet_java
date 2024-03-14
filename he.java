import java.io.IOException;
import java.net.*;
import java.net.http.*;
		
public class he {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
			
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://spotify23.p.rapidapi.com/search/?q=Orelsan&type=multi&offset=0&limit=10&numberOfTopResults=5"))
					.header("X-RapidAPI-Key", "457e9e0b80msha6929516dacb22dp19f7c7jsnfa2724d30b71")
					.header("X-RapidAPI-Host", "spotify23.p.rapidapi.com")
					.method("GET", HttpRequest.BodyPublishers.noBody())
					.build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
	}
}