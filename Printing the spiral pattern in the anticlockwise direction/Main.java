import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int min_row = 0;
    int max_row = n-1;
    int min_col = 0;
    int max_col = n-1;
    int arr[][] = new int[n][n];
    int k = 1;
    
    while((min_row <= max_row) && (min_col <= max_row))
    {
      for(int a = max_col; a >= min_col; a--)
      {
        arr[min_row][a] = k++;
      }
      
      for(int b = min_row+1; b <= max_row; b++)
      {
        arr[b][min_col] = k++;
      }
      
      for(int c = min_col + 1; c <= max_col; c++)
      {
        arr[max_row][c] = k++;
      }
      
      for(int d = max_row - 1; d >= min_row + 1; d--)
      {
        arr[d][max_col] = k++;
      }
      max_row--; min_row++; max_col--; min_col++;
    }
    
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < n; j++)
      {
        System.out.print(arr[i][j] +" ");
      }
      System.out.println();
    }
  }
}