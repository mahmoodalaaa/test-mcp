package com.example.saasTemplet.mcp;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Tool(description = "Get weather info by city name")
    public String getWeather(String city) {
        // your implementation
        return "Weather for " + city + " is sunny";
    }
}
