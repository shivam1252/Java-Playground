import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    int sum = arr[0] + arr[1] + arr[2];
    int sum_1 = 0; 
    for(int j = 3; j < n; j += 3)
    {
      sum_1 = arr[j] + arr[j+1] + arr[j+2];
    }
    if(sum == sum_1)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
      
  }
} 