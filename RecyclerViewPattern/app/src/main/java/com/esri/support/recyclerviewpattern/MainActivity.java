package com.esri.support.recyclerviewpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.esri.support.recyclerviewpattern.Controller.LibraryAdapter;
import com.esri.support.recyclerviewpattern.Model.Book;
import com.esri.support.recyclerviewpattern.Model.Library;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new LibraryAdapter(createDummyLibrary()));

    }

    private Library createDummyLibrary() {
        Library dummyLibrary = new Library();

        for (int i = 0; i < 55; i++) {
            dummyLibrary.getLibraryBooks().add(new Book());
        }
        return dummyLibrary;
    }
}
