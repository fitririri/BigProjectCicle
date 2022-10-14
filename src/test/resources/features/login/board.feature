@board-feature
Feature: Board
  User can add list

  Background: User login
  Scenario: Verify user can login with correct credentials
    Given User on the login page
    When User choose google account
    Then Verify user successfully login

  @Positive @board1
  Scenario: Verify user can create card
    Given User already on homepage
    When User choose board
    And User add new card
    Then Verify user success create card

  @Positive @board2
  Scenario: Verify user can create new list on board
    Given User already on homepage
    When User choose board
    And User add new list
    Then Verify user success create list

  @Positive @board3
  Scenario: Verify user can archive list
    Given User already on homepage
    When User choose board
    And User archive list
    Then Verify user success move list to archive

  @Positive @board4
  Scenario: Verify user can archive card
    Given User already on homepage
    When User choose board
    And User archive card
    Then Verify user success move card to archive

  @Negative @board5
  Scenario: Verify user cannot add new card with blank card name
    Given User already on homepage
    When User choose board
    And User did not input name card
    Then Verify card name cannot be empty