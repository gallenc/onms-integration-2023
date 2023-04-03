package org.opennms.integration.camel.tmf261;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@ComponentScan(basePackages = "org.opennms.integration.tmf621.camel.api;"
//		+ "org.opennms.integration.tmf621.camel.model;"
//		+ "org.opennms.integration.camel.tmf261")
public class MySpringBootApplication {

    /**
     * A main method to start this application.
     */
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }

}
