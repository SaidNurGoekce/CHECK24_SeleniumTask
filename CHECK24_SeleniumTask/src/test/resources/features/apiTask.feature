Feature: REST-API Test Task

     @api
    Scenario Outline: Send get requests
      Given the user enters "<id>" as path param and sends GET request
      Then verify "<status code>"

      Examples:
        | id     | status code |
        | 200007 | 200         |
        | abcd   | 404         |
        | 5456   | 204         |