# Running SpringBoot Groovy application with Java 11

I used OpenJDK version of Java 11 during development of this sample !

Spring Boot - 2.1.1.RELEASE

Used maven-compiler-plugin (Refer : https://github.com/groovy/groovy-eclipse/wiki/Groovy-Eclipse-Maven-plugin)

```xml
<plugin>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.8.0</version><!-- 3.1 is the minimum -->
  <configuration>
    <release>11</release>
    <compilerId>groovy-eclipse-compiler</compilerId>
    <compilerArguments>
    <indy/>
    <configScript>config.groovy</configScript>
    </compilerArguments>
  </configuration>
  <dependencies>
    <dependency>
      <groupId>org.codehaus.groovy</groupId>
      <artifactId>groovy-eclipse-compiler</artifactId>
      <version>3.0.0-01</version>
    </dependency>
    <dependency>
      <groupId>org.codehaus.groovy</groupId>
      <artifactId>groovy-eclipse-batch</artifactId>
      <version>2.5.5-01</version>
    </dependency>
  </dependencies>
</plugin>
```
