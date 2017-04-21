#!/bin/sh

mvn clean package
java -jar target/c4-curator-0.1.0.jar &

sleep 10
open "http://localhost:8080/c4curator/"
