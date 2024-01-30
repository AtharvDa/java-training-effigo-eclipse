package com.effigo.java_training_effigo.fileHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageFileHandler {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\LENOVO\\eclipse-workspace\\java-training-effigo\\src\\main\\java\\com\\effigo\\java_training_effigo\\fileHandling\\image.png";

		BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		File imageFile = new File(filePath);

		try {
			ImageIO.write(image, "png", imageFile);

			BufferedImage readImage = ImageIO.read(imageFile);

			System.out.println("Image dimenstions : " + readImage.getWidth() + " x " + readImage.getHeight());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
