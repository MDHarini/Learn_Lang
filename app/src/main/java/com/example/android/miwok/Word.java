package com.example.android.miwok;

/**
 * Created by Vivek on 2/11/2017.
 */

public class Word {
    private String mDefaultTranslateWord;
    private String mMiwokTranslatedWord;
    private static final int no_Image=-1;
    private int mAudioID;
    private int mResourceID=no_Image;

    public Word(String defaultTranslateWord, String miwokTranslatedWord){
        mDefaultTranslateWord = defaultTranslateWord;
        mMiwokTranslatedWord = miwokTranslatedWord;
    }
    public String getDefaultTranslateWord (){
        return mDefaultTranslateWord;
    }
    public String getMiwokTranslatedWord(){
        return mMiwokTranslatedWord;
    }
    public int getResourceID(){
        return mResourceID;
    }
    public int getAudioID(){ return mAudioID;}
    public Word(String defaultTranslateWord, String miwokTranslatedWord, int resourceID, int audioID){
        mDefaultTranslateWord=defaultTranslateWord;
        mMiwokTranslatedWord=miwokTranslatedWord;
        mResourceID=resourceID;
        mAudioID=audioID;
    }
    public boolean hasImage()
    {
        return mResourceID != no_Image;
    }
}
