package Facade;

import Facade.thirdPartyFoodMakers.DonerMaker;
import Facade.thirdPartyFoodMakers.HamburgerMaker;
import Facade.thirdPartyFoodMakers.PizzaMaker;

// We create a facade class to hide the framework's complexity
// behind a simple interface. It's a trade-off between
// functionality and simplicity.
public class FoodMaker {
    public void eat(Food name) {
        System.out.print("Eating ");
        switch (name) {
            case DONER -> new DonerMaker().prepare();
            case HAMBURGER -> new HamburgerMaker().prepare();
            case PIZZA -> new PizzaMaker().prepare();
        }
    }

    public enum Food {
        DONER,
        HAMBURGER,
        PIZZA
    }
}
