package snippet;

//Operators
//Demonstrate aliasing
class House{
	float price;
}


public class Chapter2_1 {

	
	
	public static void main(String[] args) {
		House h1 = new House();
		House h2 = new House();
		
		h1.price = 50;
		h2.price = 100;
		
		System.out.println("1: h1.price: " + h1.price + ", h2.price: " + h2.price);
		
		h1 = h2;
		
		System.out.println("2: h1.price: " + h1.price + ", h2.price: " + h2.price);
		
		h1.price = 20;
		
		System.out.println("3: h1.price: " + h1.price + ", h2.price: " + h2.price);
		

	}

}
