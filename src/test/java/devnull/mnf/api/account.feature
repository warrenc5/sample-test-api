Feature: accounts

Background:

Scenario: post 

    Given url 'http://localhost:8080/mnf-api-test/api/account'
    And request body  =  {name:"acc1"}
    When method post
    Then status 204

Scenario: get Accounts

    Given url 'http://localhost:8080/mnf-api-test/api/accounts'
    When method get
    Then status 200
    And  match response contains { customerTotal: 5.70 }

