import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner ii= new Scanner(System.in);
      int n=ii.nextInt();
      for(int count=1;count<=2*n;count=count+1)
      {
        if(count%2==1)
          System.out.println(count);
      }
	}
}