package FactoryMethod.factories;

import FactoryMethod.products.AviVideoStream;
import FactoryMethod.products.VideoStream;

public class AviVideoPlayer extends VideoPlayer {
    @Override
    public VideoStream createVideoStream() {
        return new AviVideoStream();
    }
}
