package com.bridgelabz.functional;
import static java.awt.image.BufferedImage.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

public class DemoAlphabet {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text = null;
            while ((text = reader.readLine()) != null)
            {
                // Dummy image to calculate bitmap width / height of your text
                BufferedImage img = new BufferedImage(1, 1, TYPE_INT_ARGB);
                Graphics2D g2d = img.createGraphics();
                Font font = new Font("Comic Sans MS", Font.PLAIN, 24);
                g2d.setFont(font);
                FontMetrics fm = g2d.getFontMetrics();
                int width = fm.stringWidth(text);
                int height = fm.getHeight();
                g2d.dispose();
                // Real image
                img = new BufferedImage(width, height, TYPE_INT_ARGB);
                g2d = img.createGraphics();
                g2d.setFont(font);
                fm = g2d.getFontMetrics();
                g2d.drawString(text, 0, fm.getAscent());
                g2d.dispose();
                for (int y = 0; y < img.getHeight(); y++) 
                {
                    for (int x = 0; x < img.getWidth(); x++) 
                    {
                        System.out.print(0 == img.getRGB(x, y) ? "  " : "**");
                    }
                    System.out.println();
                }
            }
        }
    }
}