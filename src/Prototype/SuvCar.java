package Prototype;

public class SuvCar extends Car {
    private boolean extraHeadLamp;

    public SuvCar(SuvCar suvCar) {
        super(suvCar);
        this.extraHeadLamp = suvCar.extraHeadLamp;
    }

    @Override
    public Car clone() {
        return new SuvCar(this);
    }

    //BoilerPlate code
    public SuvCar() {

    }
    public SuvCar(boolean extraHeadLamp) {
        this.extraHeadLamp = extraHeadLamp;
    }

    @Override
    public String toString() {
        return "SuvCar{" +
                "extraHeadLamp=" + extraHeadLamp +
                ",age="+ super.getAge() +
                ",model="+ super.getModel() +
                '}';
    }

    public boolean isExtraHeadLamp() {
        return extraHeadLamp;
    }

    public void setExtraHeadLamp(boolean extraHeadLamp) {
        this.extraHeadLamp = extraHeadLamp;
    }
}
