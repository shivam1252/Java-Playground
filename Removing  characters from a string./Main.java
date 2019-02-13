import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());
    String str = sc.nextLine();
    for(int i = 0; i < str.length(); i++)
    {
     for(int j = 0; j < sb.length(); j++)
      {
        if(str.charAt(i) == sb.charAt(j))
        {
          sb.setCharAt(j, '$');
        }
      }
    }
    for(int k = 0; k < sb.length(); k++)
    {
      if(sb.charAt(k) != '$')
      {
        System.out.print(sb.charAt(k));
      }
    }
    
  }
}