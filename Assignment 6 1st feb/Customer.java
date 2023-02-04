package ShoppingApp;

public class Customer {
	String name;
    String email;
    long phone;
    Cart customerCart;
    public Customer(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.customerCart=new Cart();
    }

    public void greet(){
        System.out.println("Hello, "+this.name+"!! Welcome to ABCSHOPPING.\n-----------------------------------");
    }
    public void addToCart(int item){
        if(Inventory.prodList.get(item-1).quantity<1) System.out.println("Sorry! Item out of stock.");
        else{
            Inventory.prodList.get(item-1).quantity--;
            System.out.println(Inventory.prodList.get(item-1).name+ " successfully added to cart.");
            customerCart.total+=Inventory.prodList.get(item-1).price;
            if(customerCart.purchaseList.containsKey(Inventory.prodList.get(item-1).name)) customerCart.purchaseList.put(Inventory.prodList.get(item-1).name, customerCart.purchaseList.get(Inventory.prodList.get(item-1).name) + 1);
            else customerCart.purchaseList.put(Inventory.prodList.get(item-1).name, 1);
            customerCart.details();
        }
    }
}
