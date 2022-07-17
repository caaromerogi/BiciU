package com.sofka.utils.IO;

import java.io.*;
import java.util.ArrayList;

public class Serializer<T> {
    Deserializer<T> deserializer = new Deserializer<>();
    public void serialize(String path, T object) {
        File file = new File(path);
        ArrayList<T> array = new ArrayList<>();

        if (file.exists()) {
            array = deserializer.deserialize(path);
            array.add(object);
            try {
                FileOutputStream fileOutput = new FileOutputStream(path);
                ObjectOutputStream objectOutput= new ObjectOutputStream(fileOutput);
                for (T obj : array) {
                    objectOutput.writeObject(obj);
                }
                objectOutput.close();
                fileOutput.close();
            }catch (Exception e) {
                e.printStackTrace();
            }

        }else{
            try {
                file.createNewFile();
                FileOutputStream fileOutput = new FileOutputStream(path);
                ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
                objectOutput.writeObject(object);
                objectOutput.close();
                fileOutput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
