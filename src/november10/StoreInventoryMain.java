package november10;
import java.util.*;

public class StoreInventoryMain {

	public static void main(String[] args) {

        Map<String,Double> inventory=new HashMap<>();
        inventory.put("Olive oil",46.99);
        inventory.put("Oreo",11.59);
        inventory.put("Tomato Sauce",9.49);
        inventory.put("Salt",3.29);
        inventory.put("Pasta",10.49);
        inventory.put("Detergent", 24.99);
        inventory.put("Battery",17.99);
        inventory.put("Pressure Cooker",69.99);
        inventory.put("Coffee Maker",89.99);
        inventory.put("Printer",389.99);
        
        StoreInventoryUtils util=new StoreInventoryUtils();
        //1
        //util.printPriceOfItem(inventory,"Battery");
        //2
        //util.printPriceOfMultipleItems(inventory,"Detergent","Battery","Salt");
        //3
        ;
//        System.out.println(util.addNewItem(inventory, "Washer", 599.99)); 
//        System.out.println(util.deleteItem(inventory, "Salt"));
//        System.out.println(util.getTotalNumberOfItems(inventory));
        //System.out.println(util.getKeysAsString(inventory));
        System.out.println(util.getInventoryTotalPrice(inventory));
	}

}
