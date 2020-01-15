Feature: User posts (Read and Create)

  @smoke
  Scenario: User sees his email
    Given As a random User
    When I get my profile
    Then I can see my email

  @acceptance
  Scenario Outline: User has valid posts
    Given As a User with id equals <id>
    When I get my posts
    Then I see some valid posts

    Examples:
      | id |
      | 5  |
      | 10 |

  @acceptance
  Scenario: User is able to make a new post
    Given As a User with id equals 4
    When I make new post with title and text
    Then I see successful post result
