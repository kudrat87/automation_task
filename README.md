Behavior Driven Development (BBD) Framework
Using Java as a programming language 
Using Selenium WebDriver for automating UI
Using Cucumber in order to write Scenarios in Gherkin language and using Hooks to take
a screenshot if any step fails
Using JUnit for Annotation and Assertion
Created as a Maven project where all dependencies can be added and managed in pom.xml file
The framework follows Page Object Model (POM), and Singleton design pattern (singleton)
Under src/test/java/com/tipico/pages created a Java page class located and stored all Web elements 
related to the page inside its own class for code re-usability and easy to manage.
Under  src/test/java/com/tipico/step_definition created a Java steps class where actual validation and verification and validation happens
Also under src/test/java/com/tipico/step_definition created Hooks class if any step fails it takes a screenshot and include it into reports
Under src/test/java/com/tipico/test_runner created 2 Java classes TestRunner class and FailedTestRunner class. We can run all our tests/scenarios
from TestRunner class using tags. If any test/scenarios fails we can use FailedTestRunner class to run only failed test/scenario.
Under src/test/java/com/tipico/utilites created 3 classes, 1. Driver class (Singleton) the purpose of singleton is to use only one instance of the class
for the whole project to avoid code duplication. 2. DataReader class we can use this class to get/read data from user.properties file under resource folder
3. Wait_Utility class has wait method we can whenever we need to pause our code for few seconds
Under src/test/resources we have 3 folders config, driver, features, 1. config folder I created user.properties file which we can use to store data such as URL, Credentials etc...
2. drivers folder has  chromedriver and geckodriver(firefox). 3. features folder we can write and store our features in Gherkin language
Every time we run our test it generates report and stores it under target folder

# You can run test from TestRunner class src/test/java/com/tipico/test_runner 


   








