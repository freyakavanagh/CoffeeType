package com.sparta.fk;

import org.junit.Test;

import static com.sparta.fk.CoffeeTypes.chooseCoffee;
import static com.sparta.fk.CoffeeTypes.comparingCaffeineInCoffeeTypes;
import static org.junit.Assert.assertEquals;

public class CoffeeTypesTest {

    @Test
    public void checkAnCoffeeChoiceReturn() {
        CoffeeTypes Espresso = CoffeeTypes.ESPRESSO;
        assertEquals("I would like an " + Espresso.name().toLowerCase() + " which has " + Espresso.getMilligramsOfCaffeine() + " milligrams of caffeine!", chooseCoffee(Espresso));
    }

    @Test
    public void checkACoffeeChoiceReturn() {
        CoffeeTypes Latte = CoffeeTypes.LATTE;
        assertEquals("I would like a " + Latte.name().toLowerCase() + " which has " + Latte.getMilligramsOfCaffeine() + " milligrams of caffeine!", chooseCoffee(Latte));
    }

    @Test
    public void checkCoffeeComparison() {
        CoffeeTypes Latte = CoffeeTypes.LATTE;
        CoffeeTypes Espresso = CoffeeTypes.ESPRESSO;
        assertEquals("The " + Latte.name().toLowerCase() + " is stronger than the " + Espresso.name().toLowerCase() + " coffee.", comparingCaffeineInCoffeeTypes(Latte, Espresso));
    }
}


