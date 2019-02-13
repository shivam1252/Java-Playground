import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n/2;
    int arr[] = new int[n];
    for(int a = 0; a < n; a++)
    {
      arr[a] = in.nextInt();
    }
    int count = 0;
    for(int i = 0; i < temp; i++) 
    {
      for(int j = 0; j < temp-1-i; j++)
      {
        if(arr[j] > arr[j+1])
        {
          count = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = count;
        }
      }
    }
    for(int d = 0; d < n; d++)
    {
      System.out.print(arr[d] +" ");
    }
      
  }
}