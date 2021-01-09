@trends
Feature: Trends google
  Scenario: Verify Google trends
    Given User goes to "https://trends.google.com/trends/?geo=US"
    And User enters "Selenium WebDriver" in search input box and presses enter
    Then User should be redirected to the Explore page
    And User enters "Javascript WebDriverIO" to the Compare field and presses enter
    Then User should be on the Compare page
    And User selects "United States" and "New York" from the filters
    And User selects Past 90 days from the filters
    And User gets percentual ratio from the Compared breakdown by metro section and display it on the console
    Then Make sure that Selenium WebDriver is more popular than WebDriverIO