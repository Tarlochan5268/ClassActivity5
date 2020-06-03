import java.util.Arrays;

public class Application {
    Product products[];

    public Application() {
    }

    public Application(Product[] products) {
        this.products = products;
    }

    double findPrice(String name)
    {
        for (Product mProduct:products) {
            if(mProduct.getName().equalsIgnoreCase(name))
                return (mProduct.getPrice() - mProduct.getPrice()*mProduct.chkdiscount());
        }
        return 0;
    }

    int inStockProducts()
    {
        int count = 0;
        for (Product mProduct:products) {
            if(!mProduct.chkStock())
                count++;
        }
        return count;
    }

}
