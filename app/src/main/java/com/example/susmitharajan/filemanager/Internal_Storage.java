package com.example.susmitharajan.filemanager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by susmitharajan on 04/07/18.
 */

public class Internal_Storage extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.internal_storage, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Internal Storage");
        Utils utils = new Utils();
        ArrayList<String> files = GetFiles(utils.getInternalDirectoryPath());
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
