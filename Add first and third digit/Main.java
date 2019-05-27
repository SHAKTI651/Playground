import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner i =new Scanner(System.in);
      int n=i.nextInt();
  int q=n/100;
      int w =n%10;
        int sum=q+w;
      System.out.println(sum);
	}
}