package com.bookstore.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
@EnableSwagger2
@EnableWebMvc
public class SpringFoxConfig {

	@Bean
    public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {

     return new OpenAPI()

          .info(new Info()

          .title("sample application API")

          .version(appVersion)

          .description(appDesciption)

          .termsOfService("http://swagger.io/terms/")

          .license(new License().name("Apache 2.0").url("http://springdoc.org")));

    }
}