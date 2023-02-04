package ShoppingApp;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	int id;
    Map<String, Integer> purchaseList;
    double total;
    public Cart() {
        this.id=101;
        this.purchaseList=new HashMap<String,Integer>();
        this.total=0;
    }
    public void details(){
        System.out.println("-----------------------------\nCart Details");
        System.out.println("Cart id:"+id+"\nPUrchased items:");
        for (Map.Entry<String,Integer> entry : purchaseList.entrySet()) 
        System.out.println(entry.getKey() +
                         " - " + entry.getValue());
        System.out.println("Total Amount to be paid:"+total);
        System.out.println("-----------------------------");
    }

}
