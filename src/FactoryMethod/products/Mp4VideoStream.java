package FactoryMethod.products;

public class Mp4VideoStream implements VideoStream {
    @Override
    public void prepare() {
        //prepare Mp4 Video
        System.out.println("'Avi Video' preparing");
    }
}
