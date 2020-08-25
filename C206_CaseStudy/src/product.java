


//Zhenni's Product class is needed to link to product from transaction
public class product {

    private product_item product_item;
    private String category;
    private double price;
    private String vendor;
    private boolean isAvaliable;
    private int numReturn;
    
    public product(int product_id,String product_name,String category, double price, String vendor,int numReturn, String condition) {

 

        product_item=new product_item(product_id,product_name,condition);
        this.category = category;
        this.price = price;
        this.vendor = vendor;
        this.numReturn=numReturn;
    }
    

 

    
    public product_item getProduct_item() {
        return product_item;
    }

 


    public void setProduct_item(product_item product_item) {
        this.product_item = product_item;
    }

 


    public String getCategory() {
        return category;
    }

 

    public void setCategory(String category) {
        this.category = category;
    }

 

    public double getPrice() {
        return price;
    }

 

    public void setPrice(double price) {
        this.price = price;
    }

 

    public String getVendor() {
        return vendor;
    }

 

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

 

    public boolean getIsAvailable(boolean isTaken) {
        return isAvaliable;
    }

 

    public void setIsAvailable(boolean isAvailable) {
        this.isAvaliable = isAvailable;
    }

 

    public int getNumReturn() {
        return numReturn;
    }

 

    public void setNumReturn(int numReturn) {
        this.numReturn = numReturn;
    }

 

    
    
}
