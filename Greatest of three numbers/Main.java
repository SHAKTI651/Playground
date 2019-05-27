import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner n= new Scanner(System.in);
      int m = n.nextInt();
      int r = n.nextInt();
      int l= n.nextInt();
      if(m>r)
      {
        if(m>l)
          System.out.println(m);
        else
          System.out.println(r);
      }
      else
        System.out.println(l);


    }
}