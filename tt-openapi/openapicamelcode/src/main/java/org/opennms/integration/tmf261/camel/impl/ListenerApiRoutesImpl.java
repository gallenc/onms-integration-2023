/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.opennms.integration.tmf261.camel.impl;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.LoggingLevel;
import org.opennms.integration.tmf621.camel.model.*;
import org.apache.camel.model.dataformat.JsonLibrary;

@Component
public class ListenerApiRoutesImpl extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        
        /**
        POST /listener/troubleTicketAttributeValueChangeEvent : Client listener for entity TroubleTicketAttributeValueChangeEvent
        **/
        from("direct:listenToTroubleTicketAttributeValueChangeEvent")
            .id("listenToTroubleTicketAttributeValueChangeEvent")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}")
            .setBody(constant("{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }"))
            .unmarshal().json(JsonLibrary.Jackson, EventSubscription.class);
        /**
        POST /listener/troubleTicketCreateEvent : Client listener for entity TroubleTicketCreateEvent
        **/
        from("direct:listenToTroubleTicketCreateEvent")
            .id("listenToTroubleTicketCreateEvent")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}")
            .setBody(constant("{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }"))
            .unmarshal().json(JsonLibrary.Jackson, EventSubscription.class);
        /**
        POST /listener/troubleTicketDeleteEvent : Client listener for entity TroubleTicketDeleteEvent
        **/
        from("direct:listenToTroubleTicketDeleteEvent")
            .id("listenToTroubleTicketDeleteEvent")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}")
            .setBody(constant("{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }"))
            .unmarshal().json(JsonLibrary.Jackson, EventSubscription.class);
        /**
        POST /listener/troubleTicketInformationRequiredEvent : Client listener for entity TroubleTicketInformationRequiredEvent
        **/
        from("direct:listenToTroubleTicketInformationRequiredEvent")
            .id("listenToTroubleTicketInformationRequiredEvent")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}")
            .setBody(constant("{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }"))
            .unmarshal().json(JsonLibrary.Jackson, EventSubscription.class);
        /**
        POST /listener/troubleTicketResolvedEvent : Client listener for entity TroubleTicketResolvedEvent
        **/
        from("direct:listenToTroubleTicketResolvedEvent")
            .id("listenToTroubleTicketResolvedEvent")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}")
            .setBody(constant("{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }"))
            .unmarshal().json(JsonLibrary.Jackson, EventSubscription.class);
        /**
        POST /listener/troubleTicketStatusChangeEvent : Client listener for entity TroubleTicketStatusChangeEvent
        **/
        from("direct:listenToTroubleTicketStatusChangeEvent")
            .id("listenToTroubleTicketStatusChangeEvent")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}")
            .setBody(constant("{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }"))
            .unmarshal().json(JsonLibrary.Jackson, EventSubscription.class);
    }
}