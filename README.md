# DTCC-Restful APIs
This project implements Restful APIs for CTM, Alert & Trade Suite.

## Connect to Snowflake

Before running the project please set up the environmental variables to update the application.properties under src/main/resources with your snowflake connection details
```
spring.datasource.url=jdbc:snowflake://${SNOWFLAKE_ACCOUNTNAME}.us-east-1.snowflakecomputing.com:443?db=${SNOWFLAKE_DATABASE}&warehouse=${SNOWFLAKE_WAREHOUSE}&schema=GRAPHQL
spring.datasource.username=${SNOWFLAKE_USER}
spring.datasource.password=${SNOWFLAKE_PASSWORD}
```


## Software required to build and run
```
Java: JDK 1.8+
Maven: Apache Maven 3.6.3+
```

## Package Information
If you are updating the package, please change the references in
```
com.restful.dtcc.SpringJpaSnowflakeServiceApplication
   Line 11:  @ComponentScan(basePackages = com.restful)

configuration.com.restful.dtcc.SwaggerDocumentationConfig
   Line 30: RequestHandlerSelectors.basePackage(com.restful.dtcc.api)
   
application.properties
   spring.jpa.properties.hibernate.dialect=dialect.com.restful.dtcc.SnowflakeDialect
```


## Running Locally

To build and run with maven do the following:

```
mvn clean install
mvn spring-boot:run
```

## Testing Local
```
http://localhost:8080/family?familyId={familyId}

Swagger UI: http://localhost:8080
```

## Snowflake references
https://docs.snowflake.net/manuals/user-guide-intro.html