Feature: Songs by Sinatra Login
  As a User
  I want to log into Sinatra
  So I can do CRUD on Songs

  Scenario: User can login succesfully
    Given I navigate to Home Page
    When I log into the site with credentials frank:sinatra
    Then I will be in Home Page
    And I will be able to Add a Song

  Scenario Outline: User can not log in using wrong credentials
    Given I navigate to Home Page
    When I log into the site with credentials <bad_credentials>
    Then I will see a login error

    Examples: 
      | bad_credentials |
      | frenk:sinotra   |
      | frank:          |
      |       :         |
