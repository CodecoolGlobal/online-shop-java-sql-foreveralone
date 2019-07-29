import java.util.ArrayList;
import java.util.List;

public class CategoryController {

    public List getCategoryName(){
        CategoryDaoImpl categoryDao = new CategoryDaoImpl();
        List<Category> categories = categoryDao.getData();
        List<String> categoryName = new ArrayList<>();
        for (Category category: categories) {
            categoryName.add(category.getName());
        }
        System.out.println(categoryName);
        return categoryName;
    }

    public List getCategoryId(){
        CategoryDaoImpl categoryDao = new CategoryDaoImpl();
        List<Category> categories = categoryDao.getData();
        List<Integer> categoryId = new ArrayList<>();
        for (Category category: categories) {
            categoryId.add(category.getId());
        }
        System.out.println(categoryId);
        return categoryId;
    }

    public List getProducts(){
        CategoryDaoImpl categoryDao = new CategoryDaoImpl();
        List<Category> categories = categoryDao.getData();
        List<Product> products = new ArrayList<>();
        for (Category category: categories) {
            products.add();
        }
        System.out.println(products);
        return products;
    }

    public List getStatus(){
        CategoryDaoImpl categoryDao = new CategoryDaoImpl();
        List<Category> categories = categoryDao.getData();
        List<Boolean> isAvailable = new ArrayList<>();
        for (Category category: categories) {
            isAvailable.add(category.getStatus());
        }
        System.out.println(isAvailable);
        return isAvailable;
    }
}
