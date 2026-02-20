package ecommerce;

import java.io.*;

public class ImageProcessor {

    public static void copyImage(String inputPath, String outputPath) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inputPath));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputPath))) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}