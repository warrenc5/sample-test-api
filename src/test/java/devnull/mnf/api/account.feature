Feature: accounts

Background:

Scenario: get Accounts

    Given url 'http://localhost:8080/mnf-api-test/api/accounts'
    When method get
    Then status 200
