package com.sofka.serializer;
import java.io.*;
import java.util.ArrayList;

public class Deserializer<T> {
    public ArrayList<T> deserialize(String path){
        T object;
        ArrayList<T> t= new ArrayList<T>();
        try{
            boolean control = true;
            FileInputStream fileInput = new FileInputStream(path);
            ObjectInputStream oi = new ObjectInputStream(fileInput);
            while (control) {
                try {
                    object  = (T)oi.readObject();
                    t.add(object);
                }catch (Exception e) {
                    control = false;
                    oi.close();
                    fileInput.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }

}
