package FactoryMethod;

import FactoryMethod.factories.AviVideoPlayer;
import FactoryMethod.factories.VideoPlayer;
import FactoryMethod.products.VideoStream;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Let's assume that we have a library to give us a video player in which given video type.
        //In this example we don't have to know about Video Stream types as a developer.
        VideoPlayer aviPlayer = new AviVideoPlayer();
        VideoStream aviVideoStream =  aviPlayer.watchVideo();
        System.out.println("Avi video stream ready to use.");
    }
}
