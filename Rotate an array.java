import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rotation = sc.nextInt();
    int arr[] = {1, 2, 3, 4, 5};
    rotate(arr, n, rotation);
  }
  public static void rotate(int arr[], int n, int a)
  {
    
    for(int i = 0; i < a; i++)
    {
      int temp = 0;
      temp = arr[0];
      for(int j = 1; j < n; j++)
      {
        arr[j-1] = arr[j];
      }
      arr[n-1] = temp;
    }
    for(int k = 0; k < n; k++)
    {
      System.out.print(arr[k] +" ");
    }
    
  }
}