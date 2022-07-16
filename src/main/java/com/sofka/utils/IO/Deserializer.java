package com.sofka.utils.IO;
import java.io.*;
import java.util.ArrayList;

public class Deserializer<T> {
    public ArrayList<T> deserialize(String path){
        File file = new File(path);
        T object;
        ArrayList<T> objects= new ArrayList<T>();
        if (file.length()!=0) {
            try{
                boolean control = true;
                FileInputStream fileInput = new FileInputStream(path);
                ObjectInputStream oi = new ObjectInputStream(fileInput);
                while (control) {
                    try {
                        object  = (T)oi.readObject();
                        objects.add(object);
                    }catch (Exception e) {
                        control = false;
                        oi.close();
                        fileInput.close();
                    }
                }
            } catch (Exception e) {e.printStackTrace();}
        }
        return objects;
    }

}
