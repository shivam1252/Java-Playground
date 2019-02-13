import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int a = 0; a < n; a++)
    {
      arr[a] = sc.nextInt();
    }
    for(int i = 0; i < n-1; i++)
    {
      for(int j = i; j < n-1; j++)
      {
        if(arr[i] < arr[j+1])
        {
          System.out.println(arr[i]+"," +arr[j+1]);
        }
      }
    }
               
  }
}