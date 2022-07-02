package casestudy.BookingManagementService;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License; 

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition

public class BookingManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingManagementServiceApplication.class, args);
	}
	@Bean
	public GroupedOpenApi swaggerConfig() {
		return GroupedOpenApi.builder()
			.group("Casestudy")
			.pathsToMatch("/book/**")
			.build();
	}

	@Bean
	public OpenAPI swaggerApiInfoConfig(){
		return new OpenAPI()
		.info(new Info()
		.title("Flight Booking System")
		.description("Booking Application")
		.version("v0.0.7")
		.license(new License().name("GitHub").url("http://github.com/aritrachatterjee99")));
	}
	
}
