import java.util.List;

public interface ProductDao<T> {

    List<T> getAllProduct();
    void deleteProduct(Product product);
    void addProduct(Product product);
    List<T> getData();

}
