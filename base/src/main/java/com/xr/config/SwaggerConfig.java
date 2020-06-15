package com.xr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xr"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        //页面标题
        return new ApiInfoBuilder().title("Spring Boot中使用Swagger2构建RESTful APIs").description("风廉政建设平台系统").termsOfServiceUrl("http://localhost/bos/swagger-ui.html").version("1.0").build();
    }
}
