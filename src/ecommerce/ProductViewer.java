package ecommerce;

import javax.swing.*;
import java.awt.*;

public class ProductViewer extends JFrame {

    public ProductViewer() {
        setTitle("Product Viewer");
        setSize(500, 500);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("assets/product.jpg");
        Image scaled = icon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(scaled));

        add(imageLabel, BorderLayout.CENTER);
    }
}