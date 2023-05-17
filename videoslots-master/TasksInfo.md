Here is the explanation about the tasks that I've completed and all the information needed.

I've been using JAVA 17 (Amazon Corretto version 17.0.6) in the IntelliJ IDEA.

Task #1

The first task is completed in the path : vieoslots/src/main/java/Task1.java
There you may find 3 methods : 

fillTheArrayWithRandomNumbers - which basically fills the array for the first task with random numbers for a smoke test.
numbersMultipliersByFourOrSix - which does the main idea of the first task - to validate if the numbers in the array passed as an argument.
isTheStringPalindrome - the last method for a second part of the first task which simply verifies if the String passed as an argument into the method is a palindrome. 

Down below these three method there is main method for calling these methods above for the task #2.

There is Test data for the first method that I used to pass into the method.
Under test data for the first method (array) I stored method callings (our checkups).
Please pay attention that two checkups are commented out because IDE does not allow us to use wrong data types, but these two checkups still take place there ,
because as a QA Engineer I know that I should check if the functionality accepts only appropriate data types as we expect it to be.

Test data for the second method (palindrome)
Under test data for the second method (palindrome) I stored method callings (our checkups).


________________________________________________________________________________________________________________________________________________________________________________

Task #2

There second task is completed in the path : vieoslots/Task2.xlsx as a Excel table with test cases provided for the first task.
Plase, open file with name Task2.xlsx locally to see the table with the scenarios.

All the test cases stored in the Task2.xlsx file are going in the same order as there are method callings for them in the main method in the file Task1.java .

There is not such column like STR (Steps to reproduce) because in this case it seemed to me that there are not actually steps to check the functionality.

All the method checkups are stored in the path : vieoslots/src/main/java/Task1.java in the main method. To compile the code kindly ask you to press Ctrl+Shift+F10 (Windows, Linux) and you will see 
console output after calling these methods. 

First test cases are smoke ones so we understand that the main functionality is working correctly. Positive test cases are stored there too to see that the 
methods function the way we need them to. 

After smokes and positive checkups there are negative test cases so we understand if the system has vulnerabilities. 

Further test cases in my opinion are getting us to exhaustive testing, which may have a negative impact following the fact that we don't need to waste time for 
checkups that have no sence to be performed.

________________________________________________________________________________________________________________________________________________________________________________

Task #3

Bug reports for the website https://www.videoslots.com/ you may find in the path : vieoslots/src/Task3.md

There are 3 bug reports where the Bug report #1 is critical, Bug report #2 is blocker and Bug report #3 is major.
Explanation why I consider them with such severities is in the end of each bug report.

________________________________________________________________________________________________________________________________________________________________________________

Task #4

All SQL queries are stored in the path : vieoslots/Task4.sql . 

Int the third and the fourth query I used INNER JOIN so that we see only data that matches from two tables. Which exactly what we needed from the last part of the Task #4 .

________________________________________________________________________________________________________________________________________________________________________________

Task #5

You may find page objects in the path : vieoslots/src/main/java/task5 . A package "task5" includes 3 classes which present 3 webpages for further tests and scenarios. 
These pages store webelements that we reffer to, and method for taking actions.

LoginPage class - stores webelements for logging in (emailField, passwordField etc.)
MainPage class - this class contains webelement and methods for the first page that the user sees before actually logging in. 
UserAccountPage - is storing all the webelements and methods that we need for our tests already being logged in.

Test scenarios are stored in the path : vieoslots/src/test/resources/loginScenarios.feature 
NOTE: to run all the scenarios successfully user must already have a registered account. 
Step definitions for the feature file are stored in the path : vieoslots/src/test/java/MyStepdefs.java . 
Feature file contains four scenarios that have been in the task using Cucumber.

NOTE: The first scenario is called "Successful login using email", not "Unsuccessful login using email" , because first of all we must understand if the user can actually log in,
to start from positive checkups, because in the case if the first positive login test fails - the process of testing has to be stopped. 

To run test scenarios, kindly ask you to press Ctrl+Shift+F10 (Windows, Linux) being in "loginScenarous.feature" file.

