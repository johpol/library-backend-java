package com.librarybackend.rest.domain;

/**
 * Created by John on 3/11/2017.
 */
public class Item {
    private VolumeInfo volumeInfo;

    public Item() {

    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }
}
