package net.fiwzi.quiz;

import net.fiwzi.quiz.cmd.JframeUserInterface;

public class App {
    public static void main(String[] args) {
        JframeUserInterface jf = new JframeUserInterface("โปรแกรมคำนวณ ความมงคลในตัวคุณ",500,500);
        jf.run();

    }
}
