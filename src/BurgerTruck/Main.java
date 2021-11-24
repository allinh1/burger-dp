package BurgerTruck;

import BurgerTruck.Builder.Burger;
import BurgerTruck.Builder.BurgerBuilder;
import BurgerTruck.Builder.Server;
import BurgerTruck.Menu.AlFavourite;
import BurgerTruck.Menu.BeefBurger;

public class Main {
    public static void main(String[] args) {

        Server server = new Server();

        BurgerBuilder alBurgerBuilder = new AlFavourite();
        BurgerBuilder beefBurgerBuilder = new BeefBurger();

        server.setBurgerBuilder(alBurgerBuilder);
        server.makeBurger();
        Burger burger1 = server.getBurger();
        System.out.println(burger1.toString());

        server.setBurgerBuilder(beefBurgerBuilder);
        server.makeBurger();
        Burger burger2 = server.getBurger();
        System.out.println(burger2.toString());

    }
}
