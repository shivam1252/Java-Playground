import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder("");
    String[] arr = str.split(" ");
    
    int i;
    for(i = 0; i < arr.length; i++)
    {
      sb = new StringBuilder("");
      String temp = arr[i];
      sb.append(temp);
      System.out.print(sb.reverse() +" ");
    }
  }
}