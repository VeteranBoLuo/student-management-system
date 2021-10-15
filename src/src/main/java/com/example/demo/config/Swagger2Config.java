package com.example.demo.config;

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
/**
 * 访问localhost:8080/doc.html即可查看项目的swagger文档
 * */
public class Swagger2Config {

    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("用户管理平台")
                .description("用户管理后台api接口文档")
                .termsOfServiceUrl("127.0.0.1:8080") //根据本机端口配置
                .version("1.0")
                .build();
    }

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("后端")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")) //api包路径
                .paths(PathSelectors.any()) //api的path
                .build();
    }


}
