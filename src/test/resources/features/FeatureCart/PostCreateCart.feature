@Team2
Feature: Post Create Card

 Scenario: Post create new cart
  Given Post create new data with request body cart
  When Send create new cart
  Then Status code should be 201 Created
#  And Validate new cart resource json schema

 Scenario: Post create new cart with empty value
  Given Post create new data with request body cart with empty value
  When  Send create new cart
  Then Status code should be 400 Bad Request