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
    int list[] = new int[arr.length];
    for(int i=0; i<arr.length; i++){
        list[i] = arr[i];
    }
    int temp;
    for(int j = 0; j < n-1; j++)
    {
      if(arr[j] > arr[j+1])
      {
        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
    
    for(int k = 0; k < n; k++)
    {
      if(list[k] == arr[n-1])
      {
        System.out.println(k);
        break;
      }
    }
  }
}