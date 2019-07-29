package category;

import Product.Product;
import java.util.List;

public class Category {

    private int id;
    private String name;
    private String isAvailable;
    private List<Product> products;


    public Category(int id, String name, String isAvailable, List<Product> products) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List getProducts(){
        return this.products;
    }


    public int getId(){
        return this.id;
    }

    public String getStatus(){
        return isAvailable;
    }

    @Override
    public String toString() {
        return "category.Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAvailable=" + isAvailable +
                ", products=" + products +
                '}';
    }
}
