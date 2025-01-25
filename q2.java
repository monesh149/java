import java.util.Scanner;
class demo{
         public static void main (String args[])
    {
      Scanner Scan = new Scanner(System.in);
      int income = Scan.nextInt();
      if(income>7000)
      { 
        System.out.print("scholarship is vaild ");
      }
      else{
        System.out.print("scholarship is not vaild");
      }
         }
}