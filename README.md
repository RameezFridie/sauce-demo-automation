## PRE-REQUISITES ##
- IDE - preferably Intellij
- Java 1.8
- Selenium
- Maven
#### IDE Intellij ####

- Download and install Intellij -- https://www.jetbrains.com/idea/

#### Java 1.8 ####

- Download -- https://www.oracle.com/za/java/technologies/javase/javase-jdk8-downloads.html


# Info and Usage Instructions

## FEATURES ##

This framework uses a Page-Object Model approach with Selenium as a testing tool and Maven as a build tool to automate a 
WEB application.

## FRAMEWORK STRUCTURE ##

The framework consists of page-objects - where each page-object represents a web page, and a test class where the test 
follows a user end to end flow.

Aside from these page-on=bject and test class there is a **BaseTest.java** and **Utils.java** classes.

**BaseTest.java**

Contains the setup methods to implement the method before running the tests and implement the method after the test is 
complete.

**Utils.java**

Stores the URL of the website under test.

### Running Tests ###

- The test is run locally.
- Right click on the test suite and run test from the drop down menu.
- Initialise an instance of chrome driver and run tests locally. 