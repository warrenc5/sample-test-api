Feature: customer

Background:

Scenario: post 

    Given url 'http://localhost:8080/mnf-api-test/api/customer'
    And request body  =  {'name' :  'wazzo'}
    When method post
    Then status 200

Scenario: get 

    Given url 'http://localhost:8080/mnf-api-test/api/customer/1'
    When method get
    Then status 200
