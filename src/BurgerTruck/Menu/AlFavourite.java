package BurgerTruck.Menu;

import BurgerTruck.Builder.BurgerBuilder;

import java.util.ArrayList;
import java.util.Collections;

public class AlFavourite extends BurgerBuilder {

    public void buildBun() {
        burger.setBun("Burger Bun");
    }

    public void buildSauce() {
        burger.setSauce("BBQ");
    }

    public void buildPatty() {

    }

    public void buildToppings() {
        ArrayList<String> toppings = new ArrayList<>();

        Collections.addAll(toppings, "cheese", "onions", "chicken");

        burger.setToppings(toppings);
    }


}
