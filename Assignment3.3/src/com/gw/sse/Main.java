package com.gw.sse;
import  java.io.File;
import  java.io.FileNotFoundException;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    try{
            File doc = new File("SampleText.txt");
            Scanner sc = new Scanner(doc);
            char c = 'e';
            int count = 0;
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == c){
                        count++;
                    }
                }
            }
            sc.close();
            System.out.println("'" + c + "' was found " + count + " times.");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not open file.");
        }
    }
}
