package httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class HttpClient {
    //Запрос для получения инфомации
    private final String GET_URI_RQ = "https://cat-fact.herokuapp.com/facts";
    /**
     * Настройка httpClient:
     * максимальное время ожидание подключения к серверу: 5000
     * максимальное время ожидания получения данных: 30000
     * возможность следовать редиректу в ответе: false
     * @return настроенный объект CloseableHttpClient
     */
    protected CloseableHttpClient configHttp() {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                    .setConnectTimeout(5000)
                    .setSocketTimeout(30000)
                    .setRedirectsEnabled(false)
                    .build())
                .build();
        return httpClient;
    }
    /**
     * Получение response на GET-request.
     * Извлечение JSON из response body в строку.
     * @return строка JSON объектов
     */
    public String getHttpResponse() {
        String bodyRs = null;
        CloseableHttpClient httpClient = configHttp();
        HttpGet request = new HttpGet(GET_URI_RQ);
        try(CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            bodyRs = EntityUtils.toString(entity);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return bodyRs;
    }

}
