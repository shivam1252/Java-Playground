import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int mat[][] = new int[row][col];
    for(int a = 0; a < row; a++)
    {
      for(int b = 0; b < col; b++)
      {
        mat[a][b] = in.nextInt();
      }
    }
    
    for(int i = 0; i < mat.length; i++)
    {
     for(int j = 0; j < mat.length - i; j++)
     {
       for(int k = j+i; k <= j+i; k++)
       {
         System.out.print(mat[j][k] +" ");
       }
     }
    }
    
  }
}
         