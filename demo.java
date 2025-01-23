import java.util.Scanner;
class demo
{
    public static void main(String args[])
    { 
        Scanner  Scan = new Scanner(System.in);
        int num1 = Scan.nextInt();
        int num2 = Scan.nextInt();

      if(num1==num2)
       {
        System.out.println("Both the Numbers are Equal");
       }
      else
      {
        System.out.print("Not Equal");
      }
    }
}