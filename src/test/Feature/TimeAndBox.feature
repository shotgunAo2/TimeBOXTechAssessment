Feature: Technical assessments assertions

  Scenario: Creating automated tests for time and box
    Given I execute the time and box api
     Then the response name is "Carbon credits"
      And CanRelist is "true"
      And Promotions has an element that has a name of "Gallery" and the description contains "Good position in category"