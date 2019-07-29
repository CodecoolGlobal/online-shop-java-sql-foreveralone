import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    SqlImplementation sqlImplementation;

    ProductDaoImpl(){
        sqlImplementation = new SqlImplementation();
    }

    @Override
    public void createTable(){
        try {
            sqlImplementation.doQuery("CREATE TABLE IF NOT EXISTS product (\n"
                    + "	product_id integer PRIMARY KEY,\n"
                    + "	product_name text NOT NULL,\n"
                    + "	product_price integer NOT NULL\n"
                    + "	is_available integer NOT NULL\n"
                    + "	product_price integer NOT NULL\n"
                    + "	FOREIGN KEY category_id REFERENCES category(category_id) NOT NULL\n"
                    + ");");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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
            sqlImplementation.doQuery("insert into product (product_id, product_name, product_price, product_amount, category_id) VALUES ('"+ product.getId() + "','"+ product.getName() +"', '"+ product.getPrice() +"','"+ product.getAmount() +"','"+ product.getCategory() +"')");
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

                Product product = new Product(productName, productPrice, productId, category);
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
