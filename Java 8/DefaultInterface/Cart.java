import java.util.List;
import java.lang.Integer;

public interface Cart {

    // static int DELIVERY_ORDER = 1020;

    long getTotalPrice();
    
    List<Integer> getProducts();

    // int getOrderType() {
    //     return DELIVERY_ORDER;
    // };

    // default int getOrderType() {
    //     return DELIVERY_ORDER;
    // };

}