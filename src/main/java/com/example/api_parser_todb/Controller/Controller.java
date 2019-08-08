package com.example.api_parser_todb.Controller;

import com.example.api_parser_todb.Country.Country;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.DataInput;
import java.io.IOException;

@org.springframework.stereotype.Controller
public class Controller {


    @RequestMapping(path="/request",method = RequestMethod.GET)
    public String request(Model model) throws IOException {
        HttpResponse<JsonNode> response = Unirest.get("https://restcountries-v1.p.rapidapi.com/name/norge")
                .header("x-rapidapi-host", "restcountries-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "942eafa9demsh3243ad1de4c8e4bp1fcc45jsnbcc0c8f80b66")
                .asJson();
        System.out.println(0);
        System.out.println(response.getBody());
        System.out.println(1);
        ObjectMapper mapper = new ObjectMapper();
        JSONArray json = response.getBody().getArray();
        System.out.println(json);
        System.out.println(json.get(0));
        Country country;
        country = mapper.readValue(json.get(0).toString(), Country.class);
        System.out.println(country.toString());
        return "main";
    }
}
