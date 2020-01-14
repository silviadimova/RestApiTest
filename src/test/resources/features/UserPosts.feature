Feature: User posts (Read and Create)

  Scenario: User sees his email
    Given As a User
    Then I can see my email

  Scenario: User has a valid posts
    Given As a User
    When I get my posts
    Then I see a valid posts

  Scenario: User is able to make a new posts
    Given As a User
    When I make new post with title and text
    Then I see successful post result