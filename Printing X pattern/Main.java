import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = n / 2 + 1;
      int p = n-m;
      for(int i = 1; i <= m; i++)
      {
        for(int space = 1; space < i; space++)
        {
          System.out.print(" ");
        }
        for(int k = i; k <= n-i+1; k++)
        {
          if((k == i) || (k == n-i+1))
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.println(" ");
      } 
      
      for(int i = m-1; i > 0; i--)
      {
        for(int space = 1; space < i; space++)
        {
          System.out.print(" ");
        }
        for(int k = i; k <= n-i+1; k++)
        {
          if((k == i) || (k == n-i+1))
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.println(" ");
      }
	}
}