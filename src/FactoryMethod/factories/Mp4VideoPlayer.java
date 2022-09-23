package FactoryMethod.factories;

import FactoryMethod.products.Mp4VideoStream;
import FactoryMethod.products.VideoStream;

public class Mp4VideoPlayer extends VideoPlayer{
    @Override
    public VideoStream createVideoStream() {
        return new Mp4VideoStream();
    }
}
