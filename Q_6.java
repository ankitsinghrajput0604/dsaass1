import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x = obj.nextInt();
		System.out.println(x + " is odd : " + isOdd(x));
		obj.close();
	}

	public static boolean isOdd(int n) {
		int b = n & 1;
		if (b == 0)
			return false;
		else
			return true;

	}

}
