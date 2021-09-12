package com.gw.sse;
import  java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
	    try{
            FileWriter target = new FileWriter("Notes.txt", true);
            target.write("Text was just added to this file from a Java program!\n");
            target.close();
            System.out.println("Line written.");
        }
        catch(Exception e){
            System.out.println("An error occurred opening the file.");
            e.printStackTrace();
        }
    }
}
