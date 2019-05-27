import java.util.Scanner;
class Main{
  public static int pow(int a,int b)
  {
    int mul=1;
    for(int i=1;i<=b;i++)
    {
    mul=mul*a;
    }
    return mul;
  }
  
  
  public static void main (String[] args){
    
     Scanner ii =new Scanner(System.in);
    int exp=ii.nextInt();
    int base=ii.nextInt();
    int ret=pow(exp,base);
      System.out.println(ret);
      }
}