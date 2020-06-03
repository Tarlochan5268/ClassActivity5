import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product1 = new Product(1,"Mouse",10,2);
    Product product2 = new Product(2,"Keyboard",100,5);
    Product product3 = new Product(3,"USB",50,11);
    Product product4 = new Product(4,"Headset",150,5);
    Product product5 = new Product(5,"CPU",250,0);
    @Test
    void testGetPrice()
    {
        assertEquals(14.5,product1.getPrice());
        assertEquals(130,product2.getPrice());
        assertEquals(67.5,product3.getPrice());
        assertEquals(195.0,product4.getPrice());
        assertEquals(325.0,product5.getPrice());
    }

    @Test
    void testChkStock()
    {
        assertFalse(product1.chkStock());
        assertFalse(product2.chkStock());
        assertTrue(product3.chkStock());
        assertFalse(product4.chkStock());
        assertFalse(product5.chkStock());
    }
    @Test
    void testCheckDiscount()
    {
        assertEquals(0.0,product1.chkdiscount());
        assertEquals(0.05,product2.chkdiscount());
        assertEquals(0.01,product3.chkdiscount());
        assertEquals(0.05,product4.chkdiscount());
        assertEquals(0.05,product5.chkdiscount());
    }
}