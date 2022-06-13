import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<Product> products;

    public Catalog(List<Product> products) {
        this.products = products;
    }

    public void showProducts() {
        int totalElementos = products.size();
        for (int x = 0; x < totalElementos; x++) {
            Product producto = products.get(x);
            producto.printAttributes();
        }
    }

}
