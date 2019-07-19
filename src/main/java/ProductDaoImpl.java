import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    SqlImplementation sqlImplementation;

    ProductDaoImpl(){
        sqlImplementation = new SqlImplementation();
    }

    @Override
    public List getAllProduct() {
        return null;
    }

    @Override
    public void deleteProduct(Product product) {
        try {
            sqlImplementation.doQuery("DELETE FROM product WHERE product_id = '"+ product.getId()+ "'");


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }
    }

    @Override
    public void addProduct(Product product) {
        try {
            sqlImplementation.doQuery("insert into product (product_id, product_name, product_price, product_amount, category) VALUES ('"+ product.getId() + "','"+ product.getName() +"', '"+ product.getPrice() +"','"+ product.getAmount() +"','"+ product.getCategory() +"')");
        } catch (Exception e){
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }

    }

    @Override
    public List getData() {
        ResultSet resultSet = sqlImplementation.selectQuery("select * from product");
        List<Product> productList = new ArrayList<>();
        try {
            while (resultSet.next()){
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                int productPrice = resultSet.getInt("product_price");
                int productAmount = resultSet.getInt("product_amount");
                int isAvailable = resultSet.getInt("is_available");
                String category = resultSet.getString("category");

                Product product = new Product(productName, productPrice, productId, category, productAmount, isAvailable);
                productList.add(product);
                System.out.println(productList);
            }

        } catch(Exception e) {
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }
        return productList;
    }
}
