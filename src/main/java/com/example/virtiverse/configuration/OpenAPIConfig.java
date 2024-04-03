package com.example.virtiverse.configuration;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("SpringDoc")
                .description("PiDev")
                .contact(contactAPI());
    }
    public Contact contactAPI() {
        Contact contact = new Contact().name("Virtiverse")
                .email("Khalil.belhedi@esprit.tn")
                .url("https://www.linkedin.com/in/**********/");
        return contact;
    }


    @Bean
    public GroupedOpenApi avisApi() {
        return GroupedOpenApi.builder()
                .group("Only avis Management API")
                .pathsToMatch("/Avis/**")
                .pathsToExclude("**")
                .build();
    }

    @Bean
    public GroupedOpenApi covoiturageApi() {
        return GroupedOpenApi.builder()
                .group("Only Covoiturage Management API")
                .pathsToMatch("/Covoiturage/**")
                .pathsToExclude("**")
                .build();
    }

}
