import java.util.Scanner;

public class HQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of line for input: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] s=new String[n];
		System.out.println("Enter line : ");
		for(int i=0; i<n; i++)
			s[i]= sc.nextLine();
		System.out.println("Lines in reverse order are : ");
		for(int j=n-1;j>=0;j--)
			System.out.println(s[j]);
			sc.close();
		}

	}