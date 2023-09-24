package br.com.parlamentolivre.parlamentolivreapp.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI api(){
        return new OpenAPI()
                .info(new Info()
                        .title("Parlamento Livre API")
                        .description("Projeto backend do APP Parlamento Livre")
                        .version("1.0")
                );
    }
}
