package com.example.api_parser_todb.Service;

import com.example.api_parser_todb.Country.Country;
import com.example.api_parser_todb.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if (engName!=null && nativeName!=null) return 2;
        else if (engName!=null) return 1;
        else if (nativeName!=null) return 0;
        else return -1;
    }
}
