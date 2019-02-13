import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++)
    {
      System.out.println(fact(i));
    }
  }
  public static int fact(int num)
  {
    int a = 1;
    for(int i = 1; i <= num; i++)
    {
      a *= i;
    }
    return a;
  }
}
