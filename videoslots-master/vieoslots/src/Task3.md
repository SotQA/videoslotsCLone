Task #3

Bug report #1

Summary:
User's credentials disappear during the registration stage

Description:
After filling the fields "Your Email" and "Password" in with valid credentials and then
choosing the country of residence in the dropdown list user looses all passed credentials
and the fields are empty.

Preconditions:
1. VPN service is on (USA location)

Severity:
Critical

Priority:
High

Environment:
Google Chrome browser Version 112.0.5615.49 (Official Build) (64-bit)
VPN service is on (USA location)
OS: Linux version 5.15.0-56-generic (Mint)

STR (Steps to reproduce) :
1. Open website https://www.videoslots.com/
2. Click on "Open account"
3. Click on "Your Email"
4. Pass valid email into the field
5. Click on "Password" field
6. Pass valid password that fits security requirements
7. Click on the next dropdown to see the list of countries to choose
8. Click on any country

Expected result:
User sees all the credentials they used to input and the country chosen

Actual result:
User sees that credentials disappear leaving the fields empty.
*Optionally : after choosing country the field password is not shown on the 
registration form anymore.

Explanation:
This defect is considered Critical (it might be even blocker) because the first modules of the platform that commonly
used are registration and log in. For the company (Videoslots) the main idea is that potential clients, players etc.
would have a wish to use the platform to play, therefore the Videoslots has potential income from them which is the main
purpose of the business.

________________________________________________________________________________________________________________________

Bug report #2

Summary:
Password field completely disappears after choosing a country from dropdown.

Description:
After filling the fields "Your Email" and "Password" in with valid credentials and then
choosing the country of residence in the dropdown password field may completely disappear from the registration form
therefore the user will not be able to register without any additional actions.

NOTICE: Float bug , does not always appear. 

Preconditions:
1. VPN service is on (USA location)

Severity:
Blocker

Priority:
High

Environment:
Google Chrome browser Version 112.0.5615.49 (Official Build) (64-bit)
VPN service is on (USA location)
OS: Linux version 5.15.0-56-generic (Mint)

STR (Steps to reproduce) :
1. Open website https://www.videoslots.com/
2. Click on "Open account"
3. Click on "Your Email"
4. Pass valid email into the field
5. Click on "Password" field
6. Pass valid password that fits security requirements
7. Click on the next dropdown to see the list of countries to choose
8. Click on any country

Expected result:
User sees all the credentials they used to input and the country chosen

Actual result:
Password field is not shown on the
registration form anymore.

Explanation:
This defect is considered a blocker because users will not be able to perform any further actions without any additional
actions like refreshing the page, getting back to a previous page etc. so they will not be registered 
the way they expect.

________________________________________________________________________________________________________________________
Bug report #3

Summary:
After registration user is not automatically logged in to their personal account.

Description:
After the user successfully registered on the platform the user is not automatically logged
in the personal account for further actions.

Preconditions:
1. VPN service is on (USA location)

Severity:
Major

Priority:
High

Environment:
Google Chrome browser Version 112.0.5615.49 (Official Build) (64-bit)
VPN service is on (USA location)
OS: Linux version 5.15.0-56-generic (Mint)

STR(Steps to reproduce):
1. Open website https://www.videoslots.com/
2. Click on "Open account"
3. Click on the dropdown to see the list of countries to choose
4. CLick on United Kingdom
5. Click on "Your Email"
6. Pass valid email into the field
7. Click on "Password" field
8. Pass valid password that fits security requirements
9. Click on "Mobile phone number" field
10. Pass 26489102
11. Click on checkbox "I agree to Videoslots Privacy Policy"
12. Click on checkbox "I accept Videoslots Terms and conditions"
13. CLick on Register
14. Pass the captcha
15. Click Confirm button
16. Fill "First name" field with valid data
17. Fill "Last name " field with valid data
18. Fill "Address" field with valid data
19. Fill "Zip Code" field with valid data
20. Fill "City" field with "London"
21. CLick on "Nationality" dropdown
22. Choose "United Kingdom (GB)"
23. Choose 1985 year of birth
24. Choose June month 
25. Choose 12 day
26. Pass in "Validation code" field code that has been sent to the email from the step #6
27. Click on " I am over 18*" checkbox
28. Click on "Register"

Expected result:
User sees the main page (Home page) being logged in to the account that has been created.

Actual result:
User sees the main page (Home page) being not logged in automatically.

Explanation:
This bug is considered critical together with bug report #1, because commonly they force user to have a mistrust to
the platform. Mistrust is leading users to the situation when they are not sure of spending money on the platform 
they don't really trust.
Taking into account the first bug report if user finally registered so following the typical registration scenario
after completing the process of registration user is automatically logged in, so they can perform further actions. 







