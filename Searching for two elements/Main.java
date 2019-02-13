import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
      }
      int search_1 = sc.nextInt();
      int search_2 = sc.nextInt();
      int temp = 0;
      int z = 0;
      for(int j = 0; j < n; j++)
      {
        if(arr[j] == search_1)
        {
          temp = 1;
          z = j;
          break;
        }
      }
      if(temp == 1)
      {
        System.out.println(z);
      }
      else
      {
        System.out.println("-1");
      }
      temp = 0;
      for(int k = 0; k < n; k++)
      {
        if(arr[k] == search_2)
        {
          temp = 1;
          z = k;
          break;
        }
      }
      if(temp == 1)
      {
        System.out.println(z);
      }
      else
      {
        System.out.println("-1");
      }
      
      
    }
}
 