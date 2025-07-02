package com.mattswart.generalmockservice.controller;

import com.mattswart.generalmockservice.dto.openweather.OpenWeatherResponse;
import com.mattswart.generalmockservice.dto.openweather.OpenWeatherMainData;
import com.mattswart.generalmockservice.service.OpenWeatherAPIMockService;
import com.mattswart.generalmockservice.dto.openweather.GeoCityDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/openweatherapi/v1")
public class OpenWeatherAPIMockController {
    @Autowired
    private OpenWeatherAPIMockService openWeatherAPIMockService;

    @GetMapping("/health")
    public String healthCheck() {
        return "{\"Status\":\"OK\", \"Message\":\"Real-Time Weather Service is running!\"}";
    }

    @GetMapping("/direct")
    public GeoCityDetails[] getCityDetails(@RequestParam String q, @RequestParam Integer limit, @RequestParam String appid) {
        var cities = new GeoCityDetails[1];
        cities[0] = new GeoCityDetails(q, new HashMap<String, String>(), 0.0, 0.0, q, "UNK");
        return cities;
    }

    //.uri("/weather?lat={lat}&lon={lon}&units=metric&appid={openWeatherMapApiKey}", lat, lon, openWeatherMapApiKey)
    @GetMapping("/weather")
    public OpenWeatherResponse getCityWeatherDetails(@RequestParam Double lat, @RequestParam Double lon, @RequestParam String units, @RequestParam String appid) {
        var response = createOpenWeatherResponse();

        return response;
    }

    private OpenWeatherResponse createOpenWeatherResponse() {
        OpenWeatherResponse response = new OpenWeatherResponse(
                null,
                new ArrayList<>(),
                "stations",
                new OpenWeatherMainData(20.5, 10.12, 15.5, 25.5, 0, 0, 0, 0),
                10000,
                null,
                null,
                null,
                (System.currentTimeMillis() / 1000),
                null,
                0,
                0,
                "Mock City",
                200);

        return response;
    }

}
