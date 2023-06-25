import java.util.*;
public class Q_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int sum = 0,Product=1,t=n;
		while(n>0) {
			int r= n%10;
			sum+=r;
			Product*=r;
			n/=10;
		}
		if(sum==Product)
			System.out.println(t+" is a spy number");
		else
			System.out.println(t+" is not a spy number ");
		sc.close();

	}

}
