package Ex08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestShoppingCart {

    ShoppingCart shoppingCart;

    @BeforeEach
    void setUp(){
        this.shoppingCart = new ShoppingCart("1");
    }

    @Test
    void itemsTest(){
        assertEquals(0,shoppingCart.getItemCount());
        shoppingCart.addItem("Roupa");
        assertEquals(1,shoppingCart.getItemCount());
        shoppingCart.addItem("Comida");
        shoppingCart.addItem("Bebida");
        assertEquals(3,shoppingCart.getItemCount());
        shoppingCart.removeItem("Comida");
        assertEquals(2,shoppingCart.getItemCount());
        assertTrue(shoppingCart.containsItem("Roupa"));
        assertFalse(shoppingCart.containsItem("Comida"));
        assertFalse(shoppingCart.containsItem("Telemovel"));
        assertEquals(2,shoppingCart.getItemCount());
        shoppingCart.clearCart();
        assertEquals(0,shoppingCart.getItemCount());
    }



}
