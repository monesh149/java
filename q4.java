import java.util.Scanner;
   class mark {
    void passorfail (int mark)
{
    if (mark>35)
  {
     System.out.println("pass");
  }
   else{
    System.out.println("fail");
}
}
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int mark = scan.nextInt();
mark obj1 = new mark();
obj1.passorfail (mark);
}
}