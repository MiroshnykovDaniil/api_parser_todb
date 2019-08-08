package com.example.api_parser_todb.Country;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "topLevelDomain",
        "alpha2Code",
        "alpha3Code",
        "callingCodes",
        "capital",
        "altSpellings",
        "region",
        "subregion",
        "population",
        "latlng",
        "demonym",
        "area",
        "gini",
        "timezones",
        "borders",
        "nativeName",
        "numericCode",
        "currencies",
        "languages",
        "translations",
        "relevance"
})
public class Country {

    @JsonProperty("name")
    private String name;
    @JsonProperty("topLevelDomain")
    private List<String> topLevelDomain = null;
    @JsonProperty("alpha2Code")
    private String alpha2Code;
    @JsonProperty("alpha3Code")
    private String alpha3Code;
    @JsonProperty("callingCodes")
    private List<String> callingCodes = null;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("altSpellings")
    private List<String> altSpellings = null;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("population")
    private int population;
    @JsonProperty("latlng")
    private List<Double> latlng = null;
    @JsonProperty("demonym")
    private String demonym;
    @JsonProperty("area")
    private double area;
    @JsonProperty("gini")
    private double gini;
    @JsonProperty("timezones")
    private List<String> timezones = null;
    @JsonProperty("borders")
    private List<String> borders = null;
    @JsonProperty("nativeName")
    private String nativeName;
    @JsonProperty("numericCode")
    private String numericCode;
    @JsonProperty("currencies")
    private List<String> currencies = null;
    @JsonProperty("languages")
    private List<String> languages = null;
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("relevance")
    private String relevance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Country withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("topLevelDomain")
    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    @JsonProperty("topLevelDomain")
    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public Country withTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }

    @JsonProperty("alpha2Code")
    public String getAlpha2Code() {
        return alpha2Code;
    }

    @JsonProperty("alpha2Code")
    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public Country withAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
        return this;
    }

    @JsonProperty("alpha3Code")
    public String getAlpha3Code() {
        return alpha3Code;
    }

    @JsonProperty("alpha3Code")
    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public Country withAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
        return this;
    }

    @JsonProperty("callingCodes")
    public List<String> getCallingCodes() {
        return callingCodes;
    }

    @JsonProperty("callingCodes")
    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public Country withCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
        return this;
    }

    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Country withCapital(String capital) {
        this.capital = capital;
        return this;
    }

    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() {
        return altSpellings;
    }

    @JsonProperty("altSpellings")
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public Country withAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
        return this;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public Country withRegion(String region) {
        this.region = region;
        return this;
    }

    @JsonProperty("subregion")
    public String getSubregion() {
        return subregion;
    }

    @JsonProperty("subregion")
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Country withSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    @JsonProperty("population")
    public int getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(int population) {
        this.population = population;
    }

    public Country withPopulation(int population) {
        this.population = population;
        return this;
    }

    @JsonProperty("latlng")
    public List<Double> getLatlng() {
        return latlng;
    }

    @JsonProperty("latlng")
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public Country withLatlng(List<Double> latlng) {
        this.latlng = latlng;
        return this;
    }

    @JsonProperty("demonym")
    public String getDemonym() {
        return demonym;
    }

    @JsonProperty("demonym")
    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public Country withDemonym(String demonym) {
        this.demonym = demonym;
        return this;
    }

    @JsonProperty("area")
    public double getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(double area) {
        this.area = area;
    }

    public Country withArea(double area) {
        this.area = area;
        return this;
    }

    @JsonProperty("gini")
    public double getGini() {
        return gini;
    }

    @JsonProperty("gini")
    public void setGini(double gini) {
        this.gini = gini;
    }

    public Country withGini(double gini) {
        this.gini = gini;
        return this;
    }

    @JsonProperty("timezones")
    public List<String> getTimezones() {
        return timezones;
    }

    @JsonProperty("timezones")
    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public Country withTimezones(List<String> timezones) {
        this.timezones = timezones;
        return this;
    }

    @JsonProperty("borders")
    public List<String> getBorders() {
        return borders;
    }

    @JsonProperty("borders")
    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public Country withBorders(List<String> borders) {
        this.borders = borders;
        return this;
    }

    @JsonProperty("nativeName")
    public String getNativeName() {
        return nativeName;
    }

    @JsonProperty("nativeName")
    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public Country withNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    @JsonProperty("numericCode")
    public String getNumericCode() {
        return numericCode;
    }

    @JsonProperty("numericCode")
    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public Country withNumericCode(String numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    @JsonProperty("currencies")
    public List<String> getCurrencies() {
        return currencies;
    }

    @JsonProperty("currencies")
    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    public Country withCurrencies(List<String> currencies) {
        this.currencies = currencies;
        return this;
    }

    @JsonProperty("languages")
    public List<String> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Country withLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    @JsonProperty("translations")
    public Translations getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public Country withTranslations(Translations translations) {
        this.translations = translations;
        return this;
    }

    @JsonProperty("relevance")
    public String getRelevance() {
        return relevance;
    }

    @JsonProperty("relevance")
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public Country withRelevance(String relevance) {
        this.relevance = relevance;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Country withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString(){
        return name+" "+capital+" "+population;
    }
}