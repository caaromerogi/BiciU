package com.sofka.serializer;

import java.io.*;

public class Serializer<T> {
    //Check if doc exists
    public void serialize(String path, T object){
        try{
            File file = new File(path);
            if (file.exists()) {
                writeObject(path, object);
            }else {
                file.createNewFile();
                writeObject(path, object);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeObject(String path, T object){
        try(FileOutputStream fileOutput = new FileOutputStream(path);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            objectOutput.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
