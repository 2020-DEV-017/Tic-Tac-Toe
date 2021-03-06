# TIC-TAC-TOE

   Two players take turns marking an available cell in 3 X 3 Game board with their respective tokens (either "X" or "O"). When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over and that player has won. A draw (no winner) occurs when all the cells on the grid have been filled with tokens and neither player has achieved a win.

## Purpose:

  This game is developed using Java programming language using TDD (Test Driven Development)

## Problem Statement:

   https://github.com/stephane-genicot/katas/blob/master/TicTacToe.md

## Use-Cases:

	- When Game starts, it assigns to first player with "X".
	- Game will Alternate the players, 
		○ Mark the token as "O" if the previous choice is "X"
		○ Mark the token as "X" if the previous choice is "O"
	- Game will not allow the user to choose a position outside grid size.
	- Game will not allow the player to use an already chosen position.
	- Game will declare first player as winner and stop,
		○ If token is "X" in one of the 3 Horizontal rows.
		○ If token is "X" in one of the 3 Vertical columns.
		○ If token is "X" in one of the 2 diagonals (top-left to bottom-right and top-right to bottom-left).
	- Game will declare second player as winner and stop,
		○ If token is "O" in one of the 3 Horizontal rows.
		○ If token is "O" in one of the 3 Vertical columns.
		○ If token is "O" in one of the 2 diagonals  (top-left to bottom-right and top-right to bottom-left).
	- Game will be  declared as draw,
		○ If all nine squares are filled with no winning combination.
	- Display game result to Players (optional)
		○ Print game board in console.

## Unit Test Cases Covered:
```
 - Case 1: When Game starts, it assigns to first player with "X".
	Test Case:
		 Player1 will choose the position ([0,0]) and the game should give token "X" for it.

 - Case 2: Game will Alternate players.
	-  Mark the token as "O" if the previous choice is "X"
	Test Case: 
		Player2 will choose the position ([0,1]) after Player1 and the game should give token "O" for it.

	- Mark the token as "X" if the previous choice is "O"
	Test Case :
		Game should identify the third play  is from Player 1 at position ([1,0]) and should give token "X" for it.

 - Case 3: Game will not allow the user to choose a position outside grid size.
	Test Case:
		Player should get invalid position exception if position ([2,3]) is chosen beyond grid dimension

 - Case 4: Game will not allow the player to use an already chosen position.
        Test Case:
                Player should get invalid position exception if position ([0,0]) is chosen as position already taken.

 - Case 5: Game will declare player1 as winner and stop,
	- If token is "X" in one of the 3 Horizontal rows.
	Test Cases:
		○ Game should stop and declare Player1 as winner if 1st row ([0,0] [0,1] [0,2]) has "X".
		○ Game should stop and declare Player1 as winner if 2nd row ([1,0] [1,1] [1,2]) has "X".
		○ Game should stop and declare Player1 as winner if 3rd row ([2,0] [2,1] [2,2]) has "X".

        - if token is "X" in one of the 3 Vertical columns.
	Test Cases:
		○ Game should stop and declare Player1 as winner if 1st columns ([0,0] [1,0] [2,0]) has "X".
		○ Game should stop and declare Player1 as winner if 2nd columns ([0,1] [1,1] [2,1]) has "X".
		○ Game should stop and declare Player1 as winner if 3rd columns ([0,2] [1,2] [2,2]) has "X".
	
        - if token is "X" in one of the 2 diagonals (top-left to bottom-right and top-right to bottom-left).
	Test Cases:
		○ Game should stop and declare Player1 as winner if top-right to bottom-left diagonal ([0,0] [1,1] [2,2]) has "X".
		○ Game should stop and declare Player1 as winner if top-left to bottom-right diagonal ([0,2] [1,1] [2,0]) has "X".

- Case 6: Game will declare player2 as winner and stop,
	- if token is "O" in one of the 3 Horizontal rows.
	Test Cases:
		○ Game should stop and declare Player2 as winner if 1st row ([0,0] [0,1] [0,2]) has "O".
		○ Game should stop and declare Player2 as winner if 2nd row ([1,0] [1,1] [1,2]) has "O".
                ○ Game should stop and declare Player2 as winner if 3rd row ([2,0] [2,1] [2,2]) has "O".

 	- if token is "O" in one of the 3 Vertical columns.
 	Test Cases:
 		○ Game should stop and declare Player2 as winner if 1st columns ([0,0] [1,0] [2,0]) has "O".
 		○ Game should stop and declare Player2 as winner if 2nd columns ([0,1] [1,1] [2,1]) has "O".
 		○ Game should stop and declare Player2 as winner if 3rd columns ([0,2] [1,2] [2,2]) has "O".

	- if token is "O" in one of the 2 diagonal  (top-left to bottom-right and top-right to bottom-left).
	Test Cases:
		○ Game should stop and declare Player2 as winner if top-right to bottom-left diagonal ([0,0] [1,1] [2,2]) has "O".
		○ Game should stop and declare Player2 as winner if top-left to bottom-right diagonal ([0,2] [1,1] [2,0]) has "O".

- Case 7: Game will be declared as draw,
 	- if all nine squares are filled.
 	Test Case:
                ○ Game should stop

- Case 8: Display game result to Players (optional)
        Test Case:
                ○ Print game board in console.
```
## Build and Execute:
```
Build: 
	- mvn clean install
```
```
Execute:
	- Run the test case using IDE/Command prompt using mvn clean install
		○ Game result for the win or Draw cases will be printed in the console.
		○ Result of the test case execution status can be observed.
	
Note: Maven and Java (greater than 1.6) should be available in your machine.
```
## Acknowledgement:

* [FizzBuzz](https://youtu.be/T38L7A0xP-c) - FizzBuzz example using TDD
* [Test Driven Development](https://www.youtube.com/watch?v=uGaNkTahrIw) - TTD in Agile practice
* [README](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2) - Reference for writing and formatting syntax in README file