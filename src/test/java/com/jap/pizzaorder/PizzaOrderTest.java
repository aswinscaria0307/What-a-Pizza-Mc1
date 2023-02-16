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
float expected=9.99f;
assertEquals(expected,pizzaOrder.calculatePriceOfPizza(1,pizzaOrder.getPriceOfPizzaBasedOnSize(1)),9.99);
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){
float expected=pizzaOrder.getPriceOfGarlicBread();
assertEquals(expected,pizzaOrder.calculatePriceOfGarlicBread(1,pizzaOrder.getPriceOfGarlicBread()),0.01);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){
assertEquals(pizzaOrder.getPriceOfBeverage(),pizzaOrder.calculatePriceOfBeverage(1,pizzaOrder.getPriceOfBeverage()),0.01);
    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){
        float expected=9.99f;
        assertEquals(expected,pizzaOrder.calculatePriceOfPizza(1,pizzaOrder.getPriceOfPizzaBasedOnSize(1)),9.99);
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){
        float expected=pizzaOrder.getPriceOfGarlicBread();
        assertEquals(expected,pizzaOrder.calculatePriceOfGarlicBread(1,pizzaOrder.getPriceOfGarlicBread()),0.01);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){
        assertEquals(pizzaOrder.getPriceOfBeverage(),pizzaOrder.calculatePriceOfBeverage(1,pizzaOrder.getPriceOfBeverage()),0.01);

    }
    @Test
    public void givenSizeofPizzaReturnPrice(){
float expected=9.99f;
assertEquals(expected,pizzaOrder.getPriceOfPizzaBasedOnSize(1),0.01);

    }
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount(){
float expected=9.99f+5.99f+1.99f;
float actual= pizzaOrder.calculateTotalBill(9.99f,5.99f,1.99f);
        assertEquals(expected,actual,0.01);
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount(){
float expected=143.82f;
float actual= pizzaOrder.calculateDiscountAndReturnBillAmount(159.8f);

    }
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount(){
        float expected=9.99f;
        float actual= pizzaOrder.calculateDiscountAndReturnBillAmount(9.99f);

    }
}
