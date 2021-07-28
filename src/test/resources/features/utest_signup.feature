# Author: Nicolas

  @stories

  Feature: Testing utest
    An user wants signup into a utest.com

  @scenarioSignUp
  Scenario: Signup Successfully
    Given brandon wants to signup into a utest.com
    When brandon clicks on button Join today and writes his credentials
      | strFistName           | strLastName   | strEmail                            | strMonth  | strDay  | strYear   | strCity       | strZipCode  | strCountry  | strComputer | strVersion  | strLanguagePc | strMobileDevice  | strModel  | strOS  | strPassword     | strLanguageUser |
      | Nicolas               | Caraballo     | nicolas.caraballo2@unillanos.edu.co  | December  | 28      | 1995      | Buenos Aires  | B1675       | Argentina   | macos       | 10.7.5      | spanish       | Motorola        | macro     | 8       |  TesTing-123++  | Spanish         |
    Then brandon was successfully registered
      | strQuestion    |
      | Complete Setup |