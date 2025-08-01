package Lib;

public final class Product {
    private final String productID;
    private final String productName;
    private final double price;

private void checkRep() {
    if (productID == null || productID.isBlank()) {
        throw new RuntimeException("Ri violanted productID");
    }
    if (productName == null || productName.isBlank()) {
        throw new RuntimeException("Ri violanted productName");
    }
    if(price < 0){
        throw new RuntimeException("Ri violanted price");
    }
}
public Product(String productID,String productName,double price){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        checkRep();
}
public String getproductID() { return productID; }

public String getproductName() { return productName; }

public double getprice() { return price; }

public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null||getClass() !=obj.getClass()) return false;
        Product product = (Product)obj;
        return productID.equals(product.productID);
    }
public boolean contains(Product product) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
}
public void add(Product product) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
}
}
