package com.example.clock.models;

import androidx.fragment.app.Fragment;

public class Tab {

    private String mTitle;
    private Fragment mContent;

    public Tab(String mTitle, Fragment mContent) {
        this.mTitle = mTitle;
        this.mContent = mContent;
    }

    public String getTitle() {
        return mTitle;
    }

    public Fragment getContent() {
        return mContent;
    }

}
