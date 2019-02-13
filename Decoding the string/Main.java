import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(in.nextLine());
    int key = in.nextInt();
    for(int i = 0; i < sb.length(); i++)
    {
      char ch = sb.charAt(i);
      if(sb.charAt(i) != ' ')
      {
      if((ch >= 'a') && (ch <= 'z'))  
      {
      if((sb.charAt(i) - key) < 97)
      {
        ch = (char)((26 - key) + sb.charAt(i));
        sb.setCharAt(i, ch);
      }
      else
      {
      ch = (char) (sb.charAt(i) - key);
      sb.setCharAt(i, ch);
      }
      }
      else
      {
        if((sb.charAt(i) - key) < 65)
        {
         ch = (char)((26 - key) + sb.charAt(i));
         sb.setCharAt(i, ch);
        }
        else
        {
        ch = (char) (sb.charAt(i) - key);
        sb.setCharAt(i, ch);
        }
      }
    }
  }
    System.out.print(sb);
}
}