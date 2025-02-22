package com.example.backendone.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    public WebClient getWebClient() {
        return WebClient
            .builder()
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON.toString())
            .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON.toString())
            .build();
    }

    @Bean
    @LoadBalanced
    public WebClient.Builder serviceWebClient() {
        return WebClient.builder();
    }
}
