package com.example.susmitharajan.filemanager;

import android.os.Environment;

/**
 * Created by susmitharajan on 04/07/18.
 */

public class Utils {

    public String getInternalDirectoryPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }


}
