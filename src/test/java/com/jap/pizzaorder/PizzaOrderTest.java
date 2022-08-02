package com.jap.pizzaorder;

import com.jap.pizzaorder.PizzaOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PizzaOrderTest {
    PizzaOrder pizzaOrder = null;
    @Before
    public void setUp(){
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder();
    }
    @After
    public void tearDown(){
        // Assign object of PizzaOrder to null
        pizzaOrder = null;
    }

    // Write th logic inside the test case methods
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess(){
        float actual=pizzaOrder.calculatePriceOfPizza(2,9.99f);
        assertEquals(19.98f,actual,0.5);

    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){
        float actual=pizzaOrder.calculatePriceOfGarlicBread(2,5.99f);
        assertEquals(11.98f,actual,0.0);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){
        float actual=pizzaOrder.calculatePriceOfBeverage(3,1.99f);
        assertEquals(5.97f,actual,2.0);
    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){
        float actual=pizzaOrder.calculatePriceOfPizza(2,9.99f);
        assertNotEquals(19.98,actual,0.0);
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){
        float actual=pizzaOrder.calculatePriceOfGarlicBread(2,5.99f);
        assertEquals(11.98f,actual,0.0);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){
        float actual=pizzaOrder.calculatePriceOfBeverage(3,1.99f);
        assertEquals(5.97f,actual,2.0);
    }
    @Test
    public void givenSizeofPizzaReturnPrice(){
        float actual= pizzaOrder.calculatePriceOfPizza(4,13.99f);
        assertEquals(55.96f,actual,2.0);

    }
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount(){
        float actual= pizzaOrder.calculatePriceOfBeverage(6,1.99f);
        assertEquals(11.94,actual,2.0);
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount(){
        float actual= pizzaOrder.calculatePriceOfGarlicBread(12,5.99f);
        assertEquals(71.88,actual,2.0);

    }
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount(){
        float actual= pizzaOrder.calculatePriceOfBeverage(4,1.99f);
        assertEquals(7.96,actual,2.0);

    }
}
