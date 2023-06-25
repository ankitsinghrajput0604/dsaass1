import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		double arr[][] = new double[4][4];
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 4; j++)
				arr[i][j] = obj.nextDouble();
		for (int k = 0; k < 4; k++)
			System.out.println("Sum of the elements at column " + k + "  is  " + sumColumn(arr, k));
		obj.close();
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				if (j == columnIndex)
					sum += m[i][j];

		return sum;

	}

}
