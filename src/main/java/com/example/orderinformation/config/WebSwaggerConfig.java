package com.example.orderinformation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class WebSwaggerConfig {
    private static final String API_NAME = "Spring 백엔드 대규모 데이터처리 성능개선";
    private static final String API_VERSION = "1.0.0";
    private static final String API_DESCRIPTION = "BE: 안성재, 강창식, 강진구, 이승우";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any()) // any: 모든 로직에 대해 Swagger 문서화가 수행
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(API_NAME)
                .version(API_VERSION)
                .description(API_DESCRIPTION)
                .contact(new Contact("gloryteam", "https://github.com/productOrderInfo-Project/gloryteam","ccc132132@gmail.com"))
                .build();
    }

}
