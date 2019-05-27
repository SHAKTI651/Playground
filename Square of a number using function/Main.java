import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
    int s=(m*m);
    return s;
  }
  
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int q=in.nextInt();
      int sq= square(q);
      System.out.println(sq);
	} 
}