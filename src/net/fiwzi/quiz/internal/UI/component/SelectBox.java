package net.fiwzi.quiz.internal.UI.component;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import java.io.File;

public class SelectBox<E> extends JComboBox<E> {

    private final int fontStyle = Font.PLAIN;

    public SelectBox(E[] str) {
        super(str);
        UIManager.put("ComboBox.selectionBackground", Color.WHITE);
        this.setBackground(new Color(255, 255, 255));
        this.setForeground(new Color(0, 0, 0));
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(144, 59, 0), 3),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        this.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton arrowButton = super.createArrowButton();
                arrowButton.setBackground(Color.WHITE);
                return arrowButton;
            }
        });
        try{
            File fontFile = new File("src/resources/font/prompt.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            float fontSize = 13f;
            font = font.deriveFont(fontSize);
            font = font.deriveFont(fontStyle);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            this.setFont(font);
        }catch(Exception ignored){}

    }
    public SelectBox(E[] str, float fontSize) {
        UIManager.put("ComboBox.selectionBackground", Color.WHITE);
        this.setBackground(new Color(255, 255, 255));
        this.setForeground(new Color(0, 0, 0));
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(144, 59, 0), 3),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        this.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton arrowButton = super.createArrowButton();
                arrowButton.setBackground(Color.WHITE);
                return arrowButton;
            }
        });
        try{
            File fontFile = new File("src/resources/font/prompt.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            font = font.deriveFont(fontSize);
            font = font.deriveFont(fontStyle);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            this.setFont(font);
        }catch(Exception ignored){}

    }
    public SelectBox(E[] str, float fontSize, int fontStyle) {
        super(str);
        UIManager.put("ComboBox.selectionBackground", Color.WHITE);
        this.setBackground(new Color(255, 255, 255));
        this.setForeground(new Color(0, 0, 0));
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(144, 59, 0), 3),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        this.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton arrowButton = super.createArrowButton();
                arrowButton.setBackground(Color.WHITE);
                return arrowButton;
            }
        });
        try{
            File fontFile = new File("src/resources/font/prompt.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            font = font.deriveFont(fontSize);
            font = font.deriveFont(fontStyle);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            this.setFont(font);
        }catch(Exception ignored){}

    }
}
