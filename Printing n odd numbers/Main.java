import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = n*2-1;
      for(int i = 1; i <= m; i++)
      {
        if(i % 2 == 1)
          System.out.println(i);
      }
      
          
          
	}
}