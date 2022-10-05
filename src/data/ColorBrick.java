
package data;






public class ColorBrick extends Brick{
    private String marker;
    
    public ColorBrick() {
        
    }


    public ColorBrick(String code, String marker, double price) {
        super(code, price);
        this.marker = marker;
    }
    
    public double getIncrement(String marker) {     
        if(marker.charAt(0) == 'J' ||  marker.charAt(0) == 'I'){
            return 0.1;
        }else
            return 0;
        
        
    }
    
    @Override  
    public double getPrice() {
        return price + (price * getIncrement(marker));
    }

    @Override
    public String toString() {
        return code + "\t" + marker + " " + price;
    }
    
    
    
    
    
}
