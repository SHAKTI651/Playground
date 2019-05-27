import java.util.Scanner;
class Main{
public static int square(int m)
  {
  int ss=0;
    for(int i=0;i<=m;i++)
    {
      
      ss=ss+i;
    }
  return ss;
  }
  
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int sum= square(s);
      System.out.println(sum);
	} 
}