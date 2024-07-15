Feature: InPost Package Tracking

  Scenario Outline: Verify package status
    Given I am on the InPost tracking page
    When I search for package with tracking number "<trackingNumber>"
    Then I should see the status as "<expectedStatus>"

    Examples:
      | trackingNumber           | expectedStatus            |
      | 520113014230722029585646 | Dostarczona.              |
      | 520107010499997005638120 | Przekazana do doręczenia. |
      | 523000016696115042036670 | Anulowano etykietę.       |
      | 520000011395200025754311 | Dostarczona.              |
