Feature: POST add image product
  @Test
   Scenario: [Products-A016]Post add image product with extension image
     Given Post add image product with multipart valid
     When Send post add image product parameter
     Then Status code should be 200 OK
     And Validate add image product valid resources json schema
  @Test
  Scenario: [Products-A017]Post add image product with extension image without auth token
    Given Post add image product with multipart valid without auth token
    When Send post add image product parameter
    Then Status code should be 401 Unauthorized
    And Validate add image product valid without auth token resources json schema
  @Test
  Scenario: [Products-A018]Post add image product with other extension image
    Given Post add image product with other extension image
    When Send post add image product parameter
    Then Status code should be 415 unsupported media type
    And Validate add image product with other extension image json schema
  @Test
  Scenario: [Products-A019]Post add image product with large size
    Given Post add image product with large size
    When Send post add image product parameter
    Then Status code should be 413 Request Entity Too Large


  Scenario: [Products-A020]Post add product images without file image
   Given Post add image product without file image
    When Send post add image product parameter
    Then Status code should be 400 Bad Request
    And Validate add image product without file image resources json schema


  Scenario: [Products-A021]Post add product images invalid parameter
    Given Post add image product invalid parameter
    When Send post add image product parameter
    Then Status code should be 404 Not Found
    And Validate add image product invalid parameter resources json schema