import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = n;
      int sum = 0, rem = 0;
      while(num > 0)
      {
        int j = 1;
        rem = num % 10;
        for(int i = 1; i <= rem; i++)
           j = i*j;
        sum += j;
        num = num / 10; 
      }
      
      if(n == sum)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
	}
}