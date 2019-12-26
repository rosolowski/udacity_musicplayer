package com.example.android.musicplayer.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.musicplayer.Data.Song;
import com.example.android.musicplayer.R;

import java.util.ArrayList;
import java.util.List;

public final class SongAdapter extends ArrayAdapter<Song> {
    private List<Song> songs;

    public SongAdapter(@NonNull Context context, ArrayList<Song> list) {
        super(context, 0 , list);

        songs = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.song_item_list, parent,false);

        Song current = songs.get(position);

        TextView title= listItem.findViewById(R.id.song_item_list_title);
        title.setText(current.getName());

//        TextView detail = listItem.findViewById(R.id.playlist_item_list_detail);
//        String numberOfSongs = String.valueOf(current.getSongs().size());
//        detail.setText("Number of songs - " + numberOfSongs);

        return listItem;
    }
}