@schedule-feature
Feature: Schedule

  @Positive @schedule1
  Scenario: Verify user can create schedule
    Given User already on homepage3
    When User create event
    Then Verify user success create event

#  @Positive @schedule2
#  Scenario: Verify user can delete schedule
#    Given User already on homepage3
#    When User delete event
#    Then Verify user success delete event