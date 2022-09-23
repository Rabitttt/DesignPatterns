package FactoryMethod.products;

import java.sql.SQLOutput;

public class AviVideoStream implements VideoStream {
    @Override
    public void prepare() {
        //prepare Avi video
        System.out.println("'Avi Video' preparing");
    }
}
