public class Product {
    int no;
    String name;
    double cost;
    int stock;

    public double getPrice()
    {
        if(this.cost>=100)
             return this.cost + (this.cost * 0.3);
        else if(this.cost>=50 && this.cost<100)
            return this.cost + (this.cost * 0.35);
        else if(this.cost<50)
            return this.cost + (this.cost * 0.45);
        return -1;
    }

    public boolean chkStock()
    {
        if(this.stock>10)
            return true;
        return false;
    }

    public double chkdiscount()
    {
        if(getPrice() >=100)
            return (getPrice()*0.05);
        else if(getPrice()>40 && getPrice()<100)
            return (getPrice()*0.01);
        return 0;
    }


    public Product(int no, String name, double cost, int stock) {
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
