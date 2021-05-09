Feature: Selenium Task

  @wip
  Scenario:user fills in the registration form.
    Given the user is on the check24 Kreditkarten-Vergleich page
    When the user should see the cookie 'ppset=kreditkarte' is set in response headers
    And the user clicks on the first listed product
    And the user fills in 'taskprepforCHECK24@gmail.com' as email
    And the user clicks on weiter button
    And the user clicks on als Gast fortfahren radio-button
    And the user clicks to weiter button below
    And the user clicks on weiter button on registration page
    Then error messages are displayed
    And the user fills in all fields with valid values

      | Vorname             | Said            |
      | Nachname            | Gokce           |
      | Geburtsdatum        | 28.08.1993      |
      | Geburtsort          | Ulm             |
      | Familienstand       | ledig           |
      | Staatsangehorigkeit | Deutschland     |
      | Postleitzahl        | 89233           |
      | Strasse             | leipheimer str. |
      | Hausnummer          | 44              |
      | Wohnsituation       | Eigenheim       |
      | Mobilnummer         | 01754927822     |

    And the user clicks on weiter button on registration page
    Then registration success message is displayed

