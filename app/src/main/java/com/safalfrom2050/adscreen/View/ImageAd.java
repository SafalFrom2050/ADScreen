package com.safalfrom2050.adscreen.View;

public class ImageAd extends Ad {
    private long timeOut;

    public ImageAd(int id, String url, long timeOut){
        super(id, url);
        this.timeOut = timeOut;
    }

    public long getTimeout() {
        return timeOut;
    }

    public void setUrl(long timeOut) {
        this.timeOut = timeOut;
    }
}
