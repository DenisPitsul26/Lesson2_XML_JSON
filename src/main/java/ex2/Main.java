package ex2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "E:\\JavaPro\\Lesson2_XML_JSON\\src\\main\\java\\ex2\\json.txt";
        String string = getStringFromFile(path);

        Gson gson = new GsonBuilder().create();
        Anketa anketa = (Anketa) gson.fromJson(string, Anketa.class);
        System.out.println("Anketa - "+ gson.toJson(anketa));

    }

    public static String getStringFromFile(String path){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader buff = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = buff.readLine()) != null){
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
