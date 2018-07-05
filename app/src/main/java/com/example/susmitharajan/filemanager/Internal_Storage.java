package com.example.susmitharajan.filemanager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by susmitharajan on 04/07/18.
 */

public class Internal_Storage extends Fragment {
    View view;
    List<Displayfile_Datamodel> displayList;
    ListView listView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.internal_storage, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Internal Storage");
        Utils utils = new Utils();
        ArrayList<String> files = GetFiles(utils.getInternalDirectoryPath());
        displayList = new ArrayList<>();
        listView = (ListView) getView().findViewById(R.id.internal_listview);
        for(int i = 0; i < files.size(); i++)
        {
            displayList.add(new Displayfile_Datamodel(R.drawable.ic_folder_black_24dp, files.get(i), "Avengers","Avengers"));
        }
        Displayfile_adapter adapter = new Displayfile_adapter(getContext(), R.layout.custom_displayfiles, displayList);
        listView.setAdapter(adapter);
    }
    public ArrayList<String> GetFiles(String directorypath) {
        ArrayList<String> userfiles = new ArrayList<String>();
        File f = new File(directorypath);
        File[] files = f.listFiles();
        for(int i = 0; i < files.length; i++)
        {
            if(!files[i].isHidden())
                userfiles.add(files[i].toString());
        }
        return userfiles;
    }
}
