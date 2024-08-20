# How to run
- Use Corretto 17
- For test use `./gradlew test`, for create jar use `./gradlew shadowJar`
- Create a lambda function in AWS with the jar file and use java 17
- Edit the handler to `io.micronaut.function.aws.proxy.payload1.ApiGatewayProxyRequestEventFunction` in run configuration
- Create a test with the following json:
```json
{
  "path": "/",
  "httpMethod": "GET",
  "headers": {
    "Accept": "application/json"
  }
}
```
# Useful links
## Handler

Handler: io.micronaut.function.aws.proxy.payload1.ApiGatewayProxyRequestEventFunction

[AWS Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html)

- [Micronaut Gradle Plugin documentation](https://micronaut-projects.github.io/micronaut-gradle-plugin/latest/)
- [GraalVM Gradle Plugin documentation](https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html)
- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature amazon-api-gateway documentation

- [Micronaut Amazon API Gateway REST API documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#amazonApiGateway)

- [https://docs.aws.amazon.com/apigateway/](https://docs.aws.amazon.com/apigateway/)


## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)


## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)


## Feature aws-lambda-events-serde documentation

- [Micronaut AWS Lambda Events Serde documentation](https://micronaut-projects.github.io/micronaut-aws/snapshot/guide/#eventsLambdaSerde)

- [https://github.com/aws/aws-lambda-java-libs/tree/main/aws-lambda-java-events](https://github.com/aws/aws-lambda-java-libs/tree/main/aws-lambda-java-events)


## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)


## Feature snapstart documentation

- [https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)


