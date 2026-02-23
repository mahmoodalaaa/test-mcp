package com.example.saasTemplet.mcp;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import com.example.saasTemplet.task.Task;
import com.example.saasTemplet.task.TaskRepository;

import java.util.List;

@Service

public class WeatherService {

    private final TaskRepository taskRepository;

    public WeatherService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Tool(description = "Get weather info by city name")
    public String getWeather(String city) {
        // your implementation
        return "Weather for " + city + " is sunny";
    }

    @Tool(description = "Get supported cities")
    public List<String> getSupportedCities() {
        // your implementation
        return List.of("New York", "London", "Tokyo", "Moers");
    }

    @Tool(description = "get all tasks by user name")
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }
}
