package com.example.json;

import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("name")
    private String mName;
    @SerializedName("duration")
    private String mDuration;

    public Video(String mName, String mDuration) {
        this.mName = mName;
        this.mDuration = mDuration;
    }
}
