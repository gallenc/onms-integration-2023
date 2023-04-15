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
import org.opennms.integration.tmf925.openapi.model.BadRequestResponse;
import org.opennms.integration.tmf925.openapi.model.ConflictResponse;
import org.opennms.integration.tmf925.openapi.model.CreateTroubleTicketCreated;
import org.opennms.integration.tmf925.openapi.model.CreateTroubleTicketResponsePayload;
import org.opennms.integration.tmf925.openapi.model.Error;
import org.opennms.integration.tmf925.openapi.model.ForbiddenResponse;
import org.opennms.integration.tmf925.openapi.model.InternalServerErrorResponse;
import org.opennms.integration.tmf925.openapi.model.MethodNotAllowedResponse;
import org.opennms.integration.tmf925.openapi.model.UnauthorizedResponse;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for CreateTroubleTicketResponsePayload
 */
public class CreateTroubleTicketResponsePayloadExampleTest {
    private static final  org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CreateTroubleTicketResponsePayload.class);

    CreateTroubleTicketResponsePayload model = org.instancio.Instancio.of(CreateTroubleTicketResponsePayload.class).create();
    
	java.io.InputStream src = null;

	/**
	 * Modify this before method to pull in your test case
     * For your own real example message tests make sure src file path points to example data and not generated data
     * if class loader uses the test class (class.getResourceAsStream), 
     * the classloader will start search for file relative to the directory of the class
	 */
	@org.junit.jupiter.api.BeforeEach
    public void before() {
		System.out.println("before");
        // will load from classpath relative to referenced class
		//src = CreateTroubleTicketResponsePayloadExampleTest.class.getResourceAsStream("createTroubleTicketResponseExample.json"); 


        // will load from generated random data json file
        java.io.File f = new java.io.File("target/json/CreateTroubleTicketResponsePayload.json");
        try {
			src = new java.io.FileInputStream(f);
		} catch (Exception e) {
			LOG.error("cannot load test data",e);
		}
		
        Assertions.assertNotNull(src);
		
        // required to make the class work
    	CreateTroubleTicketCreated createTroubleTicketCreated = org.instancio.Instancio.of(CreateTroubleTicketCreated.class).create();
    	model.setActualInstance(createTroubleTicketCreated);
    }
    
    
    /**
    * BASIC TESTS INJECTED TO OPENAPI GENERATED CODE BY MAVEN BUILD IN TARGET DIRECTORY
    * YOU MAY NEED TO EXCLUDE GENERATED TESTS IF MODEL IS NOT POPULATED PROPERLY BY EXTANTIO
    * COPY AND MODIFY THESE TESTS IN YOUR PROJECT
    */
    
    /**
    * simple test that we can write the randomly populated json model object
    */
    @Test
    public void simpleCreateTroubleTicketResponsePayloadTest() {

        org.opennms.integration.tmf925.openapi.invoker.JSON json = new org.opennms.integration.tmf925.openapi.invoker.JSON();
        String jsonString = null;
        java.io.FileWriter fileWriter = null;
		LOG.debug("check we create a randomly populated object and serialise it to a file");
        try {
            jsonString = json.getMapper().writerWithDefaultPrettyPrinter().writeValueAsString(model);
            LOG.debug("serialised object: n" + jsonString);
            
            // putting directly in test classes because resources plugin won't see them before tests
            java.io.File f  = new java.io.File("target/json/CreateTroubleTicketResponsePayload.json");
            f.getParentFile().mkdirs(); 
            f.createNewFile();
            fileWriter = new java.io.FileWriter(f);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (Exception e) {
            LOG.error("problem serialising object",e);
        } finally {
            if (fileWriter!=null)
                try {
                    fileWriter.close();
                } catch (Exception ex) {
                }
        }
    }


	/**
	 * Model tests for CreateTroubleTicketResponsePayload with simple ObjectMapper
     * For your own real example message tests make sure src file path points to example data and not generated data
     * if class loader uses the test class (class.getResourceAsStream), 
     * the classloader will start search for file relative to the directory of the class
	 */
	@Test
	public void testModelCreateTroubleTicketResponsePayloadObjectMapper() {
		org.opennms.integration.tmf925.openapi.invoker.JSON json = new org.opennms.integration.tmf925.openapi.invoker.JSON();

		// check we can parse json file to simple json model
		LOG.debug("check we can parse example json file to simple json model");
		try {
            
            Assertions.assertNotNull(src);
			
			com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();

			com.fasterxml.jackson.databind.JsonNode rootNode = mapper.readTree(src);
			String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
			LOG.debug("simple json payload: n" + str);

            src.close();
		} catch (Exception e) {
        	LOG.error("problem parsing json example to JsonNode",e);
		} finally {
			try {
				if (src != null)
					src.close();
			} catch (Exception ex) {
			}
		}
	}
	
	@Test
	public void testModelCreateTroubleTicketResponsePayload() {
		org.opennms.integration.tmf925.openapi.invoker.JSON json = new org.opennms.integration.tmf925.openapi.invoker.JSON();

		LOG.debug("check we can parse example json file to correct model object");
		try {

            Assertions.assertNotNull(src);

			CreateTroubleTicketResponsePayload obj = json.getMapper().readValue(src, CreateTroubleTicketResponsePayload.class);

			String jsonString = null;
			jsonString = json.getMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			LOG.debug("serialised object after parsing: n" + jsonString);
		} catch (Exception e) {
        	LOG.error("problem parsing json example to model object",e);
		} finally {
			try {
				if (src != null)
					src.close();
			} catch (Exception ex) {
			}
		}
	}
   
    /**
    * TEST STUBBS CREATED BY OPENAPI GENERATOR
    */

    /**
     * Model tests for CreateTroubleTicketResponsePayload
     */
    @Test
    public void testCreateTroubleTicketResponsePayload() {
        // TODO: test CreateTroubleTicketResponsePayload
    }

    /**
     * Test the property 'statusCode'
     */
    @Test
    public void statusCodeTest() {
        // TODO: test statusCode
    }

    /**
     * Test the property 'body'
     */
    @Test
    public void bodyTest() {
        // TODO: test body
    }

}
