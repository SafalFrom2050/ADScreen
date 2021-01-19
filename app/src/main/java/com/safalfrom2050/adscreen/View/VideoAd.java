package com.safalfrom2050.adscreen.View;

public class VideoAd extends Ad {
    private long length;

    public VideoAd(int id, String url, long length){
        super(id, url);
        this.length = length;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
