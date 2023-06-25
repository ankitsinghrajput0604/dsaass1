import java.util.Scanner;

public class Q_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		double arr[][] = new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				arr[i][j] = obj.nextDouble();

		System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(arr));
		obj.close();
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				if (i == j)
					sum += m[i][j];

		return sum;

	}

}
