package ShoppingApp;

public class Product {
String name;
int id;
int quantity;
double price;
String brand;
public Product(int id,String name,String brand,int quantity,double price) {
	this.id=id;
	this.brand=brand;
	this.name=name;
	this.price=price;
	this.quantity=quantity;
}
@Override
public String toString() {
    return "Product "+ id +" [name=" + name + ", brand=" + brand + ", Quantity=" + quantity + ", price=" + price + "]";
}

}
