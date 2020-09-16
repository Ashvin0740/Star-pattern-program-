import java.util.Scanner;

public class StarPattern14 {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Number:");
				int n = sc.nextInt();
				for(int i = 1; i<=n; i++)
				{
					for(int j =n;j>=i; j--) 
					{
					if(i==1 || j==n || i==j)
						System.out.print("*");
					else
						System.out.print(" ");
				     }
				System.out.println();
				

			    }
	}

}
