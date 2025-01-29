import java.util.Scanner;

class demo
{
    public static void main(String args[])
    {
        Scanner Scan = new Scanner (System.in);
        System.out.println("Number 1");
        int a = Scan.nextInt();
        System.out.println("Number 2");
        int b = Scan.nextInt();
        for (int i=a;i<=b;i=i+1)
        {
          System.out.println(i);
        }
    }
}
 