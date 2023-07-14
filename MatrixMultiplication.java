import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for first Matrix : ");
		int FirstMatrixRow = sc.nextInt();
		System.out.println("Enter the number of columns for first Matrix : ");
		int FirstMatrixColumn = sc.nextInt();
		System.out.println("Enter the number of rows for second Matrix : ");
		int SecondMatrixRow = sc.nextInt();
		System.out.println("Enter the number of columns for second Matrix : ");
		int SecondMatrixColumn = sc.nextInt();

		if (FirstMatrixColumn != SecondMatrixRow) {
			System.out.println("Cannot multiply the matrices");
		} else {
			int[][] FirstMatrix = new int[FirstMatrixRow][FirstMatrixColumn];
			int[][] SecondMatrix = new int[SecondMatrixRow][SecondMatrixColumn];
			int[][] ResultantMatrix = new int[FirstMatrixRow][SecondMatrixColumn];

			System.out.println("Enter values of First Matrix : ");
			for (int i = 0; i < FirstMatrixRow; i++) {
				for (int j = 0; j < FirstMatrixColumn; j++) {
					FirstMatrix[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter values of Second Matrix : ");
			for (int i = 0; i < SecondMatrixRow; i++) {
				for (int j = 0; j < SecondMatrixColumn; j++) {
					SecondMatrix[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < FirstMatrixRow; i++) {
				for (int j = 0; j < FirstMatrixColumn; j++) {
					for (int k = 0; k < SecondMatrixColumn; k++) {
						ResultantMatrix[i][j] += FirstMatrix[i][k] * SecondMatrix[k][j];
					}
				}
			}

			System.out.println("First Matrix : ");
			for (int i = 0; i < FirstMatrixRow; i++) {
				for (int j = 0; j < FirstMatrixColumn; j++) {
					System.out.print(FirstMatrix[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("Second Matrix : ");
			for (int i = 0; i < SecondMatrixRow; i++) {
				for (int j = 0; j < SecondMatrixColumn; j++) {
					System.out.print(SecondMatrix[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("Result Matrix : ");
			for (int i = 0; i < FirstMatrixRow; i++) {
				for (int j = 0; j < SecondMatrixColumn; j++) {
					System.out.print(ResultantMatrix[i][j] + "\t");
				}
				System.out.println();
			}

		}

	}

}