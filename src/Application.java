import java.util.Arrays;

public class Application {
    Product products[];

    public Application() {
        products = new Product[]{
                new Product(1,"Mouse",10,2),
                new Product(2,"Keyboard",100,5),
                new Product(3,"USB",50,10),
                new Product(4,"Headset",150,5),
                new Product(5,"CPU",250,0),

        };
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
