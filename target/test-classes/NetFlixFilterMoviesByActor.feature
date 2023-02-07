# """ (Doc String)
# | (Data Table_
# @ (Tags/Labeks): to group Scenarios
# <> placeholder - de gasit ce ia asta mai explicat
# " "
# # (comments)

@NetFlix

Feature: Filter movies by Actor

    @Regression @Smoke

    Scenario Outline: Correct number of movies by Actor

      Given I have signed in to Netflix
      And I have the following movies on Netflix based on Actor

      |Bad Boys| Will Smith|
      |Cast Away| Tom Hanks|
      |The Pursuit of Happines| Will Smith|

      When I search for movies by Actor "<Actor>"
      Then I find Number of "<Movies>" by Actor

      Examples:
      |Actor       |Movies |
      | Will Smith | 2     |
      | Tom Hanks  | 1     |
      | Will Cruis | 9     |
      | 123        | 6     |

