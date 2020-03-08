package snippet;

class House5{
	protected String name = "House 5";
	public House5() {
		System.out.println("Name of House is " + name);;
	}
}

class House6{
	House5 h5 = new House5(); 
	public House6() {
		h5.name = "ModifiedHouse 5";
		System.out.println("House 5 name modified from House 6 to " + h5.name);
	}
}

public class Chapter5_2 {

	public static void main(String[] args) {
		House6 h6 = new House6(); 

	}

}
