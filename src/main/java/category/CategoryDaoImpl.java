package category;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CategoryDao;
import Product.Product;
import SQL.SqlImplementation;

public class CategoryDaoImpl implements CategoryDao {

    SqlImplementation sqlImplementation;

    @Override
    public List getAllCategory() {
        List<Category> categoryList = new ArrayList<>();

        System.out.println(categoryList);
        return categoryList;
    }

    @Override
    public void createTable() {
        try {
            sqlImplementation.doQuery("CREATE TABLE IF NOT EXISTS category (\n"
                    + "	category_id integer PRIMARY KEY,\n"
                    + "	category_name text NOT NULL,\n"
                    + "	is_available integer NOT NULL\n"
                    + ");");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
                List<Product> products = new ArrayList<>();


                Category category = new Category(categoryId, categoryName, isAvailable, products);
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
        List<category.Category> categoryList = new ArrayList<>();
        try {
            while (resultSet.next()){
                int categoryId = resultSet.getInt("category_id");
                String categoryName = resultSet.getString("category_name");
                String isAvailable = resultSet.getString("is_available");

                category.Category category = new category.Category(categoryName, categoryId, isAvailable);
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
