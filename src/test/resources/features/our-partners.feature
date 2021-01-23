
@ourPartners
Feature: Our partners

  Scenario: Our partners logo, name and description validation
    Given Go to "https://www.achieve3000.com"
    And Click on Hamburger menu in the top right corner
    And Open our partners from the list
    And List all partners logo
    Then Check all presented partners has logo, header and text description



