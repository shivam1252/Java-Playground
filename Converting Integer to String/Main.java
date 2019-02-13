import java.util.Scanner;
//import java.Math;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = Math.abs(n);
    int count = 0;
    int rem = 0;
    StringBuilder sb = new StringBuilder(" ");
    while(temp > 0)
    {
      rem = temp % 10;
      temp = temp / 10;
      sb.append((char)(rem + 48));
    }
    //System.out.print(sb.reverse());
    if(n > 0)
    {
      System.out.print(sb.reverse());
    }
    else
    {
      System.out.print("-"+sb.reverse());
    }
   
    }
  }