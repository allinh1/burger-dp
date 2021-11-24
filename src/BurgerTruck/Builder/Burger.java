package BurgerTruck.Builder;

import java.util.ArrayList;

public class Burger {
    private String bun;
    private String sauce;
    private Boolean meatPatty = Boolean.FALSE;
    private ArrayList<String> toppings = new ArrayList<>();

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public Boolean getMeatPatty() {
        return meatPatty;
    }

    public void setMeatPatty(Boolean meatPatty) {
        this.meatPatty = meatPatty;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}
