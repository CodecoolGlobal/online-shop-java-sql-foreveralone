import java.util.List;

public class Category {

    private int id;
    private String name;
    private Boolean isAvailable;
    private List<Product> products;


    public Category (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List GetProducts(List<Product> products){
        return products;
    }

    /*public String ToString(){
        return;
    }*/
}
