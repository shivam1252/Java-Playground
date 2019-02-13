import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(in.nextLine());
    String str = new String(in.nextLine());
    int count = 0;
    for(int i = 0; i <= sb.length() - str.length(); i++)
    {
      String sub_str = sb.substring(i, str.length() + i);
      if (sub_str.equals(str))
      {
        count++;
      }
    }
    System.out.print(count);

    
  } 
}