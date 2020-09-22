import java.util.Scanner;
public class StarPattern25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		char n = (char) sc.nextInt();
	     char ch = 'A';
	        for (int i = 1; i <= n; i++) {
	            for (int j = n; j >= i; j--) {
	                System.out.print(ch);
	            }
	            ch++;
	            System.out.println();
	        }
	     }

	}
