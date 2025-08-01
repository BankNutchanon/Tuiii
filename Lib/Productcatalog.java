package Lib;
import java.util.ArrayList;
public class Productcatalog {
    private ArrayList<Product> products = new ArrayList<>();
    
    private void checkRep(){
        if (products == null) {
            throw new RuntimeException("R1 violate: product");
        }
        for (int i = 0; i < products.size(); i++){
            for (int j = i +1; j < products.size(); j++){
                if (products.get(i).equals(products.get(j))) {
                    throw new RuntimeException("R1 violate: product");
                }
            }
        }
    }
    public Productcatalog() {
        checkRep();
        }
    public void addProduct(Product product){
        if (product != null && !product.contains(product)) {
            product.add(product);
        }
        checkRep();
    }
    public Product findByID(String product){
        for (Product p : products) {
            if (p.getproductID().equals(product)){
                return p;
            }
        }
        return null;
    }
}
