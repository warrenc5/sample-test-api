Feature: auth

Background:

Scenario: login

    Given url 'http://localhost:8080/mnf-api-test/api/auth/login'
    And form field username = 'wozza'
    And form field username = '123'
    When method post
    Then status 202

Scenario: logout

    Given url 'http://localhost:8080/mnf-api-test/api/auth/logout'
    When method get
    Then status 204