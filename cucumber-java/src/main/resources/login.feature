Feature: Login Feature File

  @selenium
  Scenario: Login scenario test for custom
    Given navigate to custom page
    When user logged in using username as "userA" and password as "password"
    Then loginfail page should be displayed

  @selenium
  Scenario: Login scenario test for custom
    Given navigate to custom page
    When user logged in using username as "admin" and password as "admin"
    Then loginsuccess page should be displayed
