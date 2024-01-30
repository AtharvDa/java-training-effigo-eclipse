package com.effigo.java_training_effigo.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileHandler {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\LENOVO\\eclipse-workspace\\java-training-effigo\\src\\main\\java\\com\\effigo\\java_training_effigo\\fileHandling\\data.csv";

//		creating and writing in file
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
			writer.write("Atharv, 22, 50000\n");
			writer.write("Sumit, 21, 50000\n");
			writer.write("Aniket, 23, 60000");
			writer.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

//		Reading from files

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
