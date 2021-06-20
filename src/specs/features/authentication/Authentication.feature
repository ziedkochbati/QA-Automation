@cnx
Feature: Authentication - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @cnx
  Scenario: Authentication - OrangeHRM
    Given Je me connect a l'application OrangeHRM
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le boutton login
    Then Je me redirige vers le compte admin
