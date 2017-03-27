# parsed-text-reviewer
A generic system that allows reviewing of text parsing results

### Build it
```
In the root folder, run mvn -clean install
If successful, this will create ./target/parsedTextReviewer.jar
```

### Run it
```
Your machine must run Java 8
Change dir to ./target
Run java -jar parsedTextReviewer.jar
```

### Configuration
```
See ./src/main/resources/application.properties
Default context is /parsedTextReview
Default port is 8080
```
