import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = in.nextInt();
      }
      int check = 1;
      int count = 0;
      int max_count = 0;
      for(int i = 0; i < 1; i++)
      {
        for(int j = 0; j < n; j++)
        {
          if(arr[j] == check)
          {
            count++;
          }
          else
          {
            if(count > max_count)
            {
            max_count += count;
            count = 0;
            }
          }
        }
        System.out.print(max_count);
      }
        
    }
}