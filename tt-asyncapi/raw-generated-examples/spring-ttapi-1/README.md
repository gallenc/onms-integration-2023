## generated code command
```
 Set-ExecutionPolicy -Scope CurrentUser Unrestricted

asyncapi generate fromTemplate TMF925-TroubleTicket-v4.0.0.asyncapi.yml @asyncapi/java-spring-template -o target --force-write

```

output
```
PS C:\devel\gitrepos\onms-integration-2023\tt-asyncapi> asyncapi generate fromTemplate TMF925-TroubleTicket-v4.0.0.asyncapi.yml @asyncapi/java-spring-template
Generation in progress. Keep calm and wait a bit... done

Generator Error: "C:\devel\gitrepos\onms-integration-2023\tt-asyncapi" is in a git repository with unstaged changes. Please commit your changes before proceeding or add proper directory to .gitignore file. You can also use the --force-write flag to skip this rule (not recommended).
PS C:\devel\gitrepos\onms-integration-2023\tt-asyncapi> asyncapi generate fromTemplate TMF925-TroubleTicket-v4.0.0.asyncapi.yml @asyncapi/java-spring-template
Following AnonymousSchema classes were generated in DTO classes:
com/asyncapi/model/AnonymousSchema1.java,com/asyncapi/model/AnonymousSchema106.java,com/asyncapi/model/AnonymousSchema122.java,com/asyncapi/model/AnonymousSchema124.java,com/asyncapi/model/AnonymousSchema129.java,com/asyncapi/model/AnonymousSchema13.java,com/asyncapi/model/AnonymousSchema130.java,com/asyncapi/model/AnonymousSchema137.java,com/asyncapi/model/AnonymousSchema166.java,com/asyncapi/model/AnonymousSchema176.java,com/asyncapi/model/AnonymousSchema186.java,com/asyncapi/model/AnonymousSchema204.java,com/asyncapi/model/AnonymousSchema206.java,com/asyncapi/model/AnonymousSchema244.java,com/asyncapi/model/AnonymousSchema261.java,com/asyncapi/model/AnonymousSchema31.java,com/asyncapi/model/AnonymousSchema34.java,com/asyncapi/model/AnonymousSchema37.java,com/asyncapi/model/AnonymousSchema4.java,com/asyncapi/model/AnonymousSchema7.java,com/asyncapi/model/AnonymousSchema9.java

This may be a result of explicit (composition, inheritance, array items) Schema Object definition e.g.

    schemas:
      NamedObject:
      type: object
        properties:
          field:
            type: array
            items:
              type: object #Anonymous object
              properties:
                field:
                  type: string

OR

    messages:
      Message:
        payload:
          type: object #Anonymous object
          properties:

Please move such elements to child of "schemas:" to define proper names.
If changing of data model is not possible, you may use "$id" to set name e.g.

    properties:
      field:
        type: array
        items:
          $id: ArrayElement #Name of object
          type: object
          properties:
            field:
              type: string
Generation in progress. Keep calm and wait a bit... done
Check out your shiny new generated files at C
```