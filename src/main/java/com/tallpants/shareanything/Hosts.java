package com.tallpants.shareanything;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Hosts {
  public static URL imgur(File file) throws UnirestException {
    String imgurClientID = "9c65f969001905d";
    HttpResponse<JsonNode> response = Unirest.post("https://api.imgur.com/3/image")
      .header("authorization", "Client-ID " + imgurClientID)
      .field("image", file)
      .asJson();

    JSONObject obj = response.getBody().getObject();

    try {
      return new URL(obj.getJSONObject("data").getString("link"));
    } catch (MalformedURLException e) {
      return null;
    }
  }
}