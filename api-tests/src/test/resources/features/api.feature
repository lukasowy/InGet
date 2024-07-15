Feature: InPost Parcel Lockers API

  Scenario Outline: Fetch parcel lockers for a city
    Given I want to find parcel lockers in "<city>"
    When I request parcel lockers for the city
    Then I should save the parcel lockers data to a file named "paczkomaty.<city>.json"

    Examples:
      | city      |
      | Warszawa  |
      | Kraków    |
      | Gdańsk    |
      | Nowy Sącz |