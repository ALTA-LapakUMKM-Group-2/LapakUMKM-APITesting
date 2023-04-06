Feature: Put update product
  @Team2
   Scenario: [Products-A022]PUT update a product valid json request body
     Given PUT update a product valid json request body
     When Send put update a product parameter
     Then Status code should be 200 OK
     And Validate update a product valid resources json schema
  @Team2
  Scenario: [Products-A023]PUT update a product valid json request body without auth token
    Given PUT update a product valid json request body without token
    When Send put update a product parameter
    Then Status code should be 401 Unauthorized
    And Validate update a product without auth token resources json schema
  @Team2
  Scenario: [Products-A024]PUT update a product without json request body
    Given PUT update a product without json request body
    When Send put update a product parameter
    Then Status code should be 400 Bad Request
    And Validate update a product without req body resources json schema
  @Team2
  Scenario: [Products-A025]PUT update a product invalid json request body
    Given PUT update a product invalid json request body
    When Send put update a product parameter
    Then Status code should be 400 Bad Request
    And Validate update a product invalid req body resources json schema
  @Team2
  Scenario: [Products-A026]PUT update a product invalid parameter
    Given PUT update a product invalid parameter
    When Send put update a product parameter
    Then Status code should be 404 Not Found
    And Validate update a product invalid parameter resources json schema

