import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0; i < n; i++)
      {
        for(int space = 1; space <= (n-(n-i)); space++)
        {
          System.out.print(" ");
        }
         for(int k = 0; k < n-i; k++)
         {
           System.out.print("* ");
         }
         System.out.println();
      }
      
    
  }
}