import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    int i=n/100;
    int m=(n/10)%10;
    int o=(n%10);
    int reva=(o*100)+(m*10)+(i);
    System.out.println(reva);
  }
}