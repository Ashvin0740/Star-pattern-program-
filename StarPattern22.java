import java.util.Scanner;

public class StarPattern22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");

		int n =sc.nextInt();
		
		for(int i = n; i>0; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(i%2);
			}
			System.out.println();
		}
		
	}

}
