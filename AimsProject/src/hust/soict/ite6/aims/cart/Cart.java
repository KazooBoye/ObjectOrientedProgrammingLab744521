package hust.soict.ite6.aims.cart;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0; 
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added."); 
        } else {
            System.out.println("The cart is full.");
        }
    }
   
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
    	if (dvdList.length < MAX_NUMBERS_ORDERED) {
    		for (int i = 0; i < dvdList.length; i++) {
    			itemsOrdered[qtyOrdered] = dvdList[i];
    			qtyOrdered++;
    			System.out.println("The disc \"" + dvdList[i].getTitle() + "\" has been added.");
    		}
    	} else {
    		System.out.println("The cart is full.");
    	}
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	if (qtyOrdered < (MAX_NUMBERS_ORDERED - 1)) {
    		itemsOrdered[qtyOrdered] = dvd1;
    		qtyOrdered++;
    		System.out.println("The disc \"" + dvd1.getTitle() + "\"has been added.");
    		itemsOrdered[qtyOrdered] = dvd2;
    		qtyOrdered++;
    		System.out.println("The disc \"" + dvd2.getTitle() + "\"has been added.");   		
    	} else {
    		System.out.println("The cart is full.");
    	}
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed from the cart.");
                return; 
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" not found in cart.");
    }
    
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found" + itemsOrdered[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVDs were found match the ID provided");
        }
    }
    
    public void searchByTitle(String keyword) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(keyword)) {
                System.out.println("Found" + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("NO DVDs were found with \"" + keyword +"\" in the title");
        }
    }
    
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + ". " + itemsOrdered[i]);
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }
    
}
