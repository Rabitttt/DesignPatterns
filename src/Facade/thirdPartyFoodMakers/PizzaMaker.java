package Facade.thirdPartyFoodMakers;

public class PizzaMaker implements Food{
    //Bunch of complex method about this Food

    @Override
    public void prepare() {
        System.out.print("Pizza");
    }
}
