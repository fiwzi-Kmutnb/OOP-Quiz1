package net.fiwzi.quiz.internal.UI.component;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class LableText extends JLabel {
    private float fontSize = 13f;
    private int fontStyle = Font.PLAIN;

    public LableText(String text) {
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
        this.setForeground(Color.white);
    }
    public LableText(String text, float fontSize) {
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
        this.setForeground(Color.white);
    }
    public LableText(String text, float fontSize, int fontStyle) {
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
        this.setForeground(Color.white);
    }
    public LableText(String text, float fontSize, int fontStyle,Color color) {
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
        this.setForeground(color);
    }
}
