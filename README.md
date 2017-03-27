# parsed-text-reviewer
A generic system that allows reviewing of text parsing results

### Prerequisites
Apache Maven 3.3.x

Java 8 SE

### Build it
```
In the root folder, run mvn -clean install
If successful, this will create ./target/parsedTextReviewer.jar
```

### Run it
```
Change dir to ./target
Run java -jar parsedTextReviewer.jar
```

### Configuration
```
See ./src/main/resources/application.properties
Default context is /parsedTextReview
Default port is 8080
```
