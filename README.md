# Hand-cricket-with-java

A full-featured, two-innings Hand Cricket simulator written in Java. 
This CLI application features a toss system (Bat/Bowl selection), target-chasing logic, and modular game state management. 
It highlights Java's strict type system and object-oriented approach to game loops.

## Java Hand Cricket (Only Batting)

This module represents the first phase of a full cricket simulation, focusing on single-user batting logic and score accumulation.

##  Advanced Advanced Java Hand Cricket (Both Batting and Bowling) 

A robust Command Line Interface (CLI) implementation of the popular "Hand Cricket" game. 
Unlike basic versions, this simulator supports a full two-innings match where the user can choose to bat or bowl first and must defend or chase a target score.

##  Game Features

- Toss System: Choose to BAT or BOWL at the start of the game.
- Full Two-Innings Logic: Tracks scores for both the User and the CPU.
- Target Chasing: The game automatically detects when the chasing team surpasses the target and ends the match.
- Input Validation: Built-in protection against non-integer inputs and out-of-range moves (1-10).
- Dynamic Feedback: Real-time score updates and "Out" detection.

##  Technical Implementation

- Modular Methods: Uses a centralized `playInnings()` method to handle both batting and bowling phases, demonstrating code reusability.
- Conditional Game States: Manages different logic for the "Target Setter" vs. the "Target Chaser."
- Standard Libraries: - `java.util.Scanner`: For robust user input.
  - `java.util.Random`: For unpredictable CPU moves.

