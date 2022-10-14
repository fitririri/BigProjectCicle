@chat-feature
Feature: Chat
  User can chatting

  Background: User login
  Scenario: Verify user can login with correct credentials
    Given User on the login page
    When User choose google account
    Then Verify user successfully login

  @Positive @chat1
  Scenario: Verify user can send chat in group chat
    Given User already on homepage2
    When User type message
    And User send message
    Then Verify user success send message

#  @Positive @chat2
#  Scenario: Verify user can delete message in group chat
#    Given User already on homepage2
#    When User delete message
#    Then Verify user success delete message