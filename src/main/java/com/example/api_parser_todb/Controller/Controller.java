package com.example.api_parser_todb.Controller;

import com.example.api_parser_todb.Country.Country;
import com.example.api_parser_todb.Country.Translations;
import com.example.api_parser_todb.Repository.CountryRepository;
import com.example.api_parser_todb.Service.CountryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    CountryService countryService;
    @Autowired
    CountryRepository countryRepository;
    //Model model;
    @RequestMapping(path="/find",method=RequestMethod.GET)
    public String infoFromDb(Model model)throws IOException{
        System.out.println(countryRepository.findAll());
        //model.addAttribute("countries",countryRepository.findAll());
        Country country = new Country();
        model.addAttribute("country",country);
        return "find";
    }

    @RequestMapping(value = "countryNamesAutocomplete", method = RequestMethod.GET)
    @ResponseBody
    public List<String> countryNamesAutocomplete(@RequestParam(value="term",required = false, defaultValue = "")String term,Model model) {
        List<Country> countries= countryRepository.findCountriesByNameContains(term);
        System.out.println(term+" "+countries);
        List<String> suggestions=new ArrayList<>();
        for(Country country:countries){
            suggestions.add(country.toString());
        }
        model.addAttribute("suggestions",suggestions);
        return suggestions;
    }

    @RequestMapping(path="/find",method = RequestMethod.POST)
    public String  findCountry(Model model, @ModelAttribute Country country, RedirectAttributes redir) throws IOException {
        model.addAttribute("country",country);
        System.out.println("now we wanna result");
        redir.addFlashAttribute("country",country);
        System.out.println(country);
       // RedirectView redirect = new RedirectView("result");
        Country result = countryService.getCountry(country.getName());
        System.out.println(result);
        System.out.println(result.getName() + " "+ result.getNativeName());
        model.addAttribute("result",result);
        model.addAttribute("translations",result.getTranslations());
        //System.out.println(redirect.getUrl());
        return "result";
    }
/*
    @RequestMapping(value="/result",method = RequestMethod.GET)
    public String showResult(Model model, RedirectAttributes redir) throws IOException {
        redir.getFlashAttributes();
      //  Country result = countryService.getCountry(country.getName());

      //  System.out.println(result);
      //  model.addAttribute("result",result);
        System.out.println("now wanna last");
        return "result";
    }*/

    @RequestMapping(path="/request",method = RequestMethod.GET)
    public String request(Model model) throws IOException {
        HttpResponse<JsonNode> response = Unirest.get("https://restcountries-v1.p.rapidapi.com/name/Deutschland")
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
        //countryRepository.save(country);
        String name="Germany";
        System.out.println(countryService.findInfoAboutCountry(name));
        switch (countryService.findInfoAboutCountry(name)) {
            case 2: System.out.println("case 2"+ countryRepository.findByName(name)); break;
            case 1: System.out.println("case 1"+ countryRepository.findByName(name)); break;
            case 0: System.out.println("case 0 "+ countryRepository.findByNativeName(name)); break;
            case -1:countryRepository.save(country); System.out.println("case -1"); break;
        }
        return "main";
    }
}
