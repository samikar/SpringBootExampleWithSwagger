package se;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())
          //.paths(PathSelectors.ant("/controller/*")) 
          .build();                                           
    }


	private ApiInfo apiInfo() {
	    ApiInfo apiInfo = new ApiInfo(
	    	      "Spring boot JPA REST API",
	    	      "for learning purposesAPI.",
	    	      "API TOS",
	    	      "Terms of service",
	    	      "tka@puv.fi",
	    	      "MIT",
	    	      "https://opensource.org/licenses/MIT");
	    return apiInfo;
	}
}