# TimeBOX Technical Assessment

Java TimeBOXTechAssessment project for test automation API acceptance testing.

## Tools

* Maven
* Cucumber-JVM
* JUnit


## Requirements

In order to utilise this project you need to have the following installed locally:

* Maven 3
* Java 1.8

## Usage

To run API acceptance tests only, navigate to `TimeAndBOXTechAssessment` directory and run:

`mvn clean install compile tests`

## Reporting

Reports are generated in `/target` directory after a successful run.

API acceptance tests result in a HTML report for each feature in `target/cucumber-report/cucumber.html`.

