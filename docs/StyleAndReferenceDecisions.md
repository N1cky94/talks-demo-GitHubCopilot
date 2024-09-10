# Style and Reference Decisions

This document lies down some rules for styling our code and decisions
made in the writing of our code.

## Styling

1. Clear and descriptive names are used
2. Methods are written in an active way that contains a verb
3. Class names describe the main function of the class's methods
4. Classes adhere to the Single Responsibility Principle: "A class should have only one reason to change"
5. Field names should clearly explain their function within the class
6. Variable names should clearly state the reason for existence and scope

## Technical Decisions

1. All tests are given a `@DisplayName` attribute in a "Given ... When ... Then" format that is explanatory to the behaviour under test.
2. All tests are build according to AAA
3. Unit tests should test the core functionality and the meaningful boundaries.
4. The `var` keyword is used for all variables in local scope that are not returned
5. The `var` keyword can not be used for variables that are returned in a method or who are assigned as field later in the code
6. The `var` keyword can not be used for variables in tests that have the type of the class under test