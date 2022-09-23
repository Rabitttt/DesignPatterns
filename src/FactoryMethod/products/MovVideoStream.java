package FactoryMethod.products;

public class MovVideoStream implements VideoStream {
    @Override
    public void prepare() {
        //prepare Mov Video
        System.out.println("'Avi Video' preparing");
    }
}
