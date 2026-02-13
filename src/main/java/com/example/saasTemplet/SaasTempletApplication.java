package com.example.saasTemplet;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.saasTemplet.mcp.WeatherService;

@SpringBootApplication
public class SaasTempletApplication {

	// npx @modelcontextprotocol/inspector@0.19.0

	public static void main(String[] args) {
		SpringApplication.run(SaasTempletApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider weatherTools(WeatherService svc) {

		return MethodToolCallbackProvider.builder()
				.toolObjects(svc)
				.build();
	}

}
