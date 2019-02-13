import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = n;
      int rem = 0, sum = 0;
      while(num > 0)
      {
         rem = num % 10;
         sum += rem*rem*rem;
         num = num / 10;
      }
      if (sum == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}