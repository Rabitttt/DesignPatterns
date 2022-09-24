package Prototype;

public class SportCar extends Car{
    private boolean turbo;

    public SportCar(SportCar sportCar) {
        super(sportCar);
        this.turbo = sportCar.turbo;
    }

    @Override
    public Car clone() {
       return new SportCar(this);
    }

    //BoilerPlate code
    public SportCar() {
    }

    public SportCar(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "turbo=" + turbo +
                ",age="+ super.getAge() +
                ",model="+ super.getModel() +
                '}';
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
