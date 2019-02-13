import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length()/2;
    StringBuilder sb1 = new StringBuilder("");
    for(int i = 1; i <= str.length() - n; i++)
    {
      StringBuilder sb = new StringBuilder("");
      for(int s = str.length()-i; s > 0; s--)
      {
        System.out.print(" ");
      }
       for(int k = n; k < n+i; k++)
       {
         sb.append(str.charAt(k));
         System.out.print(str.charAt(k));
       }
      System.out.println();
      sb1 = sb;
    }
    
    for(int i = 0; i < n; i++)
    {
      for(int s = n-i; s > 1; s--)
      {
        System.out.print(" ");
      }
      for(int j = 0; j < 1; j++)
      {
        sb1.append(str.charAt(i));
        System.out.print(sb1);
      }          
      System.out.println();
     }
          
        
    
}
}