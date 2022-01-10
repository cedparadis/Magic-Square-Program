//-------------------------------------------------------
//Assignment 3 
//Written by: Cédric Paradis - student ID: 40158491
//For COMP 248 Section U 2204 – March 16th, Winter 2021
//--------------------------------------------------------
package assignment3;

public class Question1 {

	public static void main(String[] args) {

		/**
		 *  This program randomly generates a 3X3 matrix where the position of the array moves randomly until the program can generate a magic square.
		 *   In other word, the program outputs a matrix where the sums of the rows, columns, and diagonals equal each other.
		 */

		// Display welcome message

		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Welcome to the Magic Square Program!");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println();



		// Declare a two dimension array with each of the number 1,2,3,...9

		int[][] magicSquare = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};

		boolean endOfProgram = false; // to end the while loop when the program generates the magic square
		final int MAGICSUM = 15; // the sum that each row, column and diagonals must equal for a magic square

		// Indicate the user that the program generated a matrix

		System.out.println("The randomly generated matrix is: ");



		// While loop to generate random matrix until the magic square is generated

		while (!endOfProgram)
		{

			// For loop to randomly shuffle the positions of the array

			for (int i =0; i < magicSquare.length; i++) // rows
			{
				for (int j = 0; j < magicSquare[i].length; j++) // columns
				{
					int i1 = (int)(Math.random()* magicSquare.length ); // assign new variables to swap for the rows
					int j1 = (int)(Math.random()* magicSquare[i].length); // assign new variables to swap for the columns

					// Store the array in a temporary integers to swap with the new variables

					int temp = magicSquare[i][j];
					magicSquare[i][j] = magicSquare[i1][j1];
					magicSquare[i1][j1] = temp;

				} //ends j loop which controls columns
			} //end i loop which controls row




			// Calculating the sum of the diagonals

			int sum = 0, sum2 = 0;
			for (int i = 0; i < magicSquare.length; i++) // first diagonal
			{
				sum = sum + magicSquare[i][i];

			} //end of loop diagonal 1

			for (int i = 0; i < magicSquare.length; i++) // second diagonal
			{
				sum2 = sum2 + magicSquare[i][magicSquare.length - 1 -i];
			} //end of loop diagonal 2

			// If condition to verify the diagonal have the same sum

			if (sum!=MAGICSUM)
			{

				continue; // go back to the while loop to generate a new number
			}

			if (sum2!= MAGICSUM )
			{
				continue;
			}


			// Calculating the sum of Row 1

			int rowSum1 = 0, rowSum2 = 0, rowSum3 =0 ;


			for (int i = 0; i <=0; i++) // for loop for the first row
			{

				for (int j = 0; j< magicSquare[i].length; j++)
				{
					rowSum1 = rowSum1 + magicSquare[i][j];


				} // end of j loop row



			} // end of i loop row

			// Calculating the sum of Row 2

			for (int i = 1; i <=1; i++) // for loop for the second row
			{

				for (int j = 0; j< magicSquare[i].length; j++) 
				{
					rowSum2 = rowSum2 + magicSquare[i][j];

				} // end of j loop row2



			} // end of i loop row2




			// Calculating the sum of Row 3

			for (int i = 2; i <=2; i++)  // for loop for the third row
			{

				for (int j = 0; j< magicSquare[i].length; j++) 
				{
					rowSum3 = rowSum3 + magicSquare[i][j];

				} // end of j loop row3



			} // end of i loop row3

			// If conditions to verify the rows have the same value

			if (rowSum1 != MAGICSUM)
			{
				continue; // go back to the while loop to generate a new number
			}

			else if (rowSum2 != MAGICSUM)
			{
				continue;
			}
			else if (rowSum3 != MAGICSUM) {
				continue;
			}



			// Calculate the sum of column 1

			int colSum1 = 0, colSum2 = 0, colSum3 = 0; // for loop for the first column
			for (int i =0; i < magicSquare.length; i++)
			{

				for (int j = 0; j <= 0; j++)
				{
					colSum1 = colSum1 + magicSquare[i][j];
				} // end of j loop column

			} // end of for loop

			// Calculate the sum of column 2

			for (int i =0; i < magicSquare.length; i++) // for loop for the second column
			{

				for (int j = 1; j <= 1; j++)
				{
					colSum2 = colSum2 + magicSquare[i][j];
				} // end of j loop column


			} // end of for loop


			// Calculate the sum of column 3

			for (int i =0; i < magicSquare.length; i++) // for loop for the third column
			{

				for (int j = 2; j <= 2; j++)
				{
					colSum3 = colSum3 + magicSquare[i][j];
				} // end of j loop column


				// If conditions to verify the rows have the same value

				if (colSum1!= MAGICSUM)
				{
					continue; // go back to the while loop to generate a new number
				}
				else if(colSum2!=MAGICSUM)
				{
					continue;
				}
				else if (colSum3!=MAGICSUM)
				{
					continue;
				}


				endOfProgram = true; // exit the program if all the sums are equal

			} // end of for loop
		}// end of while loop



		// Print the matrix

		for (int i = 0; i < magicSquare.length; i++)
		{
			for (int j = 0; j < magicSquare[i].length; j++)
			{
				System.out.printf("%8d", magicSquare[i][j]);
			} //ends j

			System.out.println();

		} //ends i

		/*
		 * Display a closing message to let the user that the program has terminated
		 */

		System.out.println("\nThank you for using Magic Square Program!");

	}
}


