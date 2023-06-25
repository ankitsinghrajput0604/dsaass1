import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int count = 0;
		int i = 1;
		if (n > 2) {
			while (n > 2) {
				i = n / 2;
				count++;
			}
			System.out.println("The number " + n + " can be divided by 2 repetedly upto " + count
					+ " times before getting a value less than 2 ");

		} else {
			System.out.println("The given number is less then 2");
		}

	}

}
