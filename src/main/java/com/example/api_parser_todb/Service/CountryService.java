package com.example.api_parser_todb.Service;

import com.example.api_parser_todb.Country.Country;
import com.example.api_parser_todb.Country.Translations;
import com.example.api_parser_todb.Repository.CountryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository repository;

    public int findInfoAboutCountry(String name){
        List<Country> engName= repository.findByName(name);
        List<Country> nativeName=repository.findByNativeName(name);
        System.out.println(name);
        System.out.println(engName);
        System.out.println(nativeName);
        if (!engName.isEmpty() && !nativeName.isEmpty()) return 2;
        else if (!engName.isEmpty()) return 1;
        else if (!nativeName.isEmpty()) return 0;
        else return -1;
    }

    public List<Country> findAll(){
        return repository.findAll();
    }

    public List<Country> getCountryFromDb(String name){
        System.out.println("Trying find country "+name+" from DB");
        return repository.findByName(name);
    }

    public Country getCountryFromApi(String name) throws IOException {
        System.out.println("Trying find country "+name+" from API");
        String URL = "https://restcountries-v1.p.rapidapi.com/name/"+name;
        HttpResponse<JsonNode> response = Unirest.get(URL)
                .header("x-rapidapi-host", "restcountries-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "942eafa9demsh3243ad1de4c8e4bp1fcc45jsnbcc0c8f80b66")
                .asJson();
        ObjectMapper mapper = new ObjectMapper();
        JSONArray json = response.getBody().getArray();
        Country country;
        country = mapper.readValue(json.get(0).toString(), Country.class);
        System.out.println("Found from API:" + country);
        repository.save(country);
        return country;
    }

    public Country getCountry(String name) throws IOException {
        if (getCountryFromDb(name).isEmpty())
            return getCountryFromApi(name);
        else return getCountryFromDb(name).get(0);
    }

}
