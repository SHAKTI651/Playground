import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int q=n/10;
      int w=n%10;
      int sum=w+q;
      System.out.println(sum);
	}
}