package Prototype;

public abstract class Car {
    private int age;
    private String model;

    public Car() {
    }

    public Car(Car car) {
        this();
        this.age = car.age;
        this.model = car.model;
    }

    public abstract Car clone();

    //BoilerPlate Getter and Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
