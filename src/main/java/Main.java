import httpClient.HttpClient;
import jsonParser.CatFact;
import jsonParser.JsonParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient();
        JsonParser jsonParser = new JsonParser();
        String response = httpClient.getHttpResponse();
        List<CatFact> facts = jsonParser.getObjectsList(response);
        for(CatFact fact : facts) {
            System.out.println("--> " + fact);
        }
    }
}
