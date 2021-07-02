package com.example.miwok1;

public class flavor {
    private String mVersionName;
    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mVersionNumber;

    // Drawable resource ID
    private int mImageResourceId;
    public flavor(String vName, String vNumber, int imageResourceId)
    {
        mVersionName = vName;
        mVersionNumber = vNumber;
        mImageResourceId = imageResourceId;
    }
    public String getVersionName() {
        return mVersionName;
    }
    public String getVersionNumber() {
        return mVersionNumber;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
