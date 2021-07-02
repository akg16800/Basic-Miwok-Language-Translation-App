package com.example.miwok1;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String DefaultTranslation,String MiwokTranslation,int AudioResourceId)
    {
        mMiwokTranslation=MiwokTranslation;
        mDefaultTranslation=DefaultTranslation;
        mAudioResourceId=AudioResourceId;
    }
    public Word(String DefaultTranslation,String MiwokTranslation,int imageResource,int AudioResourceId)
    {
        mMiwokTranslation=MiwokTranslation;
        mDefaultTranslation=DefaultTranslation;
        mImageResourceId=imageResource;
        mAudioResourceId=AudioResourceId;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
    public int getAudioResourceId(){ return mAudioResourceId;}
}
