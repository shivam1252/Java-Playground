import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = in.nextInt();
      }
      int check[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        check[i] = i+1;
      }
      
      for(int j = 0; j < n; j++)
      {
        int count = 0;
        for(int k = 0; k < n; k++)
        {
          if(check[j] == arr[k])
          {
            count = 1;
            break;
          }
        }
        if(count == 0)
        {
        System.out.print(check[j]);
        }
      }
        
      
    }
}