package net.fiwzi.quiz.internal.UI.component;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class InputBox extends JTextField {
    private final int fontStyle = Font.PLAIN;

    public InputBox(int col) {
        super(col);
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(144, 59, 0), 3),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
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
    public InputBox(int col,float fontSize) {
        super(col);
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(144, 59, 0), 3),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
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
    public InputBox(int col,float fontSize,int fontStyle) {
        super(col);
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(144, 59, 0), 3),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
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
