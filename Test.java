import Lib.*;
public class Test {
    public static void main(String[] args) {
        Product a = new Product("P001","Apple",10.0);
        Product b = new Product("P002","Soda",5.0);
        Product c = new Product("P003","Bread",20.0);
        
        Productcatalog catalog = new Productcatalog();
        catalog.addProduct(a);
        catalog.addProduct(b);
        catalog.addProduct(c);
        catalog.addProduct(a);

        cartitem item1 = new cartitem(catalog.findByID("P001"),2);
        cartitem item2 = new cartitem(b,3);

    }
}
