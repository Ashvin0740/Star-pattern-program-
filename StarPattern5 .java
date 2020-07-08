import java.util.Scanner;

public class StarPattern5 {

	public static void main(String[] args) {
		System.out.print(" enter the number:");
		    Scanner number = new Scanner(System.in); 
			int n = number.nextInt();
			 
			for(int i=1; i<=n;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=n;k>=i;k-- )
				{
					System.out.print("*");
				}
				System.out.println();

			}
			 
			


		}
	
	}