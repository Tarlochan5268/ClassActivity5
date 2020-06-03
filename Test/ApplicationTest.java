import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    Product products[] = new Product[]{
        new Product(1,"Mouse",10,2),
                new Product(2,"Keyboard",100,5),
                new Product(3,"USB",50,11),
                new Product(4,"Headset",150,5),
                new Product(5,"CPU",250,0),
    };
    Application mapplication = new Application(products);

    @Test
    void testFindPrice()
    {
        assertEquals(14.5,mapplication.findPrice("Mouse"));
        assertEquals(123.5,mapplication.findPrice("Keyboard"));
        assertEquals(66.825,mapplication.findPrice("USB"));
        assertEquals(185.25,mapplication.findPrice("Headset"));
        assertEquals(308.75,mapplication.findPrice("cpu"));
    }

    @Test
    void testInStockProducts()
    {
        assertEquals(4,mapplication.inStockProducts());
    }

}