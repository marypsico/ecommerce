public class Product {
    private String id;
    private String description;
    private float price;
    private int quantity;

    public Product(String id, String description, double price, int quantity) {
        this.id = id;
        this.description = description;
        this.price = (float) price;
        this.quantity = quantity;
    }

    public void printAttributes() {
        System.out.printf("\n%-8s%-15s%-8s%-10d" , id , description , "$" + price , quantity);
    }

    public String getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
