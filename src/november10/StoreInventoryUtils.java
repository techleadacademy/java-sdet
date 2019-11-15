package november10;
import java.util.*;

public class StoreInventoryUtils {
	public void printPriceOfItem(Map<String,Double> inventory, String itemName){
        //TODO
		System.out.println(inventory.get(itemName));
    }
	
	
    public void printPriceOfMultipleItems(Map<String,Double> inventory, String...itemNames){
      
    	for(String each:itemNames) {
    		System.out.println(inventory.get(each));
    	}
    }
    
    
    public Map<String,Double> addNewItem(Map<String,Double> inventory,String itemName,Double itemPrice){
        //TODO
    	inventory.put(itemName,itemPrice);
        return inventory;
    }
    
    
    public Map<String,Double> deleteItem(Map<String,Double> inventory,String itemName){
        inventory.remove(itemName);
        return inventory;
    }
    
    
    public int getTotalNumberOfItems(Map<String,Double> inventory){
        //TODO
        return inventory.size();
    }
    /**
     *Following method returns all the keys in following comma separated format:
     * Salt,Coffee Maker,Detergent,Battery,Oreo,Pasta,Olive oil,Printer,Pressure Cooker,Tomato Sauce
     */
    public String getKeysAsString(Map<String,Double> inventory){
        String key = "";
        for(String s : inventory.keySet()) {
        	key += s+", ";
        }
        key = key.substring(0, key.length()-2);
        return key;
    }
    public double getInventoryTotalPrice(Map<String,Double> inventory){
        //TODO
    	double total = 0;
    	for(double each : inventory.values()) {
    		total += each;
    	}
        return total;
    }
    /**
     * Following method prints all inventory in following format:
     *     Oreo: $11.59
     *     Salt: $3.29
     *     ...
     */
    public void printInventoryList(Map<String,Double> inventory){
        //TODO
    }
    /**
     *Following method increases all the item price by the given amount using KEYSET
     */
    public Map<String,Double> increasePriceOfAllItems(Map<String,Double> inventory,double increaseAmount){
        //TODO
        return inventory;
    }
    /**
     *Following method decreases all the item price by the given amount using ENTRYSET
     */
    public Map<String,Double> decreasePriceOfAllItems(Map<String,Double> inventory, double discountAmount){
        //TODO
        return inventory;
    }
    /**
     * Following method compares values in 2 different maps and prints the ONLY different values in following format:
     * Difference in coffee price | 10.9 | 12.9 |
     */
    public void compare2Maps(Map<String,Double> inventory1, Map<String,Double> inventory2){
        //TODO
    }
    /**
     * Following method compares only given values in 2 maps and prints all comparison in following format:
     * Different coffee price | 10.99 | 13.99 |
     * Same apple price | 3.99 | 3.99 |
     */
    public void compareValuesOf2Maps(Map<String,Double> inventory1, Map<String,Double> inventory2, List<String> itemList){
        //TODO
    }
    public Map<String,Double> emptyTheInventory(Map<String,Double> inventory){
        //TODO
        return inventory;
    }
}
