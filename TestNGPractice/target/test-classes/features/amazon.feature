Feature: Amazon Search

Scenario: Search shoes on Amazon
  Given User launches Amazon website
  When User enters "shoes" in search box
  And User clicks search button
  Then Search results should be displayed