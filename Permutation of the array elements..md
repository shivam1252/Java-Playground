# Playground : Permutation of the array elements.

import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] =  {10, 20, 30, 40, 50};
    int shuffle[] = {2, 4, 3, 0, 1};
    int temp[] = new int[n];
    
    int count = 0;
    for(int i = 0; i < n; i++)
    {
      count = shuffle[i];
      temp[count] = arr[i];
    }
    
    for(int i = 0; i < n; i++)
    {
      System.out.print(temp[i] +" ");
    }
    
  }
}
