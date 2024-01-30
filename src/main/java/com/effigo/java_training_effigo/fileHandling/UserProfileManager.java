package com.effigo.java_training_effigo.fileHandling;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class UserProfileManager {

	public static void main(String[] args) {
       
        String userProfileText = "Name: Atharv Darunkar\nAge: 21\nOccupation: Software Engineer";
        String userProfileCSV = "Atharv Darunkar,21,Software Engineer,25000";
        BufferedImage userProfileImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);


        try {

            saveToFile("demo.txt", userProfileText, FileType.TEXT);
            saveToFile("demo.csv", userProfileCSV, FileType.CSV);
            saveToFile("demo.png", userProfileImage, FileType.IMAGE);

            System.out.println(readFromFile("demo.txt"));
            System.out.println(readFromFile("demo.csv"));
            displayImage(ImageIO.read(new File("demo.png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveToFile(String fileName, Object content, FileType fileType) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            if (fileType == FileType.TEXT || fileType == FileType.CSV) {
                writer.write(content.toString());
            } else if (fileType == FileType.IMAGE) {
                ImageIO.write((BufferedImage) content, "png", new File(fileName));
            }
        }
    }

    private static String readFromFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static void displayImage(BufferedImage image) {
        System.out.println("Displaying image...");
    }


    private enum FileType {
        TEXT, CSV, IMAGE, PDF
    }

}
