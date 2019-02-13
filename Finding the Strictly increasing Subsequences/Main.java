import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int a = 0; a < n; a++)
    {
      arr[a] = in.nextInt();
    }
    
    for(int i = 0; i < n-1; i++)
    {
      if(arr[i] < arr[i+1])
       {
        System.out.println(arr[i]+","+arr[i+1]);
       }
      for(int j = i+2; j < n; j++)
      {
        if(arr[i] < arr[j])
        {
          int count = 0;
          for(int k = i+1; k < j; k++)
          {
            if(arr[j] < arr[k])
            {
              count = 1;
            }
          }
          if(count == 0)
          {
            System.out.println(arr[i]+","+arr[j]);
          }
        }
      }
    }
          
          
        
    
  }
}