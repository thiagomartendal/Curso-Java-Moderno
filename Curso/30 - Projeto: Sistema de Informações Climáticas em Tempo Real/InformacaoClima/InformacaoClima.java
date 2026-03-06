import org.json.JSONObject;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
    Compilação e execução:
    javac --module-path "./" --add-modules org.json InformacaoClima.java
    java --module-path "./" --add-modules org.json InformacaoClima
*/

public class InformacaoClima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Habilita entradas do teclado
        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine(); // Lê a cidade do teclado

        try {
            String dadosClimaticos = getDadosClimaticos(cidade); // Retorna um JSON

            // Código 1006 significa localização não encontrada
            if (dadosClimaticos.contains("\"code\":1006")) // "\"code\":1006" representa "code":1006
                System.out.println("Localização não encontrada. Tente novamente.");
            else
                imprimirDadosClimaticos(dadosClimaticos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getDadosClimaticos(String cidade) throws Exception {
        String apiKey = Files.readString(Paths.get("api-key.txt")).trim(); // A chave da API é armazenada no arquivo api-key.txt (que não é disponibilizado)

        String formataNomeCidade = URLEncoder.encode(cidade, StandardCharsets.UTF_8);
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;
        HttpRequest request = HttpRequest.newBuilder() // Começa a construção de uma nova solicitação HTTP
            .uri(URI.create(apiUrl)) // Define o URI da solicitação HTTP
            .build(); // Finaliza a construção da solicitação HTTP
        
        // Criar objeto enviar solicitação HTTP e receber respostas HTTP, para acessar o site da WeatherAPI
        HttpClient client = HttpClient.newHttpClient();

        // Agora vamos enviar requisições HTTP e receber respostas HTTP, comunicar com o site da API meteorologica
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body(); // Retorna os dados meteorológicos obtidos no site da API (WheaterApi)
    }

    // Método para imprimir os dados meteorológicos de forma organizada
    public static void imprimirDadosClimaticos(String dados) {
        // System.out.println("Dados originais (JSON) obtidos no site meteorológico " + dados);

        JSONObject dadosJson = new JSONObject(dados);
        JSONObject informacoesMeteorologicas = dadosJson.getJSONObject("current");

        // Extrair os dados da localização
        String cidade = dadosJson.getJSONObject("location").getString("name");
        String estado = dadosJson.getJSONObject("location").getString("region");
        String pais = dadosJson.getJSONObject("location").getString("country");

        // Extrai os dados adicionais
        String condicaoTempo = informacoesMeteorologicas.getJSONObject("condition").getString("text");
        int umidade = informacoesMeteorologicas.getInt("humidity");
        float velocidadeVento = informacoesMeteorologicas.getFloat("wind_kph");
        float pressaoAtmosferica = informacoesMeteorologicas.getFloat("pressure_mb");
        float sensacaoTermica = informacoesMeteorologicas.getFloat("feelslike_c");
        float temperaturaAtual = informacoesMeteorologicas.getFloat("temp_c");

        // Extrai a data e a hora da string retornada pela API
        String dataHoraString = informacoesMeteorologicas.getString("last_updated");

        // Imprime as informações atuais
        System.out.println("Informações Meteorológicas para " + cidade + ", " + estado + ", " + pais);
        System.out.println("Data e Hora: " + dataHoraString);
        System.out.println("Temperatura Atual: " + temperaturaAtual + "°C");
        System.out.println("Sensação Térmica: " + sensacaoTermica + "°C");
        System.out.println("Condição do Tempo: " + condicaoTempo);
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Velocidade do vento: " + velocidadeVento + " km/h");
        System.out.println("Pressão Atmosférica: " + pressaoAtmosferica + " mb");
    }

}
