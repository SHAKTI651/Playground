import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner ss = new Scanner(System.in);
      int no=ss.nextInt();
      for(int i=1;i<=no;i++)
      {
        if(no%i==0)
          System.out.println(i);
      }
          
          
          
          
          
          
    
	}
}