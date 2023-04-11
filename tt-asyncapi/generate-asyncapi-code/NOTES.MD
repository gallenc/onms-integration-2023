
## Swagger doesnt support oneof

openapi lots of discussion.

https://github.com/OpenAPITools/openapi-generator/pull/4785  ONE OFSUPPORT FOR JACKSON CLIENTS

https://github.com/OpenAPITools/openapi-generator/pull/5120  oneOf support for jackson clients  merged

https://github.com/joelittlejohn/jsonschema2pojo/issues/392


https://github.com/asyncapi/jasyncapi/issues/22  Is the keyword oneOf supported

https://hackernoon.com/event-driven-architecture-automatic-dto-generation-from-event-documentation  shows how to used discriminator

schema object discriminitor https://www.asyncapi.com/docs/reference/specification/v2.0.0#schemaObject


https://github.com/asyncapi/java-spring-template/issues/251   oneOf is not working in message asyncAPI: 2.3.0#251   THIS IS THE KEY ISSUE IN  java-spring-template

in jasyncapi (java to asyncapi converter ) https://github.com/asyncapi/jasyncapi/issues/22


spec https://www.asyncapi.com/docs/reference/specification/v2.0.0   A definition of the message that will be published or received on this channel. oneOf is allowed here to specify multiple messages, however, a message MUST be valid only against one of the referenced message objects.


some stuff on OpenAPI code gen https://community.smartbear.com/t5/Swagger-Open-Source-Tools/Swagger-OpenAPI-Code-Gen-quot-oneOf-quot-How-to-generate-correct/td-p/233363


Fern - alternative code generator to openapi https://github.com/fern-api/fern
claims to do a bbetter job

https://phil.tech/2018/openapi-and-json-schema-divergence/ 
long discussion


node js template one-of messages https://github.com/asyncapi/nodejs-template/pull/82

some discussion of howjackson can handle this 
https://hackernoon.com/event-driven-architecture-automatic-dto-generation-from-event-documentation


https://json-schema.org/implementations.html#code-generation


## jsonschema2pojo is a great library but doesn't do oneof

https://github.com/joelittlejohn/jsonschema2pojo/issues/392  Generating a POJO using oneOf, anyOf or allOf with constraints
looks like a good project generating java code with jackson but not impliemted oneof

see proposal https://github.com/joelittlejohn/jsonschema2pojo/wiki/Proposal-for-allOf,-anyOf-and-oneOf

this was a PR proposal 2021 - no update
https://github.com/joelittlejohn/jsonschema2pojo/issues/1193  Implementation of oneOf support


not merged https://github.com/joelittlejohn/jsonschema2pojo/pull/504   'oneOf' support#504

## other material on jason jackson oneof
these are comments on oneof

https://github.com/OpenAPITools/openapi-generator/pull/4785 

implimented in 4.3.x but may be broken later

This PR represents implementation of oneOf support for Java clients that use Jackson as serialization library. I based this on discussion in #15.

This implements oneOf in the following way:

    The object/property that holds oneOf mapping is generated as an interface with proper jackson JsonSubTypes decorator derived from discriminator - this makes it possible for jackson to detect the implementing class that should be used when deserializing.
    The objects referenced in oneOf implement this interface.
    A getter for the discriminator attribute is generated in the above mentioned interface, making it easy to write code such as (assuming the API response contains x, which is the oneOf interface):if (x.getType() == "type1") { Type1 type1 = (Type1) x };
    If there are any additional properties defined on the oneOf-containing object, they are added to all of the oneOf members in

    . x-oneOf-name  extension

After some more discussion with Jim about this, we agreed that it would be safer to submit this PR for 4.3.x branch, which I did in #5120. That PR has just been merged, so I'm closing this one. Thanks everyone involved for their comments/reviews


schemas:
    Animal:
      type: object
      properties:
        name:
          type: string
        weight:
          type: integer
          minimum: 0
          maximum: 100
      oneOf:
        - $ref: '#/components/schemas/Cat'
        - $ref: '#/components/schemas/Dog'
      discriminator:
        propertyName: type
        mapping:
          cat: '#/components/schemas/Cat'
          dog: '#/components/schemas/Dog'
    Dog:
      properties:
        type:
          type: string
          enum:
           -dog
        barksPerMinute:
          type: integer
    Cat:
      properties:
        type:
          type: string
          enum:
           - cat 
        meowsPerMinute:
          type: integer




Currently, openapi-generator doesn't support oneOf. This is a capability that had been newly introduced with OpenAPI v3 (FYI, only v2 and below are called "Swagger", it has then been renamed to OpenAPI). There are various generators (Java, Spring, lots of other languages). I have seen that contributions have been made during this year to enable oneOf support.

To sum up, it looks like you have to wait a bit more until you can exploit this feature of the OpenAPI v3 spec using the generator for Spring

https://stackoverflow.com/questions/62760156/how-to-use-openapi-oneof-property-with-openapi-generator-maven-plugin-when-gen

generator docs

https://openapi-generator.tech/docs/generators/java/
additionalOneOfTypeAnnotations

https://github.com/OpenAPITools/openapi-generator/pull/5120  

java][client] oneOf support for jackson clients 5120

interesting inheritance openapi
https://github.com/Zomzog/openapi-inheritance/blob/master/src/main/resources/api/api.yml

https://medium.com/@zomzog/openapi-generator-inheritance-50c33325d214

some additional spring generator oneOf
https://medium.com/@mike-welsh/api-first-development-using-openapi-generator-60c8cd7256ef
useOneOfInterfaces: true
addOneOfInterfaceImports: true




