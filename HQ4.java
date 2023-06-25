import java.util.Scanner;

public class HQ4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter length of row and column : ");
		int m = obj.nextInt();
		int n = obj.nextInt();
		double x[][] = new double[m][n];
		double y[][] = new double[m][n];
		double z[][] = new double[m][n];
		System.out.println("Enter element of first element : ");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				x[i][j] = obj.nextDouble();
		System.out.println("Enter element of second element : ");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				y[i][j] = obj.nextDouble();
		System.out.println("The addition of two array is : ");
		z = addMatrix(x, y);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(z[i][j] + " ");
			System.out.println();
		}
		obj.close();

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		int row = a.length;
		int column = a[0].length;
		double sum[][] = new double[row][column];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				sum[i][j] = a[i][j] + b[i][j];
		return sum;

	}

}
