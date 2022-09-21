package MatrixMultOpp1;

public class main {
	public static void main(String[] args) {
		
		//defines the first matrix
		int[][] matrixA = {
				{8, 3, 2, 3, 8, 3, 2},
				{1, 3, 2, 3, 8, 3, 2},
				{4, 2, 9, 2, 9, 1, 3},
				{8, 1, 3, 6, 4, 3, 0},
				{4, 2, 8, 3, 3, 7, 4},
				{8, 3, 2, 8, 9, 5, 6}
		};
		
		//defines the second matrix
		int[][] matrixB = {
				{1, 0, 2, 6, 7},
				{7, 1, 6, 8, 0},
				{4, 2, 1, 8, 2},
				{0, 3, 2, 1, 0},
				{8, 4, 0, 0, 1},
				{3, 2, 5, 3, 9},
				{8, 2, 9, 3, 7}
		};
		
		//sets up the product array
		int[][] productMatrix;
		
		//finds rows length
		int rowA = matrixA.length;
		int rowB = matrixB.length;
		
		//finds columns length
		int columnA = matrixA[0].length;
		int columnB = matrixB[0].length;
		
		//sets defines the answer's row and column
		productMatrix = new int[rowA][columnB];
		
		//sets up boolean to store if it is possible
		boolean pos;
		
		//checks if the second row equals the first column
		if(rowB != columnA) {
			System.out.println("The first Column does not equal the second row");
			
			//defines the variable that checks if the statement is possible to false
			pos = false;
		}
		else {
			
			//defines the variable that checks if the statement is possible to true
			pos = true;
			
			//loops through each variable in the product matrix
			for(int i = 0; i <= columnB -1; i++) {
				for(int j = 0; j <= rowA -1; j++) {
					
					
					//defines each variable in the product matrix
					for(int k = 0; k <= rowB -1; k++) {
						productMatrix[j][i] += matrixA[j][k] * matrixB[k][i];
					}
				}
			}		
		}
		
		//check if the variable that checks if the statement is possible is true
				if(pos) {
					
						//prints out the product matrix
						for(int m = 0; m <= rowA -1; m++) {
						System.out.print("| ");
							for(int l = 0; l <= columnB -1; l++) {
								System.out.print(productMatrix[m][l] + " ");
							}
							System.out.println("|");
						}
						System.out.println(rowA + " X " + columnB);
				}
				else {
					
					//prints out the error text
					System.out.println("Was not able to multiply.");
				}
	}
}

