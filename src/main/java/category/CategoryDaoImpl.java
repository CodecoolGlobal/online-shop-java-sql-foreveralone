import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    SqlImplementation sqlImplementation;

    @Override
    public List getAllCategory() {
        List<Category> categoryList = new ArrayList<>();

        System.out.println(categoryList);
        return categoryList;
    }

    @Override
    public void deleteCategory(Category category) {
        try {
            sqlImplementation.doQuery("DELETE FROM category WHERE category_id = '" + category.getId() + "'");


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }

    }

    @Override
    public void addCategory(Category category) {
        try {
            sqlImplementation.doQuery("INSERT INTO category (category_name, is_available, category_id) VALUES ('" + category.getName() + "','" + category.getId() + "', '" + category.getStatus() + "')");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }

    }


    @Override
    public List getData() {
        ResultSet resultSet = sqlImplementation.selectQuery("SELECT * from category");
        List<Category> categoryList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                int categoryId = resultSet.getInt("category_id");
                String categoryName = resultSet.getString("category_name");
                String isAvailable = resultSet.getString("is_available");
                int productIdInCategory = resultSet.getInt("FOREIGN KEY (product_id) REFERENCES category(product_id)");

                Category category = new Category(categoryName, categoryId, isAvailable, productIdInCategory);
                categoryList.add(category);
                System.out.println(categoryList);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }
        return categoryList;
    }


/*

    public List readCategory(String categoryName, String isAvailable, int categoryId){

        ResultSet resultSet = sqlImplementation.selectQuery("SELECT * FROM category WHERE category_name = '"+ categoryName + " AND category_Id = " + categoryId +"'");
        List<Category> categoryList = new ArrayList<>();
        try {
            while (resultSet.next()){
                int categoryId = resultSet.getInt("category_id");
                String categoryName = resultSet.getString("category_name");
                String isAvailable = resultSet.getString("is_available");

                Category category = new Category(categoryName, categoryId, isAvailable);
                categoryList.add(category);
                System.out.println(categoryList);
            }

        } catch(Exception e) {
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }
        return categoryList;
    }

 */
}




// throws throw
