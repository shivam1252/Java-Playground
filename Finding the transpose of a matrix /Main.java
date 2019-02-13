import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int mat1[][] = new int[row][col];
    //int transpose[] = new int[col][row];
    for(int a = 0; a < row; a++)
    {
      for(int b = 0; b < col; b++)
      {
        mat1[a][b] = in.nextInt();
      }
    }
    for(int i = 0; i < col; i++)
    {
      for(int j = 0; j < row; j++)
      {
        System.out.print(mat1[j][i] +" ");
      }
      System.out.println();
    }
  }
}
    