package com.sparta.fk;

public enum CoffeeTypes {


    ESPRESSO(63),
    LATTE(95),
    CAPPUCCINO(95),
    AMERICANO(63),
    DECAFFEINATED(4)
            ;

    public int getMilligramsOfCaffeine() {
        return milligramsOfCaffeine;
    }

    private final int milligramsOfCaffeine;

    CoffeeTypes(int milligramsOfCaffeine) {
        this.milligramsOfCaffeine = milligramsOfCaffeine;
    }

    public static String comparingCaffeineInCoffeeTypes(CoffeeTypes Coffee1,CoffeeTypes Coffee2){

        if(Coffee1.milligramsOfCaffeine == Coffee2.milligramsOfCaffeine){
            return "These drinks both have " +Coffee1.milligramsOfCaffeine+ " milligrams of coffee.";
        } else if (Coffee1.milligramsOfCaffeine > Coffee2.milligramsOfCaffeine){
            return "The " + Coffee1.name().toLowerCase() + " is stronger than the " + Coffee2.name().toLowerCase() + " coffee.";
        }else {
            return "The " + Coffee2.name() + " is stronger than the " + Coffee1.name()+ " coffee.";

        }


    };

    public static String chooseCoffee(CoffeeTypes coffeeChosen){
        if(coffeeChosen.name().charAt(0) == 'A' || coffeeChosen.name().charAt(0) == 'E' || coffeeChosen.name().charAt(0) == 'I' || coffeeChosen.name().charAt(0) == 'O' || coffeeChosen.name().charAt(0) == 'U'){
            return "I would like an " + coffeeChosen.name().toLowerCase() + " which has " + coffeeChosen.getMilligramsOfCaffeine() + " milligrams of caffeine!";
        } else {
            return "I would like a " + coffeeChosen.name().toLowerCase() + " which has " + coffeeChosen.getMilligramsOfCaffeine() + " milligrams of caffeine!";
        }

    }




    public static void main(String[] args) {
        CoffeeTypes Latte = CoffeeTypes.LATTE;
        CoffeeTypes Cappuccino = CoffeeTypes.CAPPUCCINO;
        CoffeeTypes Decaf = CoffeeTypes.DECAFFEINATED;
        CoffeeTypes Espresso = CoffeeTypes.ESPRESSO;
        CoffeeTypes Americano = CoffeeTypes.AMERICANO;
        System.out.println(comparingCaffeineInCoffeeTypes(Latte, Cappuccino));
        System.out.println(comparingCaffeineInCoffeeTypes(Latte, Decaf));
        System.out.println(comparingCaffeineInCoffeeTypes(Americano, Espresso));
        System.out.println(chooseCoffee(Espresso));
        System.out.println(chooseCoffee(Latte));



    }


}
