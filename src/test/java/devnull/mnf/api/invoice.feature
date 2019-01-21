Feature: invoice

Background:

Scenario: create Invoice 1 

    Given url 'http://localhost:8080/mnf-api-test/api/invoice'

    And request body  =  {"description" :  "invoice1", "customer":{"id":1}, "purchased":"2019-01-20","price":1.23}
    When method post
    Then status 200
    And  match response contains { id: 1 }

Scenario: create Invoice 2 

    Given url 'http://localhost:8080/mnf-api-test/api/invoice'

    And request body  =  {"description" :  "invoice2", "customer":{"id":1}, "purchased":"2019-01-21","price": 4.56}
    When method post
    Then status 200
    And  match response contains { id: 2 }

Scenario: get Invoices

    Given url 'http://localhost:8080/mnf-api-test/api/invoice/1'
    When method get
    Then status 200
