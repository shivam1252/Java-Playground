import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String str1 =  str.toLowerCase();
      String alph = "abcdefghijklmnopqrstuvwxyz";
      
      for(int i = 0; i < alph.length(); i++)
      {
        int count = 0;
        for(int j = 0; j < str1.length(); j++)
        {
          if(alph.charAt(i) == str1.charAt(j))
          {
            count = 1;
            //break;
          }
        }
        if(count == 0)
        {
          System.out.print(alph.charAt(i));
          System.out.print(" ");
        }
      }
        
        
      
    }
}