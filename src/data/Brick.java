
package data;


public class Brick {
    protected double price;
    protected String code;
    
    public Brick() {
        
    }

    public Brick(String code, double price) {
        this.price = price;
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return  code + "\t" + price;
    }
    
    
    
    

   
    
    
    
}
