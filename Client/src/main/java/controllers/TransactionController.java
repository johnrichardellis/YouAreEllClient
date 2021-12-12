package controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Id;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.util.List;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
    private MessageController msgCtrl;
    private IdController idCtrl;
    private OkHttpClient client;
    private ObjectMapper objectMapper;

    public TransactionController(MessageController m, IdController j) {
        this.msgCtrl = m;
        this.idCtrl = j;
        this.client = new OkHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public String sendGetRequest(String url) {
        Request request = new Request.Builder()
                .url(rootURL+url)
                .build();

        try{
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public String getCalls(String url) {
        String responseBody = sendGetRequest(url);

        if(url.equalsIgnoreCase("/ids")) {

           try {
               idCtrl.setAllIds(objectMapper.readValue(responseBody, new TypeReference<List<Id>>() {
            })); }
           catch (Exception e) {
               e.printStackTrace();
           }
        }

        return idCtrl.getAllIds().toString();

    }

    public List<Id> getIds() {
        return null;
    }
    public String postId(String idtoRegister, String githubName) {
        Id tid = new Id(idtoRegister, githubName);
        tid = idCtrl.postId(tid);
        return ("Id registered.");
    }

    public String makecall(String s, String get, String s1) {
        return "";
    }
}
