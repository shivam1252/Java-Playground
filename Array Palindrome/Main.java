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
      int count = 0;
      int i = 0;
      int j = n-1;
      while(i < j)
      {
        if(arr[i] != arr[j])
         {
           count = 1;
           break;
         }
         i++;
         j--;
     }
     if(count == 0)
     {
       System.out.print("Yes");
     }
      else
        System.out.print("No");
      
   }
}
