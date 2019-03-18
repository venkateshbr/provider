package com.ishirock.healthcare.provider.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.ishirock.healthcare.provider.model.NPIProvider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/npi")
public class NPIProviderController {

    @GetMapping
    public List<NPIProvider> listProviders() {
        RestTemplate restTemplate = new RestTemplate();
        final String uri = "https://npiregistry.cms.hhs.gov/api/?version=2.1&city=baltimore";
        Object result = restTemplate.getForObject(uri, Object.class);

        Gson gson = new Gson();

        String jsonString = gson.toJson(result);
        System.out.println("JSON String " + jsonString);

        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(jsonString).getAsJsonObject();

        JsonArray jsonArray = jsonObject.getAsJsonArray("results");

        List<NPIProvider> providerList = new ArrayList<NPIProvider>();

        Type providerListType = new TypeToken<ArrayList<NPIProvider>>() {
        }.getType();

        providerList = gson.fromJson(jsonArray, providerListType);

        return providerList;
    }

    @PostMapping
    public List<NPIProvider> find(@RequestBody String provider) {
        System.out.println(" input " + provider);
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonObject jObject = parser.parse(provider).getAsJsonObject();
        String number = jObject.get("number").getAsString();
        String name = jObject.get("name").getAsString();
        String city = jObject.get("city").getAsString();
        String pin = jObject.get("pin").getAsString();

        String uri = "https://npiregistry.cms.hhs.gov/api/?version=2.1&number=" + number + "&city=" + city
                + "&first_name=" + name + "&postal_code=" + pin;
        System.out.println("URI = " + uri);
        RestTemplate restTemplate = new RestTemplate();
        Object result = restTemplate.getForObject(uri, Object.class);

        String jsonString = gson.toJson(result);
        JsonObject jsonObject = parser.parse(jsonString).getAsJsonObject();

        JsonArray jsonArray = jsonObject.getAsJsonArray("results");

        List<NPIProvider> providerList = new ArrayList<NPIProvider>();

        Type providerListType = new TypeToken<ArrayList<NPIProvider>>() {
        }.getType();

        providerList = gson.fromJson(jsonArray, providerListType);

        return providerList;
    }

}