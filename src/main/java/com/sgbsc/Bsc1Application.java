package com.sgbsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * This is a @Controller for two static webpages.
 * 
 * In Spring, a Controller is a class which is responsible for preparing 
 * a model Map with data to be displayed by the view as well as choosing 
 * the right view itself. It can also directly write into response stream 
 * by using @ResponseBody annotation and complete the request.
 * 
 * If we were writing a RESTful application, we'd use @RestController
 * which is a convenience controller meaning @Controller + @ResponseBody.
 * 
 * This application just returns two pages: 
 * 
 * index.html
 * - sent back automatically by the DispatcherServlet
 * - auto-configured by Spring Boot upon seeing @SpringBootApplication
 *   and Web starter in pom.xml. 
 * - It looks for an index.html, and css under the static resources folder.
 *   
 * hello-template.html
 * - Spring Boot notices thymeleaf starter in pom.xml and  
 * - Spring's RequestMappingHandlerMapping is used to maintain the mapping of the 
 *   request URI to the handler (which are the controller methods annotated with the
 *   @RequestMapping annotation). Once the handler is obtained, the DispatcherServlet 
 *   dispatches the request to the appropriate handler adapter.
 */

@SpringBootApplication
@Controller
public class Bsc1Application {

	@RequestMapping("/hello-template")
	public String helloTemplate() {
		return "hello-template";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Bsc1Application.class, args);
	}
}
