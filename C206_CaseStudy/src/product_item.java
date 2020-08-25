
public class product_item {
    private int product_id;
    private String product_name;
    private String condition;
    public product_item(int product_id, String product_name,String condition) {
   
        this.product_id = product_id;
        this.product_name = product_name;
        this.condition=condition;
    }
 
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
}