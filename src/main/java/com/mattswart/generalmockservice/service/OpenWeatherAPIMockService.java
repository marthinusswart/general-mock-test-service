package com.mattswart.generalmockservice.service;

import org.springframework.stereotype.Service;

@Service
public class OpenWeatherAPIMockService {

    /***
    public RTWCityWeather getCurrentWeatherByCity(String cityName, String countryCode) {
        GeoCityDetails cityDetails = geocodingApiClient.getCityDetails(cityName, countryCode);
        OpenWeatherResponse openWeatherDetails = openWeatherApiClient.getCityDetails(cityDetails.lat(), cityDetails.lon());
        RTWCityWeather cityWeather = new RTWCityWeather(cityName, countryCode, openWeatherDetails.main().temp());
        return cityWeather;
    }
    */

}
