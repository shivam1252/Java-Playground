import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      int key = sc.nextInt();
      if(ch >= 'a' && ch <= 'z')
      {
        ch = (char) (ch + 26 - key);
        System.out.println(ch);
      }
      if(ch >= 'A' && ch <= 'Z')
      {
        ch = (char) (ch - key);
        System.out.println(ch);
      }
      
         
    }
}