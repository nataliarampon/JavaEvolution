import java.util.List;
import java.lang.Integer;

public class Order implements Cart {

    private long totalPrice;

    private List<Integer> products;

    public long getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Integer> getProducts() {
        return this.products;
    }

    public void setProducts(List<Integer> products) {
        this.products = products;
    }

}