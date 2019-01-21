Feature: invoice

Background:

Scenario: create Invoice

    Given url 'http://localhost:8080/mnf-api-test/api/invoice'

    And request body  =  {'description' :  'invoice1'}
    When method post
    Then status 200

Scenario: get Invoices

    Given url 'http://localhost:8080/mnf-api-test/api/invoice/1'
    When method get
    Then status 200
