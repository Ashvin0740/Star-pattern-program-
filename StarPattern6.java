import java.util.Scanner;
public class StarPattern6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows you want in this pattern?");

        int n = sc.nextInt();

        System.out.println("Here is your pattern....!!!");
        
        for (int i= 0; i<= n-1 ; i++)
        {
            for (int j=n-1; j>i; j--)
            {
                 System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                 System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

/*output
How many rows you want in this pattern?
6
Here is your pattern....!!!
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *
*/
