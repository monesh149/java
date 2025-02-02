public class Laptop {
   String name = "";
   String proc="";
   int ram = 0;
   int price =0;

    public static void main(String[] args)
{
Laptop lap1 = new Laptop();
lap1.name = "hpp";
lap1.proc= "15";
lap1.ram=6;
lap1.price = 40000;
Laptop lap2 = new Laptop();
lap2.name = "leenovo";
lap2.proc= "17";
lap2.ram=8;
lap2.price=80000;
System.out.println(lap2.price);
}
}