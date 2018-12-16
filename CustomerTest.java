

public class CustomerTest {

	public static void main(String args[]) {
		//		System.out.println(Customer.number);

		//		Customer one = new Customer("Siri");
		//		one.name="Ruil";// unaccessed by both method and directly, solution is to access the method which has private attributes

		Customer one=null;
		for(int i=0; i<20;i++) {//200000 garbage collection works,
			one = new Customer();
			System.gc();//
		}//19 Zoombies 

		System.out.println(one);

		one = new Customer();
		Customer two = new Customer("Suil");

		//	one=two;
		//two=null; null pointer exception affets two.getName();
		//	System.out.println(one);
		//	System.out.println(two);
		//	System.out.println(one.number);i=1 also used Customer.number -- correct way
		//	System.out.println(two.number);i=1 class variable is differet from obj var
		one.getName();
		two.getName();
		//	emptly attributes create ull pointer exception

	}
}