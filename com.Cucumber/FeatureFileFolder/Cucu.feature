@Smoke
Feature: Orange HRM Login

  Background: 
    Given Site is opened

  Scenario: Login Scenario
    When I enter Admin and admin
    Then I should get logged in

  Scenario Outline: Negative Login Scenario
    When I enter <username> and <password>
    Then I should get logged in

    Examples: 
      | username | password |
      | deepak   | password |
