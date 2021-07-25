# JUnit5
Junit 5 snippets

## Maven Dependency
To run [JUnit 5](https://junit.org/junit5/) tests through [maven](https://maven.apache.org/), you will need minimum two dependencies.

1. JUnit Jupiter Engine Dependency

JUnit jupiter require to have two dependencies i.e. `junit-jupiter-api` and `junit-jupiter-engine`. `junit-jupiter-api` has junit annotations (e.g. @Test) to write tests and extensions and `junit-jupiter-engine` has test engine implementation which is required at runtime to execute the tests.

Internally, `junit-jupiter-engine` is dependent on `junit-jupiter-api`, so adding `junit-jupiter-engine` only brings both dependencies into classpath.

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.5.2</version>
</dependency>
```

2. JUnit Platform Runner Dependency

You will need `junit-platform-runner` for executing tests and test suites on the JUnit Platform in a JUnit 4 environment.

Internally, `junit-platform-runner` is dependent on `junit-platform-suite-api` and `junit-platform-launcher`, so adding `junit-jupiter-engine` only brings all three dependencies into classpath.

```xml
<dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-runner</artifactId>
    <version>${junit.platform.version}</version>
    <scope>test</scope>
</dependency>
```

### Maven Example
A sample `pom.xml` file for running tests built with junit 5 is as follows:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>uk.co._4loop</groupId>
    <artifactId>junit5</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <url>https://www.4loop.co.uk</url>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>16</maven.compiler.source>
        <maven.compiler.target>${maven.compiler.source}</maven.compiler.target>
        <junit.jupiter.version>5.5.2</junit.jupiter.version>
        <junit.platform.version>1.5.2</junit.platform.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-runner</artifactId>
            <version>${junit.platform.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
            </plugin>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
            </plugin>
        </plugins>
    </build>

</project>

```
