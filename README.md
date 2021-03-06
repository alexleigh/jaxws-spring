# JAX-WS integration with Spring

[![BuildStatus](https://travis-ci.org/revinate/jaxws-spring.svg?branch=master)](https://travis-ci.org/revinate/jaxws-spring)
[![BuildStatus](https://maven-badges.herokuapp.com/maven-central/com.revinate/jaxws-spring/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.revinate/jaxws-spring)

This is a JAX-WS reference implementation ([Metro](https://metro.java.net/))
extension for integrating with [Spring Framework](https://projects.spring.io/spring-framework/).
Using this extension, it is possible to write service endpoint implementations
as Spring beans, allowing for dependency injection, etc. This extension also
makes it easier to configure various aspects of the web service using either
Spring XML or JavaConfig.

Most of the code for this extension comes from the
[JAX-WS Commons Spring extension](https://jax-ws-commons.java.net/spring/).
The core classes from the original extension have been updated to work better
with newer technologies such as Servlet 3.0, Spring 4, Spring Boot, and
embedded servlet containers. Other parts of the original extension, such as
XML-namespace-based configuration and JAX-WS local transport support, have
been removed. This extension does not declare any explicit dependencies on
servlet API, JAX-WS API, or JAX-WS RT. Projects that use this extension
can pull in versions and implementations of those APIs they choose.

## Requirements

* Java 1.7 or newer
* Servlet API 2.0 or newer
* JAX-WS API
* JAX-WS RT

## Installation

### Maven

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.revinate</groupId>
  <artifactId>jaxws-spring</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Gradle

Add this dependency to your project's build script:

```groovy
compile 'com.revinate:jaxws-spring:1.0.0'
```

## Usage

This extension comes with two sample web service applications that demonstrate
its usage.

### WSDL-first sample

This sample is located in the [jaxws-spring-sample](jaxws-spring-sample)
directory. The sample application can be started by running
the following command in the project root directory:

```
$ ./gradlew :jaxws-spring-sample:bootRun
```

The sample application implements a single service with two ports, located at:

* <http://localhost:8080/service/fibonacci>
* <http://localhost:8080/service/factorial>

The [Application class](jaxws-spring-sample/src/main/java/com/revinate/jaxwsspringsample/Application.java)
demonstrates how to use Spring JavaConfig to configure web service components.

The [FibonacciPortImpl class](jaxws-spring-sample/src/main/java/com/revinate/jaxwsspringsample/FibonacciPortImpl.java)
is a service endpoint implementation written as a Spring Bean with dependency
injection.

### Java-first sample

This sample is located in the [jaxws-spring-sample-fromjava](jaxws-spring-sample-fromjava)
directory. The sample application can be started by running
the following command in the project root directory:

```
$ ./gradlew :jaxws-spring-sample-fromjava:bootRun
```

The sample application implements a single service with one port, located at:

* <http://localhost:8080/service/fibonacci>
