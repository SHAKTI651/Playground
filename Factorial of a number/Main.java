import java.util.Scanner;
class Main{
	public static void main (String[] args){
      
	Scanner ss = new Scanner(System.in);
      int no=ss.nextInt();
      int mul=1;
      for(int i=1;i<=no;i++)
      {
        mul=mul*i;
      }
      System.out.println(mul);
        
    
    
    }
 
}