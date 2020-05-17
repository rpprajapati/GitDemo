Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

Scenario Outline: Login parameterize
Given User is on Login page
When User login in to application with <username> and <password>
Then Verify user login <result>

Examples:
|username		|password	|result	 |
|abcd			|12345		|Pass	 |
|wxyz			|67890		|Fail	 |