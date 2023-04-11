/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.opennms.integration.tmf261.camel.impl;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.model.rest.RestBindingMode;

@Component
public class RestConfiguration extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration()
            .scheme("https")
            .host("serverRoot")
            .component("servlet")
            .bindingMode(RestBindingMode.json)
                .dataFormatProperty("json.out.disableFeatures", "WRITE_DATES_AS_TIMESTAMPS")
            .clientRequestValidation(true)
            .dataFormatProperty("prettyPrint", "true")
            .contextPath("/api/v1/") 
            
            // add swagger api-doc out of the box
            .apiContextPath("/api-doc")
            .apiProperty("Trouble ticket", "User API").apiProperty("api.version", "1.2.3")
            
             //Force using relative api calls
             //The RestDSL methods don't allow empty values so .apiProperty() should be used
            .apiProperty("host", "") //by default 0.0.0.0
            .apiProperty("schemes", "" ); //by default http
            // and enable CORS
            //.apiProperty("cors", "true");
            
            ;
    }
}