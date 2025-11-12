package com.pluralsight.data;

import java.io.File;

public class Receipt {

    private File file;
    private String fileID;

    public Receipt(File file, String fileID) {
        this.file = file;
        this.fileID = fileID;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileID() {
        return fileID;
    }

    public void setFileID(String fileID) {
        this.fileID = fileID;
    }


}
