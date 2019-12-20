Feature: Login Functionality

Scenario Outline: login Test
Given User launch URL
When User enter "<user>" and "<pass>"
And click on login button
Then verify Title
Examples:
|user   |pass   |
|mercury|mercury|
|demo123|demo123|