package FactoryMethod.factories;

import FactoryMethod.products.VideoStream;

public abstract class VideoPlayer {
    public VideoStream watchVideo() {
        VideoStream videoStream = createVideoStream();
        videoStream.prepare();
        return videoStream;
    }

    public abstract VideoStream createVideoStream();
}
