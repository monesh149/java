public class Store {
void getchoki (int money)
{
System.out.println(money);
System.out.println("choki Purchased");
}

void getbiscut ( int money){
System.out.println(money);
System.out.println("biscut Purchased");
}
public static void main(String[] args)
{
Store obj1 = new Store();
obj1.getchoki (20);
obj1.getbiscut(30);
}
}