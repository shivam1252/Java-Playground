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
    
    for(int i = mat.length - 1; i >= 0 ; i--)
    {
      for(int j = 0; j < mat[i].length; j++)
      {
        System.out.print(mat[j][i] +" ");
      }
      System.out.println();
    }
  }
}