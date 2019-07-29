import java.util.List;

public class Category {

    private int id;
    private String name;
    private Boolean isAvailable;
    private List<Product> products;


    public Category(int id, String name, Boolean isAvailable, List<Product> products) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List getProducts(List<Product> products){
        return products;
    }


    public int getId(){
        return this.id;
    }

    public boolean getStatus(){
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAvailable=" + isAvailable +
                ", products=" + products +
                '}';
    }
}
