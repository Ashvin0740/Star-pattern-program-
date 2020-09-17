import java.util.Scanner;

public class StarPattern15
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number  ");
        int n = scanner.nextInt();
        
        for (int i=1; i<=n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= i*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = i; l <= n; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = i*2-2; k < n*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}