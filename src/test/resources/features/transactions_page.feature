Feature: ATM transactions
  I as a user
  I want to check the ATM transactions

  Scenario Outline:Validate query with all filters

    Given the user queries the transaction log
      | startDate   | endDate   |
      | <startDate> | <endDate> |
    When the user needs to perform the full query
      | startDate   | endDate   | cardNumber   | sourceaccount   | destinationAccount   | source   | transactionAmount   |
      | <startDate> | <endDate> | <cardNumber> | <sourceAccount> | <destinationAccount> | <source> | <transactionAmount> |
    Then the user validates the result of the transactions

    Examples:
      | startDate | endDate  | cardNumber         | sourceAccount | destinationAccount | source                                      | transactionAmount |
      | 16032022  | 17032022 | 005306917038421488 | 1610629420    | 0                  | Clientes Bancolombia en cajeros Bancolombia | 720000            |

  Scenario Outline: Validate query with card number filter

    Given the user queries the transaction log
      | startDate   | endDate   |
      | <startDate> | <endDate> |
    When the user needs to make the query with card number
      | startDate   | endDate   | cardNumber   |
      | <startDate> | <endDate> | <cardNumber> |
    Then the user validates the result of the transactions

    Examples:
      | startDate | endDate  | cardNumber         |
      | 16032022  | 17032022 | 005306917038421488 |

