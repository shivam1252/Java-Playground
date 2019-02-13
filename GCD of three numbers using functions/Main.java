import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(gcd(n1, n2, n3));
    }
    public static int gcd(int n1, int n2, int n3)
    {
      int min = 0;
      if((n1 < n2) && (n1 < n3)) 
      {
        min = n1;
      }
      else if((n2 < n1) && (n2 < n3))
      {
        min = n2;
      }
      else
      {
        min = n3;
      }
      int m = 0;
      int temp = 0;
      for(int i = 1; i <= min; i++)
      {
        if((n1 % i == 0) && (n2 % i == 0))
        {
          m = i;
        }
      }
      temp = m;
      int z = 0;
      for(int j = 1; j <= min; j++)
      {
        if((temp % j == 0) && (n3 % j == 0))
        {
          z = j;
        }
      }
      return z;
    }
}
  