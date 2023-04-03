# example generating camel code for ReST TTAPI

using the camel-java generator documented here https://openapi-generator.tech/docs/generators/java-camel

https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/java/org/openapitools/codegen/languages/JavaCamelServerCodegen.java

this generates the routesImpl classes through the tem[late https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/resources/java-camel-server/routesImpl.mustache

but only if the specified library is spring-boot and interfaceOnly is false
```
                        <library>spring-boot</library>
                        <interfaceOnly>false</interfaceOnly>
```


note that the camel generator extends the spring generator so the spring configuration also applies

https://openapi-generator.tech/docs/generators/spring/

https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/java/org/openapitools/codegen/languages/SpringCodegen.java

## running example

to run try
```
mvn clean install

mvn spring-boot:run

```

