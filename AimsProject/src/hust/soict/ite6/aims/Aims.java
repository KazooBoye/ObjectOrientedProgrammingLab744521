package hust.soict.ite6.aims;
import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart testCart = new Cart(); //Create new cart
		
		//Create a new DVD object
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Minions", "Animation","Roger Allers", 78, 24.95f);
		//Add DVD to cart
		testCart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars 2", "Science Fiction","George Lucas", 90, 24.95f);
		testCart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Inside Out",18.99f);
		testCart.addDigitalVideoDisc(dvd3);
		
		testCart.removeDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is: ");
		System.out.println(testCart.totalCost());
	}

}
