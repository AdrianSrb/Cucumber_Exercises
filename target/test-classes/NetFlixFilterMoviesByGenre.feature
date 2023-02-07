# """ (Doc String)
# | (Data Table_
# @ (Tags/Labeks): to group Scenarios
# <> placeholder - de gasit ce ia asta mai explicat --- merge la numere
# " " --- merge la String uri
# # (comments)

@NetFlix

Feature: Filter movies by Actor

  @Regression @Smoke

  Scenario Outline: Correct number of movies by genre

    Given I have signed in to Netflix
    And I have the following movies by genre on Netflix

      |Bad Boys| Action|
      |Cast Away| Adventure|
      |The Pursuit of Happines| Biography|

    When I search for movies by Genre "<Genre>"
    Then I find Number of "<Movies>" by Genre

    Examples:
      | Genre      | Movies|
      | Action     | 1     |
      | Adventure  | 1     |
      | Biography  | 1     |
      | Will Cruis | 9     |
      | 123        | 6     |

