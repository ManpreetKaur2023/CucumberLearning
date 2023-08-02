
@tag
Feature: View Stores
As a user I should be able to view different stores.
  

  @tag1
  Scenario: Get All Stores
    Given store API is available
    When I invoke store API with get method
    Then The response code should be 200
    

  
