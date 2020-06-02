public class Product {
    int no;
    String name;
    int cost;
    int stock;

    public Product(int no, String name, int cost, int stock) {
        this.no = no;
        this.name = name;
        this.cost = cost;
        this.stock = stock;
    }

    public Product() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
