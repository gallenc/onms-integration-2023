# Notes

Async api tooling

| name | description |Link |
| maven plugin | maven plugin to generate async api definitions | https://ctron.github.io/asyncapi-maven/usage.html |


# notes

to use npm and run scripts you need to change local user permissions on windows power shell

```
Set-ExecutionPolicy -Scope CurrentUser Unrestricted
```
## Issues

### Anonymous classes
the geneation of code does not work properly in examples for anonymous classes

See issue discussions

https://github.com/asyncapi/parser-api/issues/34 Define how to handle unknown schema and message id's

https://github.com/asyncapi/java-spring-template/issues/203# Don't generate AnonymousSchemaN classes for the payload
 
comment : Regardless of which implementation we end up with, I would highly recommend you explicitly set a unique identifier through either $id (not optimal) or x-parser-schema-id so the schema has a unique identifier for tools 

### java kafka generator doesnt work with model 

### spring-cloud generator 
generates anonymous classes and fails to load

### spring-java generator works wut needs work around for anonymous classes

### allOf problems

https://github.com/OpenAPITools/openapi-generator/issues/2892  UNKNOWN BASE TYPE when using allOf in request body schema declaration 

comment: The generator appears to lack a concept for creating base types for schemas being used in conjunction with allOf.