package com.esri.support.recyclerviewpattern.Model;

import java.util.ArrayList;

/**
 * Created by nohe427 on 10/29/16.
 */

public class Library {
    private ArrayList<Book> mLibraryBooks;

    public ArrayList<Book> getLibraryBooks() {
        return mLibraryBooks;
    }

    public Library(ArrayList<Book> mLibraryBooks) {
        this.mLibraryBooks = mLibraryBooks;
    }

    public Library() {
        this.mLibraryBooks = new ArrayList<>();
    }
}
