import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      String temp = str1.concat(str1);
      int count = 0;
      for(int i = 0; i < temp.length()-str2.length(); i++)
      {
        if(temp.substring(i, str2.length()+i).equals(str2))
        {
         count = 1;
        }
      }
      if(count == 1)
      {
        System.out.print("Yes");
      }
      else
        System.out.print("No");
    }
}