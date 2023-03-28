# notes

```
 asyncapi generate fromTemplate TMF925-TroubleTicket-v4.0.0.asyncapi.yml       @asyncapi/java-spring-cloud-stream-template -o target --force-write

## note  --force-write needed if in uncommitted git repo

# using docker (doesnt work - needs work)
docker run --rm -it -v TMF925-TroubleTicket-v4.0.0.asyncapi.yml:/app/asyncapi.yml -v ./target:/app/output asyncapi/generator:1.9.4 asyncapi generate fromTemplate -o /app/output /app/asyncapi.yml @asyncapi/java-spring-cloud-stream-template   --force-write

```

errors

```
Generation in progress. Keep calm and wait a bit... done

Generator Error: (C:\Users\cgallen\AppData\Roaming\npm\node_modules\@asyncapi\cli\node_modules\@asyncapi\generator\node_modules\@asyncapi\java-spring-cloud-stream-template\template\src\main\java\$$everySchema$$.java) [Line 10, Column 51]
  Error: Unable to call `propModelClass["getClassName"]`, which is undefined or falsey
PS C:\devel\gitrepos\onms-integration-2023\tt-asyncapi\raw-generated-examples\spring-cloud-stream-tt1>

```

note see https://github.com/asyncapi/java-spring-cloud-stream-template/issues/194    Generation of array types is not possible anymore #194  