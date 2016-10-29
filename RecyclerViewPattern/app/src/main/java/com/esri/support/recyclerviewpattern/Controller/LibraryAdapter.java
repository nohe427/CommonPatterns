package com.esri.support.recyclerviewpattern.Controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.esri.support.recyclerviewpattern.Model.Library;
import com.esri.support.recyclerviewpattern.R;

/**
 * Created by nohe427 on 10/29/16.
 *
 * Useful guide is located here:
 * https://developer.android.com/training/material/lists-cards.html
 * 
 */

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.LibraryViewHolder> {

    private Library mLibrary;

    public LibraryAdapter(Library mLibrary) {
        this.mLibrary = mLibrary;
    }

    @Override
    public LibraryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.book_viewholder, null);
        return new LibraryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LibraryViewHolder holder, int position) {
        holder.mBookYear.setText("" + mLibrary.getLibraryBooks().get(position).getYear());
        holder.mBookTitle.setText(mLibrary.getLibraryBooks().get(position).getTitle());
        holder.mBookPublisher.setText(mLibrary.getLibraryBooks().get(position).getPublisher());
    }

    @Override
    public int getItemCount() {
        return mLibrary.getLibraryBooks().size();
    }

    public class LibraryViewHolder extends RecyclerView.ViewHolder {

        private TextView mBookYear;
        private TextView mBookTitle;
        private TextView mBookPublisher;

        public LibraryViewHolder(View itemView) {
            super(itemView);
            mBookPublisher = (TextView) itemView.findViewById(R.id.bookPublisher);
            mBookTitle = (TextView) itemView.findViewById(R.id.bookTitle);
            mBookYear = (TextView) itemView.findViewById(R.id.bookYear);
        }
    }
}
