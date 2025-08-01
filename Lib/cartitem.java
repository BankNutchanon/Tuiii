package Lib;

public class cartitem {
    public final Product product;
    private int quantity;

    private void checkRep(){
        if(product == null){
            throw new RuntimeException("RI violate: ");
        }
        if(quantity <=0){
            throw new RuntimeException("RI violate: ");
        }
     }
    public cartitem(Product product,int quantity){
        this.product = product;
        this.quantity = quantity;
        checkRep();
    }

    public Product getProduct(){return product;}

    public int getQuantity(){return quantity;}

    public void increaseQuantity(int amount){
        if(amount>0){
            this.quantity += amount;
        }
        checkRep();
    }
     
}