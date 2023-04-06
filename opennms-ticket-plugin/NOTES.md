
# generating an opennms api archetype

## building the api code

first check out the appropriate api version

opennms 31 uses opennms api 1.3.0

```
git clone https://github.com/OpenNMS/opennms-integration-api.git
cd opennms-integration-api
git fetch --all --tags
git checkout tags/v1.3.0 -b v1.3.0
mvn clean install

```

## generating your plugin project

in a new folder use the integration api example-kar-plugin archetype to generate a project
(note that each variable is surrounded by quotes " " in order for the archetype generator to work in powershell)

If using interactive archetype generator mode use 

```
mvn archetype:generate "-DarchetypeCatalog=local" "-DarchetypeGroupId=org.opennms.integration.api"  "-DarchetypeArtifactId=example-kar-plugin" "-DarchetypeVersion=1.3.0" 
```

You need to supply variables 

|groupId| this is the maven group id for the generated project. It will also be the default package id e.g. org.opennms.integration.camel|
|artifactId |this will be the maven artifact name for the project e.g. camel-tt-api|
|pluginId| this will be the machine readable id of the plugin  used for instance in <feature name="opennms-plugins-${pluginId}" description="OpenNMS :: Plugins :: ${pluginName}" version="${symbol_dollar}{project.version}"> e.g. camel-tt-api|
|pluginName|this will be the human readable name of the plugin e.g. used for instance in generated pom <name>OpenNMS :: Plugins :: ${pluginName}</name> camel-tt-api|

For non interactive mode use

```
mvn archetype:generate "-DarchetypeCatalog=local" "-DarchetypeGroupId=org.opennms.integration.api"  "-DarchetypeArtifactId=example-kar-plugin" "-DarchetypeVersion=1.3.0" "-DgroupId=org.opennms.integration.camel" "-DartifactId=camel-tt-api" "-DpluginId=camel-tt-api" "-DpluginName=camel-tt-api" "-DinteractiveMode=false"

```

after generating your project, you can cd into the project folder and test if it builds
```
cd camel-tt-api
mvn clean install

```

After that you an start stripping out or modifying the exammple code


