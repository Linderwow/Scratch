Feature: Data tables task
  @tableTask
  Scenario: User should be able to sell all 12 months in months dropdown
    Given User is on the login page of CRM
    When User enters below credentials
    |username |crm_username|
    |password |crm_password|
    Then  User should see homepage