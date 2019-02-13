import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int check[] = new int[k];
      for(int i = 0; i < k; i++)
      {
        check[i] = i+1;
      }
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
      }
      
      for(int j = 0; j < k; j++)
      {
        int count = 0;
        for(int v = 0; v < n; v++)
        {
          if(check[j] == arr[v])
          {
            count++;
          }
        }
        System.out.println(check[j] +" " +count);
    }
}
}