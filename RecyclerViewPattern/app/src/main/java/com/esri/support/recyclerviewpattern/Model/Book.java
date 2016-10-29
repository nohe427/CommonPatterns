package com.esri.support.recyclerviewpattern.Model;

/**
 * Created by nohe427 on 10/29/16.
 */

public class Book {
    private String mTitle;
    private String mPublisher;
    private int mYear;

    public Book() {
        this.mPublisher = "esriPublishing";
        this.mTitle = "Alexanders Android Basics";
        this.mYear = 1969;
    }

    public Book(String mTitle, String mPublisher, int mYear) {
        this.mTitle = mTitle;
        this.mPublisher = mPublisher;
        this.mYear = mYear;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public void setPublisher(String mPublisher) {
        this.mPublisher = mPublisher;
    }

    public int getYear() {
        return mYear;
    }

    public void setYear(int mYear) {
        this.mYear = mYear;
    }
}
