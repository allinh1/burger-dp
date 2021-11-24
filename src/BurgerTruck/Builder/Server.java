package BurgerTruck.Builder;

public class Server {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public BurgerBuilder getBurgerBuilder() {
        return burgerBuilder;
    }

    public Burger getBurger() {
        return burgerBuilder.getBurger();
    }

    public void constructPizza() {
        burgerBuilder.createNewBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildSauce();
        burgerBuilder.buildPatty();
        burgerBuilder.buildToppings();
    }

}
