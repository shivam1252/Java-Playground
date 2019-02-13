import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
      }
      int lar_num = sc.nextInt();
      int temp = 0;
      for(int j = 0; j < n; j++)
      {
        for(int k = 0; k < n-j-1; k++)
        {
          if(arr[k] > arr[k+1])
          {
            temp = arr[k];
            arr[k] = arr[k+1];
            arr[k+1] = temp;
          }
        }
      }
      System.out.print(arr[arr.length - lar_num]); 
                        
    }   
}