package BurgerTruck.Builder;

public abstract class BurgerBuilder {

    protected Burger burger;

    public Burger getBurger() {
        return burger;
    }

    public void createNewBurger() {
        burger = new Burger();
    }

    public abstract void buildBun();

    public abstract void buildSauce();

    public abstract void buildPatty();

    public abstract void buildToppings();
}
