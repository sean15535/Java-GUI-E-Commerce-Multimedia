package ecommerce;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("E-Commerce Multimedia System");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton copyImageBtn = new JButton("Copy Product Image");
        JButton savePrefsBtn = new JButton("Save User Preferences");
        JButton loadPrefsBtn = new JButton("Load User Preferences");
        JButton viewProductBtn = new JButton("Open Product Viewer");

        copyImageBtn.addActionListener(e -> {
            ImageProcessor.copyImage("assets/product.jpg", "assets/copied_product.jpg");
            JOptionPane.showMessageDialog(this, "Image copied successfully!");
        });

        savePrefsBtn.addActionListener(e -> {
            UserPreferences prefs = new UserPreferences("Dark Mode", "Nike Shoes");
            PreferenceManager.savePreferences(prefs);
            JOptionPane.showMessageDialog(this, "Preferences saved!");
        });

        loadPrefsBtn.addActionListener(e -> {
            UserPreferences prefs = PreferenceManager.loadPreferences();
            if (prefs != null) {
                JOptionPane.showMessageDialog(this,
                        "Theme: " + prefs.getTheme() + "\nLast Product: " + prefs.getLastViewedProduct());
            } else {
                JOptionPane.showMessageDialog(this, "No preferences found.");
            }
        });

        viewProductBtn.addActionListener(e -> new ProductViewer().setVisible(true));

        setLayout(new GridLayout(4, 1, 10, 10));
        add(copyImageBtn);
        add(savePrefsBtn);
        add(loadPrefsBtn);
        add(viewProductBtn);
    }
}