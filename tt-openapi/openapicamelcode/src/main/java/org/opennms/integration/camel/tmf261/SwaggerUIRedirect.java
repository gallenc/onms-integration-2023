package org.opennms.integration.camel.tmf261;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class SwaggerUIRedirect {
    // Redirect to access swagger UI via short URL from "/swagger-ui" to "/swagger-ui/index.html?url=/api/swagger&validatorUrl="
    @Controller
    class SwaggerWelcome {
    	
        @RequestMapping("/swagger-ui")
        public String redirectToUi() {
            return "redirect:/webjars/swagger-ui/index.html?url=/api/v1/api-doc";
        }
        
        @RequestMapping("/")
        public String redirectToUi2() {
            return "redirect:/webjars/swagger-ui/index.html?url=/api/v1/api-doc";
        }
    }
}