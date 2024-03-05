package com.browserstack.junit.Utils;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A Utility class for HTTP calls
 * @author venkatesh
 * @since 2024-03-04
 */
public class RestUtils {

    private static String REST_URL="https://upload-observability.browserstack.com/upload";
    public static final String AUTOMATE_USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");

    /**
     *
     * @param file-File to be uploaded to Test Observavbility
     * @param params-All parameters to be sent with the HTTP Request
     * @return HttpResponse in the JsonNode format
     * @throws UnirestException
     */
    public static HttpResponse<JsonNode> uploadResults(File file, HashMap<String,Object> params) throws UnirestException {

    Map<String, String> headers = new HashMap<>();
    headers.put("accept", "application/json");

    Map<String, Object> fields = new HashMap<>();
    fields=params;
    fields.put("data", file);

        System.out.println("Following are the junit upload parameters used!!");
        for (Map.Entry<String,Object> entry: fields.entrySet()) {

            System.out.println("param name => "+entry.getKey()+"; Value => "+entry.getValue());
        }



    HttpResponse<JsonNode> jsonResponse
            = Unirest.post(REST_URL)
            .basicAuth(AUTOMATE_USERNAME,AUTOMATE_KEY)
            .headers(headers)
            .fields(fields)
            .asJson();

    return jsonResponse;
}

}
