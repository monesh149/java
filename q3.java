import java.util.Scanner;
 class demo{
  public static void main(String args[])
  {
    Scanner Scan = new Scanner(System.in);
    int s1= Scan.nextInt();
    int s2= Scan.nextInt();
    int s3= Scan.nextInt();
    int s4= Scan.nextInt();
    int s5= Scan.nextInt();

  int totalmark = s1+s2+s3+s4+s5;
  
  int avg = totalmark/5;
     
    if(avg<35)
    {
      System.out.print("need extra classes");
    }
    else 
    {
      System.out.print("your are good");
    }
  }
  }
  