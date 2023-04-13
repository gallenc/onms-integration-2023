/*
 * Trouble Ticke AsyncAPI
 * **TMF API Reference : TMF - 621 Trouble Ticket**\\n\\n**Release : 19.0 - June 2019**\\n\\nThe Trouble Ticket API provides a standardized client interface to Trouble Ticket Management Systems for creating, tracking and managing trouble tickets as a result of an issue or problem identified by a customer or another system. \\nExamples of Trouble Ticket API originators (clients) include CRM applications, network management or fault management systems, or other Trouble Ticket management systems (e.g. B2B).\\n\\nThe API supports the ability to send requests to create a new trouble ticket specifying the nature and severity of the trouble or issue as well as all necessary related information. The API also includes mechanisms to search for and update existing trouble tickets. Notifications are defined to provide information when a trouble ticket has been updated, including status changes. A basic set of states of a trouble ticket has been specified (as an example) to handle trouble ticket lifecycle management.\\nTrouble Ticketing API manages trouble ticket resource:\\n\\n  -\\tA trouble ticket represents a record, or an issue raised by requestor that need to be solved, used for reporting and managing the resolution of problems, incidents or request -\\tMain trouble ticket attributes are its description, severity, type, related dates (creation, expected resolution, resolution), state and related information (change reason and change date), related parties (originator, owner, reviser, etc.), related entities (product, product order, customer bill) and notes Trouble Ticket API performs the following operations on trouble ticket -\\tRetrieval of a trouble ticket or a collection of trouble ticket depending on filter criteria -\\tPartial update of a trouble ticket -\\tCreation of a trouble ticket -\\tNotification of events on trouble ticket: o\\tTrouble ticket state change o\\tTrouble ticket change o\\tTrouble ticket resoled o\\tTrouble ticket created o\\tTrouble ticket Information required\\n\\n\\n\\nCopyright © TM Forum 2019. All Rights Reserved\\n\\n\\n
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: info@tmforum.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.opennms.integration.tmf925.openapi.api.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.JsonNode;

import org.opennms.integration.tmf925.openapi.invoker.JSON;
import org.opennms.integration.tmf925.openapi.model.CreateTroubleTicketRequestPayload;
import org.opennms.integration.tmf925.openapi.model.TroubleTicketCreate;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.instancio.Instancio;

/**
 * Model tests for CreateTroubleTicketRequestPayload
 */
public class CreateTroubleTicketRequestPayloadTest {
	private final CreateTroubleTicketRequestPayload model = new CreateTroubleTicketRequestPayload();

	/**
	 * Model tests for CreateTroubleTicketRequestPayload
	 */
	@Test
	public void testCreateTroubleTicketRequestPayload() {

		// TODO: test CreateTroubleTicketRequestPayload
		JSON json = new JSON();

		InputStream src = null;

		// check we can parse to json model
		try {
			src = CreateTroubleTicketRequestPayloadTest.class.getResourceAsStream("createTroubleTicketRequest.json");

			ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

			JsonNode rootNode = mapper.readTree(src);
			String str = mapper.writeValueAsString(rootNode);
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (src != null)
					src.close();
			} catch (Exception ex) {
			}
		}

		try {
			src = CreateTroubleTicketRequestPayloadTest.class.getResourceAsStream("createTroubleTicketRequest.json");

			CreateTroubleTicketRequestPayload obj = json.getMapper().readValue(src,
					CreateTroubleTicketRequestPayload.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jsonString = null;
		try {
			jsonString = json.getMapper().writeValueAsString(model);
			System.out.println("serialised object: " + jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (src != null)
					src.close();
			} catch (Exception ex) {
			}
		}

	}

	/**
	 * Test the property 'body'
	 */
	@Test
	public void bodyTest() {
		//CreateTroubleTicketRequestPayload model = new CreateTroubleTicketRequestPayload();
		//TroubleTicketCreate body = new TroubleTicketCreate();
		//body.setExternalId(UUID.randomUUID().toString());
		//model.setBody(body);
		
		CreateTroubleTicketRequestPayload model = org.instancio.Instancio.of(CreateTroubleTicketRequestPayload.class).create();
		
		JSON json = new JSON();

		String jsonString = null;
		try {
			jsonString = json.getMapper().writerWithDefaultPrettyPrinter().writeValueAsString(model);
			System.out.println("serialised object: " + jsonString);
			
			CreateTroubleTicketRequestPayload obj = json.getMapper().readValue(jsonString,	CreateTroubleTicketRequestPayload.class);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
