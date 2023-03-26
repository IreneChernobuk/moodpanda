Feature: Search

  Scenario Outline: User goes to main page and open Курсы tab selects <type> and checks <course> course
    Given Main TMS page opened
    When User goes to "Курсы"
    And Selects <type>
    Then <course> course presents on page
    Examples:
      | type         | course    |
      | "Офлайн курсы" | "Front End" |
      | "Онлайн-курсы" | "Python" |