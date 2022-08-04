Feature: Perform google search

Scenario Outline: simple search

Given I am in the google homepage
When I enter search "<term>"
And I click on google search button
Then I receive related search results

Examples: 
|term              |
|Quality Assurance |
|Software Testing  |