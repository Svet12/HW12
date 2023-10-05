<?xml version="1.0"encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>HW4JavaMaven</artifactId>
<version>1.0-SNAPSHOT</version>

<properties>
<maven.compiler.source>11</maven.compiler.source>
<maven.compiler.target>11</maven.compiler.target>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
<dependencies>
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter</artifactId>
<version>5.7.0</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-checkstyle-plugin</artifactId>
<version>3.2.1</version>
<type>maven-plugin</type>
</dependency>
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.12</version>
<scope>test</scope>
</dependency>
</dependencies>
<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>2.22.2</version>
<configuration>
<failIfNoTests>true</failIfNoTests>
</configuration>
</plugin>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-checkstyle-plugin</artifactId>
<version>3.2.1</version>
<configuration>
<checkstyleRules>
<module name="Checker">
<module name="TreeWalker">
<module name="LocalVariableName"/>
</module>
        </module>
        </checkstyleRules>
        </configuration>
        <executions>
        <execution>
        <id>validate</id>
        <phase>validate</phase>
        <goals>
        <goal>check</goal>
        </goals>
        </execution>
        </executions>
        </plugin>
        <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.8.5</version>

        <executions>
        <execution>
        <id>prepare-agent</id>
        <goals>
        <goal>prepare-agent</goal>
        </goals>
        </execution>


        <execution>
        <id>report</id>
        <phase>verify</phase>
        <goals>
        <goal>report</goal>
        </goals>
        </execution>

        </executions>
        </plugin>
        </plugins>
        </build>

        </project>