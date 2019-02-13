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
      int index = 1;
      int largest = 0;
      for(int i = 0; i < n; i++)
      {
        int count = 1;
        
        for(int j = i; j < n-1; j++)
        {
         if(arr[i] == arr[j+1])
         {
           count++;
         }
        }
        if(count > largest)
        {
          largest = count;
          index = i;
        }
      }
      System.out.print(arr[index]);
    }
}