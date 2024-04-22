# CSG Java Developer Coding Assignment
>Muhammad Farhan Kemal

## Project Description
Java project called Count Words that processes a List of String applying these business rules:
- Counts and returns the number of words that start with "M" or "m"
- Returns all the words longer than 5 characters.

## Run Project
* Go to src\com\csg and run this command  
    ```sh
    java CountWords.java
    ```  
* Can change the input from the code at src\com\csg\CountWords.java line 31

## Notes for accommodating frequently changing business rules  
To account for changing business rules and accommodating new ones, we design Count Words program with flexibility and extensibility. There are some strategies to handle this case:
* *Modular Design*: Separate different functionalities into individual methods or classes.
* *Test-Driven Development*: Implement unit test for each rule and ensure them to pass the test before integrating into the main codebase.
* *Documentation*: Document the purpose and behaviour of each rule. 

