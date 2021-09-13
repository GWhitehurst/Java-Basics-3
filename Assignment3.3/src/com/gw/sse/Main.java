package com.gw.sse;
import  java.io.File;
import  java.io.FileNotFoundException;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Specify one character in the command line");
            System.exit(0);
        }
	    try{
            File doc = new File("SampleText.txt");
            Scanner sc = new Scanner(doc);
            char c = args[0].charAt(0);
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
