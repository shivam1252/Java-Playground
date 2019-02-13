import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    int mat3[][] = new int[row][col];
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
      sub_mat(mat1, mat2, mat3, row, col);
  }
    public static void sub_mat(int mat1[][], int mat2[][], int mat3[][], int row, int col)
    {
      for(int i = 0; i < row; i++)
      {
        for(int j = 0; j < col; j++)
        {
          mat3[i][j] = mat1[i][j] - mat2[i][j];
        }
      }
      disp_mat(mat3);
    }
    public static void disp_mat(int mat3[][])
    {
      for(int k = 0; k < mat3.length; k++)
      {
        for(int l = 0; l < mat3[k].length; l++)
        {
          System.out.print(mat3[k][l] +" ");
        }
        System.out.println();
      }
    }
          
    }
  