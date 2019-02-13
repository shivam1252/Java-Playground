import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    for(int a = 0; a < row; a++)
    {
      for(int b = 0; b < col; b++)
      {
        mat1[a][b] = in.nextInt();
      }
    }
    for(int a = 0; a < row; a++)
    {
      for(int b = 0; b < col; b++)
      {
        mat2[a][b] = in.nextInt();
      }
    }
    int count = 0;
    for(int i = 0; i < mat1.length; i++)
    {
      for(int j = 0; j < mat1[i].length; j++)
      {
        if(mat1[i][j] != mat2[i][j])
        {
          count = 1;
          break;
        }
      }
    }
    if(count == 0)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}