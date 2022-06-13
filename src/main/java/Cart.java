import java.util.ArrayList;
import java.util.List;

public class Cart extends Catalog{

    private User user;

    public Cart (User user){
        super(new ArrayList<>());
        this.user = user;
    }

    public void addProduct(Product product){
        for (products < products.size()){
            product++;
        }
    }

    public void removeProduct(Product product){

    }

    public int totalAmount(){
        return 0;
    }
}
