/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.opennms.integration.tmf621.camel.api;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.LoggingLevel;

@Component
public class ListenerApiValidator extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        onException(Exception.class)
            .log(LoggingLevel.ERROR, "${exception.message}: ${exception.stacktrace}")
            .handled(true)
            .process("validationErrorProcessor");
        
        from("direct:validate-listenToTroubleTicketAttributeValueChangeEvent")
            .id("validate-listenToTroubleTicketAttributeValueChangeEvent")
            .to("bean-validator://validate-request")
            .to("direct:listenToTroubleTicketAttributeValueChangeEvent")
            .to("bean-validator://validate-response");
        
        from("direct:validate-listenToTroubleTicketCreateEvent")
            .id("validate-listenToTroubleTicketCreateEvent")
            .to("bean-validator://validate-request")
            .to("direct:listenToTroubleTicketCreateEvent")
            .to("bean-validator://validate-response");
        
        from("direct:validate-listenToTroubleTicketDeleteEvent")
            .id("validate-listenToTroubleTicketDeleteEvent")
            .to("bean-validator://validate-request")
            .to("direct:listenToTroubleTicketDeleteEvent")
            .to("bean-validator://validate-response");
        
        from("direct:validate-listenToTroubleTicketInformationRequiredEvent")
            .id("validate-listenToTroubleTicketInformationRequiredEvent")
            .to("bean-validator://validate-request")
            .to("direct:listenToTroubleTicketInformationRequiredEvent")
            .to("bean-validator://validate-response");
        
        from("direct:validate-listenToTroubleTicketResolvedEvent")
            .id("validate-listenToTroubleTicketResolvedEvent")
            .to("bean-validator://validate-request")
            .to("direct:listenToTroubleTicketResolvedEvent")
            .to("bean-validator://validate-response");
        
        from("direct:validate-listenToTroubleTicketStatusChangeEvent")
            .id("validate-listenToTroubleTicketStatusChangeEvent")
            .to("bean-validator://validate-request")
            .to("direct:listenToTroubleTicketStatusChangeEvent")
            .to("bean-validator://validate-response");
        
    }
}
