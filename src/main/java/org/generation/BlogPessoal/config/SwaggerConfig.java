package org.generation.BlogPessoal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

@EnableSwagger2
@Configuration
public class SwaggerConfig{
	
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.generation.BlogPessoal.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Blog Pessoal")
				.description("API REST Projeto Blog Pessoal")
				.version("1.0")
				.contact (contact())
				.build();
	}
	
	private Contact contact() {
		return new Contact ("Verônica Almenara", 
				"https://github.com/vnalmenara", 
				"Java back-end Developer");
	}
	
}
