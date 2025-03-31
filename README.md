# Gess-Number-game
Guess the Number Game

Description

This is a simple number guessing game where the program generates a random number between 1 and 100, and the user tries to guess it. The program provides feedback on whether the guess is 'Hot' (close to the number) or 'Cold' (far from the number). The game continues until the correct number is guessed.

How to Run

Compile the Java files:

javac Main.java RanGen.java Gamelogic.java

Run the game:

java Main

Classes and Their Roles

Main: The entry point of the program. It generates a random number and manages the game loop.

RanGen: Generates a random number between 1 and 100.

Gamelogic: Handles user input and checks the guess against the generated number, providing hints.
