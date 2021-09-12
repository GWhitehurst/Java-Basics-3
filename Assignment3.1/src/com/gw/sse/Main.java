package com.gw.sse;
import  java.io.File;

public class Main {

    public static void main(String[] args) {
        traversePath(".");
        System.out.println("All files and directories shown.");
    }

    private static void traversePath(String directoryPath){
        try {
            File dir = new File(directoryPath);
            String contents[] = dir.list();
            if (contents.length == 0) ;
            else if (contents == null) ;
            else {
                System.out.println("List of files and directories under " + directoryPath);
                for (int i = 0; i < contents.length; i++) {
                    String newPath = directoryPath;
                    System.out.println(contents[i]);
                    newPath = newPath + "/" + contents[i];
                    traversePath(newPath);
                }
            }
            dir = null;
        }
        catch(Exception e){}
    }
}
