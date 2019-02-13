import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder("");
    int vowel[] = {'a', 'e', 'i', 'o', 'u'};
    for(int i = 0; i < str.length(); i++)
    {
      int count = 0;
      for(int j = 0; j < vowel.length; j++)
      {
        if(str.charAt(i) == vowel[j])
        {
          count = 1;
        }
      }
      if(count == 0)
      {
        sb.append(str.charAt(i));
      }
    }
    System.out.print(sb);
                  
          
  }
}