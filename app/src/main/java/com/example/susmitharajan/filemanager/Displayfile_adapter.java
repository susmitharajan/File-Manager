package com.example.susmitharajan.filemanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by susmitharajan on 05/07/18.
 */

public class Displayfile_adapter extends ArrayAdapter<Displayfile_Datamodel> {
    
    List<Displayfile_Datamodel> displayList;
    Context context;
    int resource;

    public Displayfile_adapter(Context context, int resource, List<Displayfile_Datamodel> displayList) {
        super(context, resource, displayList);
        this.context = context;
        this.resource = resource;
        this.displayList = displayList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(resource, null, false);
        ImageView fileImage = view.findViewById(R.id.fileImage);
        TextView fileName = view.findViewById(R.id.fileName);
        TextView fileSize = view.findViewById(R.id.fileSize);
        TextView fileModifiedDate = view.findViewById(R.id.fileModifiedDate);
        Displayfile_Datamodel hero = displayList.get(position);
        fileImage.setImageDrawable(context.getResources().getDrawable(hero.getFileImage()));
        fileName.setText(hero.getFileName());
        fileSize.setText(hero.getFileSize());
        fileModifiedDate.setText(hero.getFileModifiedDate());
        return view;
    }
}
