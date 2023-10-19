package com.abstraction;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

    public static void main(String[] args) {

        String fullString="IMG_0606_1.jpg";
       // s=s.substring(0,8);
        //System.out.println(s);

        String[] parts = fullString.split("\\.");
        String substring = parts[0];
        System.out.println(substring);

       // String sourceDirectory = "C:/Users/sohan.varadkar/Desktop/Backup/Photos";
        //E:/iphone backeup aug2023/aqua wild/sohan.varadkar’s iPhone_20230811214356/Photos
        String sourceDirectory = "C:/Users/sohan.varadkar/Desktop/Backup/suprabha sohan/sohan.varadkar’s iPhone/photos";
        String destinationDirectory = "C:/Users/sohan.varadkar/Desktop/Backup/suprabha sohan/sohan.varadkar’s iPhone/Duplicates";

        moveDuplicateFiles(sourceDirectory, destinationDirectory);
    }

    public static void moveDuplicateFiles(String sourceDirectory, String destinationDirectory) {
        File sourceDir = new File(sourceDirectory);
        File destinationDir = new File(destinationDirectory);

        if (!sourceDir.exists() || !sourceDir.isDirectory()) {
            System.out.println("Source directory does not exist.");
            return;
        }

        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
        }

        Map<String, File> fileNamesMap = new HashMap<>();

        File[] files = sourceDir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                  //fileName=fileName.substring(0,8);
                    String[] parts = fileName.split("\\.");
                    fileName = parts[0];

                   System.out.println("fileName:: "+fileName+" fileNamesMap:: "+fileNamesMap.toString());
                    if (fileNamesMap.containsKey(fileName)) {
                        System.out.println("Duplicate file found: " + fileName);
                        File existingFile = fileNamesMap.get(fileName);
                        System.out.println(existingFile);
                        System.out.println(file);
                        if( file.getName().toLowerCase().endsWith(".jpg")) {
                           // moveFile(existingFile, destinationDir);

                            moveFile(file, destinationDir);
                        }
                    } else {
                        fileNamesMap.put(fileName, file);
                    }
                }
            }
        }
    }

    public static void moveFile(File file, File destinationDir) {
        try {

            File newFile = new File(destinationDir, file.getName());
            Files.move(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Moved file: " + file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
