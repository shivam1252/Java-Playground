import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i = 1; i <= n; i++)
      {
        if((i == 1) || (i == n))
        {
          for(int j = 1; j <= n; j++)
          {
            System.out.print("*");
          }
        }
        else
        {
          for(int k = 1; k <= n; k++)
          {
            if((k == 1) || (k == n))
            {
              System.out.print("*");
            }
            else
            {
              System.out.print(" ");
            }
          }
        }
        System.out.println(" ");
      }
	}
}