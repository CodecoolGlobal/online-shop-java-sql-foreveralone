import java.util.ArrayList;
import java.util.List;

public class ProductController {

    public List getProductName(){
        ProductDaoImpl productDao = new ProductDaoImpl();
        List<Product> products = productDao.getData();
        List<String> productName = new ArrayList<>();
        for (Product product: products) {
            productName.add(product.getName());
        }
        System.out.println(products);
        return productName;
    }

    public List getProductId(){
        ProductDaoImpl productDao = new ProductDaoImpl();
        List<Product> products = productDao.getData();
        List<Integer> productId = new ArrayList<>();
        for (Product product: products) {
            productId.add(product.getId());
        }
        System.out.println(productId);
        return productId;
    }

    public List getProductPrice(){
        ProductDaoImpl productDao = new ProductDaoImpl();
        List<Product> products = productDao.getData();
        List<Integer> productPrice = new ArrayList<>();
        for (Product product: products) {
            productPrice.add(product.getPrice());
        }
        System.out.println(productPrice);
        return productPrice;
    }

    public List getProductAmount(){
        ProductDaoImpl productDao = new ProductDaoImpl();
        List<Product> products = productDao.getData();
        List<Integer> productAmount = new ArrayList<>();
        for (Product product: products) {
            productAmount.add(product.getAmount());
        }
        System.out.println(productAmount);
        return productAmount;
    }

    public List getIsAvailable(){
        ProductDaoImpl productDao = new ProductDaoImpl();
        List<Product> products = productDao.getData();
        List<Boolean> isAvailable = new ArrayList<>();
        for (Product product: products) {
            isAvailable.add(product.getAvailable());
        }
        System.out.println(isAvailable);
        return isAvailable;
    }
}
