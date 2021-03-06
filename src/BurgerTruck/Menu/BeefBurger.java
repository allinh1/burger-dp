package BurgerTruck.Menu;

import BurgerTruck.Builder.BurgerBuilder;

import java.util.ArrayList;
import java.util.Collections;

public class BeefBurger extends BurgerBuilder {


    @Override
    public void buildBun() {
        burger.setBun("milk bun");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("hot sauce");
    }

    @Override
    public void buildPatty() {
        burger.setMeatPatty(true);
    }

    @Override
    public void buildToppings() {
        ArrayList<String> toppings = new ArrayList<>();

        Collections.addAll(toppings, "lettuce", "tomato", "cheese");

        burger.setToppings(toppings);
    }
}
