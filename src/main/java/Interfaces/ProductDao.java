package Product;

import java.util.List;

public interface ProductDao<T> {


    List<T> getAllProduct();
    void createTable();
    void deleteProduct(Product product);
    void addProduct(Product product);
    List<T> getData();

}
