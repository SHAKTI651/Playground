import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner ii =new Scanner(System.in);
      int n=ii.nextInt();
      int sum=0;
      for(int count=1;count<=n;count=count+1)
      {
        sum=sum+count;
      }
      System.out.println(sum);
	}
}