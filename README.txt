AUTOMATION EXERCISE:

This test project is based on Selenium WebDriver (Page Object Model) using Java as the programming language.
This is a Maven based project which used TestNG as the test framework.
The tests have been configured to run on Chrome browser on Windows machine.
The test and pages are present in the ‘src’ folder in pages and tests locations respectively.
The html test report is generated at the following location inside the project: test-output/emailable-report.html. If you do not see the test reports after execution, please refresh the project folder once. 



Pre-requisites for running automation tests:
Install Java
Install Maven
Install TestNG in Eclipse or IDE used for Java development
Download chromedriver and place it in the following locaiton "C:/Temp"

Chrome version and chromedriver version should be compatible. I used Chrome v86 and chromedriver v32



Scenarios covered:
A single test file to validate the end to end flow of purchasing an automobile insurance policy. 



Steps to execute tests:
1. In the project folder, run the following command: 'mvn clean install'
1. To execute tests from Ecliplse/any Java IDE, right click on testng.xml file and run as Test NG suite 
2. To execute tests using command line, browse to the project folder and run the following command: 'mvn clean install test'