package com.example.susmitharajan.filemanager;

/**
 * Created by susmitharajan on 05/07/18.
 */

public class Displayfile_Datamodel {
    int fileImage;
    String fileName, fileSize, fileModifiedDate;

    public Displayfile_Datamodel(int fileImage, String fileName, String fileSize, String fileModifiedDate) {
        this.fileImage = fileImage;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileModifiedDate = fileModifiedDate;
    }

    public int getFileImage() {
        return fileImage;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getFileModifiedDate() { return fileModifiedDate; }
}
