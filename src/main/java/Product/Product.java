public class Product {

    Integer id;
    String name;
    Integer price;
    Integer amount;
    Boolean isAvailable;
    String category;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getCategory() {
        return category;
    }



    public Product(String name, Integer price, Integer amount, String category) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", isAvailable=" + isAvailable +
                ", category='" + category + '\'' +
                '}';
    }
/*public String ToString(){
        return;
    }*/
}
