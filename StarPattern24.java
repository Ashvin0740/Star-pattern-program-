import java.util.Scanner;

public class StarPattern24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		char n = (char) sc.nextInt();
	     char ch = 'A';
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(ch);
	            }
	            ch++;
	            System.out.println();
	        }
	     }

	}
