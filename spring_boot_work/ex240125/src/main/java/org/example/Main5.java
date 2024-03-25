package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main5 {
public static void doA() {
    try {
        Path file = Paths.get("a.txt");
        BufferedWriter fw = null;
        fw = Files.newBufferedWriter(file);
        fw.write("A");
        fw.write("Z");


    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (fw != null) {
            try {
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}



    public static void main(String[] args) {
        try {
            doA();
        } catch (IOException ae) {
            ae.printStackTrace();
        }

//        try {
//            fw = Files.newBufferedWriter(file);
//            fw.write("A");
//            fw.write("Z");
//
//            if (fw != null)
//                fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();



    }
}
