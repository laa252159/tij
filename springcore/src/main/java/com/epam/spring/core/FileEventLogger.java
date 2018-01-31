package com.epam.spring.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileEventLogger implements EventLogger {

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    private File file;
    private String fileName;


    private void init() throws IOException {
        this.file = new File(fileName);
    }
    public void destroy(){
        System.out.println("stub destroy");
    }


    @Override
    public void logEvent(Event event) {
        File file = new File(fileName);
        try {
            FileUtils.writeStringToFile(file, event.toString() + "\n", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
