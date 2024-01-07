package com.provaipog.todolist.core.springdoc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info()
                    .title("API de Tarefas")
                    .version("v1")
                    .description("API REST completa para gerenciamento de tarefas," +
                            " permitindo a criação, atualização, " +
                            "exclusão, marcação como concluída/pendente e " +
                            "listagem de tarefas com filtros (todas, específicas e pendentes).")
                    .license(new License()
                            .name("MIT License")
                            .url("https://mit-license.org/")
                    )
            );
        }
}
