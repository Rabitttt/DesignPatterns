package FactoryMethod.factories;

import FactoryMethod.products.MovVideoStream;
import FactoryMethod.products.VideoStream;

public class MovVideoPlayer extends VideoPlayer{
    @Override
    public VideoStream createVideoStream() {
        return new MovVideoStream();
    }
}
