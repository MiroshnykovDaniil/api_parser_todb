package com.example.api_parser_todb.Repository;

import com.example.api_parser_todb.Country.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {
    List<Country> findByName(String name);
    List<Country> findByNativeName(String name);

    @Override
    <S extends Country> S save(S s);
}
