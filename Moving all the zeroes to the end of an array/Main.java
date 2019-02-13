import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int arr_1[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
      }
      int a = 0;
      for(int j = 0; j < n; j++)
      {
        if(arr[j] != 0)
        {
          arr_1[a] = arr[j];
          a++;
        }
      }
      int count = n - a;
      for(int k = 0; k < count; k++)
      {
        arr_1[a + k] = 0;
      }
      
      for(int l = 0; l < arr_1.length; l++)
      {
        System.out.print(arr_1[l] +" ");
      }
    }
}