package casestudy.AdminManagementService.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


public class Config {
	@Bean
	public Docket productApi()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("casestudy.AdminManagementService"))
				.paths(PathSelectors.any())
				.build()
		        .apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Admin API Documentation",
				"API for Admin Microservice",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Aritra", "http://Youtube.com", "chatterjeearitra1234@gmail.com"),
				"API Licence",
				"http://Youtube.com",
				Collections.emptyList());
    }

}
