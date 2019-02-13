import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      //StringBuilder str = new StringBuilder(sc.nextLine());
      StringBuilder sb = new StringBuilder(sc.nextLine());
      StringBuilder temp = new StringBuilder("");
      int j = sb.length()-1;
      int count = 1;
      for(int i = 0; i < sb.length(); i++)
      {
        if(sb.charAt(i) != sb.charAt(j))
        {
             count = 0;
             break;
        }
        j--;
      }
      if(count == 1)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
    } 
}