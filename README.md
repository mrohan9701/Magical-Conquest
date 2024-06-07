# Magical Arena

## Description
This is turn-based fighting game where two players attack and defend in turns. The game continues until one player's health reaches zero.

## How to Run
1. Compile the code:
    
    javac -d bin src/main/java/com/magicalarena/*.java
    
2. Run the game:

    java -cp bin com.magicalarena.Game
    

## How to Test

1. Compile the test code:
    
    javac -d bin -cp .:junit-4.12.jar:hamcrest-core-1.3.jar src/test/java/com/magicalarena/*.java
    
2. Run the tests:
    
    java -cp bin:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore com.magicalarena PlayerTest
    java -cp bin:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore com.magicalarena.DiceTest
    java -cp bin:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore com.magicalarena.GameTest
    

## Dependencies
- JUnit 4.12 (for unit testing)
- Hamcrest 1.3 (for unit testing)


