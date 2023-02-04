package ShoppingApp;

import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        Customer c1=new Customer("Ankita", "ankitagupt27@gmail.com", 0);
        Product p1=new Product(1,"Notebook", "Classmate",7, 40);
        Product p2=new Product(2,"Watch", "Fastrack", 3, 900);
        Product p3=new Product(3,"Shoes", "Nike", 7, 1000);
        Product p4=new Product(4,"Pencil", "Camlin", 20, 5);
        Product p5=new Product(5,"Flask", "Cello", 5, 100);
        
        Inventory.prodList.add(p1);
        Inventory.prodList.add(p2);
        Inventory.prodList.add(p3);
        Inventory.prodList.add(p4);
        Inventory.prodList.add(p5);

        c1.greet();

        while(true){
            for(Product p:Inventory.prodList){
                System.out.println(p);
            }
            System.out.println("Which product do you want to buy?");
            int choice=sc.nextInt();
            c1.addToCart(choice);
            System.out.println("Do you want to continue(yes/no)?");
            String c=sc.next();
            
            if(c.toLowerCase().equals("no")) {
            	System.out.println("Thank you!! Do visit again.");
            	System.exit(0);
            }
        }
        
    }
}
