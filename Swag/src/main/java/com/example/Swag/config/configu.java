package com.example.Swag.config;

import com.swagger.client.codegen.rest.api.UserControllerApi;
import com.swagger.client.codegen.rest.invoker.ApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    public class configu {

        @Value("${User.profile.host.uri}")
        private String hostInfoBasePath;


        @Bean
        public ApiClient apiClient() {
            return new ApiClient().setBasePath( hostInfoBasePath);
        }

        @Bean
        public UserControllerApi productControllerApi(ApiClient apiClient) {
           return new UserControllerApi(apiClient);
    }
    }

