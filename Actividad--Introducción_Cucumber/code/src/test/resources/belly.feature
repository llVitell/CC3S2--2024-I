Feature: BellyFeature

  Scenario: eaten many cukes and growl
    Given I have eaten 27 cukes
    When I wait 3 hour
    Then my belly should growl

  Scenario: eaten many cukes and not growl
    Given I have eaten 27 cukes
    When I wait 1 hour
    Then my belly should not growl

  Scenario: eaten many cukes and not growl
    Given I have eaten 10 cukes
    When I wait 3 hour
    Then my belly should not growl

  Scenario: eaten many cukes and not growl
    Given I have eaten 8 cukes
    When I wait 3 hour
    Then my belly should not growl

  Scenario: eaten many cukes and not growl
    Given I have eaten 10 cukes
    When I wait 1 hour
    Then my belly should not growl

  Scenario: eaten many cukes and not growl
    Given I have eaten 7 cukes
    When I wait 1 hour
    Then my belly should not growl