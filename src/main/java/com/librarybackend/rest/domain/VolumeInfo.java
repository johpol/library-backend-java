package com.librarybackend.rest.domain;

/**
 * Created by John on 3/11/2017.
 */
public class VolumeInfo {
    private String title;

    public VolumeInfo() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "VolumeInfo [" +
                "title=" +
                title +
                "]";
    }
}
