package Project_task;



import java.util.Scanner;
import java.util.Vector;

public class GroceryPurchasevector27 {

	public static void main(String[] args) {
		GroceryPurchasevector27 obj=new GroceryPurchasevector27();
		vector1 obj1=new vector1();
		 vector2 obj2=new vector2();
		Scanner sc = new Scanner(System.in);

		Vector<String> v = new Vector();
		v.add("Watch");
		v.add("orange");
		v.add("Mobile");
		v.add("belt");
		v.add("phone cover");

		Vector<Integer> v1 = new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);

		System.out.println("Welcome to WALMART"+"\n"+"Products are [orange - Watch - Mobile] ");
		System.out.println("Purchase Options : " + "1.Buy 2.Sell");
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("enter the product :");
			String s = sc.next();
			System.out.println("enter the quantity :");
			int q = sc.nextInt();
			obj1.buy(v, v1, s, q);
			break;
		case 2:
			System.out.println("enter the product :");
			String s1 = sc.next();
			System.out.println("enter the quantity :");
			int q1 = sc.nextInt();

			obj2.sell(v,v1,s1,q1);
			break;
		}

	}

}
