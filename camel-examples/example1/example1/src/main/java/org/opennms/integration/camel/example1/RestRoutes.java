package org.opennms.integration.camel.example1;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestRoutes extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		
		System.out.println("inside routebuilder"+RestRoutes.class);
		
	    from( "direct:getUsers")
	    .log(LoggingLevel.ERROR, ">> In here ... Getting all Users");
//	    .transform()
//	    .simple("Hello ${in.body.name}")
//	    .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(200));
	    
	    from( "direct:createUser")
	    .log(LoggingLevel.ERROR, ">> In here ... Creating a User");
//	    .transform()
//	    .simple("Hello creating a user ${in.body.name}")
//	    .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(200));
	 }
}
