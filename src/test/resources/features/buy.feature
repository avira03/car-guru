Feature: Search functionality

  @sanity @sanity @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on "buy+sell" tab
    And I click Search Cars link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make  | model    | location     | price   |
      | BMW   | 1 Series | NSW - Hunter | $60,000 |
      | Honda | City     | ACT - All    | $40,000 |
      | Kia   | Rio      | ACT - All    | $40,000 |
      | Kia   | Rio      | ACT - All    | $70,000 |
      | Tesla | Model 3  | NSW - All    | $40,000 |
      | Tesla | Model 3  | NSW - All    | $50,000 |

  @smoke @regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on "buy+sell" tab
    And I click Used link
    Then I navigate to Used Cars For Sale page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make  | model    | location     | price   |
      | BMW   | 1 Series | NSW - Hunter | $60,000 |
      | Honda | City     | ACT - All    | $40,000 |
      | Kia   | Rio      | ACT - All    | $40,000 |
      | Kia   | Rio      | ACT - All    | $70,000 |
      | Tesla | Model 3  | NSW - All    | $40,000 |
      | Tesla | Model 3  | NSW - All    | $50,000 |

