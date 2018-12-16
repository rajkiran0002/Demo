

public class Customer {
String name;//private name
String phone;//null pointer exception phone="empty"
int number=0; //static int number=0 available for all objects commenly 1 and 2

Customer(){
	System.out.println("Cinstructor 1. object address:" +this);
	number++;
}

Customer(String name){
	System.out.println("Cinstructor 2. object address:" +this);
	this.name=name;
	number++;
}
String getName() {
	System.out.println("My name is:" +name);
	return name;
	
}

////////////////////////777777 

public void finalize() {
System.out.println("==================================");
System.out.println("Object "+this+"is deleted");
number--;
}

/*
 * 
 * scope:
 * {---(scope)
 * int a=2;//visible only in those brackets
 * }
 * System.out.println(a);//error
 * 
 * {
 * Customer one = new Customer("siri");
 * }
 * one.name="SURRU";//reference cannot be used
 * ----------------------------
 *  Customer one = null;
 * {
 *  one = new Customer("siri");
 * }
 * one.name="SURRU";//visible outside
 * 
 * exam 20th 11am 1h mcq 
 * 19 ques
 * 
 * * 
 */
}