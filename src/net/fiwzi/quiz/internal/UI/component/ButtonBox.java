package net.fiwzi.quiz.internal.UI.component;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ButtonBox extends JButton {
    private final int fontStyle = Font.PLAIN;
    public ButtonBox(String text) {
        super(text);
        try{
            File fontFile = new File("src/resources/font/prompt.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            font = font.deriveFont(fontStyle);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            this.setFont(font);
        }catch(Exception ignored){}
    }
    public ButtonBox(String text , float fontSize) {
        super(text);
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
    public ButtonBox(String text , float fontSize, int fontStyle) {
        super(text);
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
