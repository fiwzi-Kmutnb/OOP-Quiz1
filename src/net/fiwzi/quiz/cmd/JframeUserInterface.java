package net.fiwzi.quiz.cmd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import net.fiwzi.quiz.constants.constant;
import net.fiwzi.quiz.infrastructure.storages.BirthdayNumber;
import net.fiwzi.quiz.infrastructure.storages.HomeNumber;
import net.fiwzi.quiz.internal.UI.component.ButtonBox;
import net.fiwzi.quiz.internal.UI.component.InputBox;
import net.fiwzi.quiz.internal.UI.component.LableText;
import net.fiwzi.quiz.internal.UI.component.SelectBox;
import net.fiwzi.quiz.internal.repository.BirthdayNumberRepository;
import net.fiwzi.quiz.internal.repository.HomeNumberRepository;
import net.fiwzi.quiz.utils.CalculatorDigit;

public class JframeUserInterface {
    String title = "Quiz 1";
    int width = 800;
    int height = 600;
    JFrame frame;
    public JframeUserInterface() {
        frame = new JFrame(this.title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public JframeUserInterface(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void ui() {

        BirthdayNumber birthdayNumber = new BirthdayNumber();
        HomeNumber homeNumber = new HomeNumber();
        BirthdayNumberRepository birthdayNumberRepository = new BirthdayNumberRepository(birthdayNumber.get());
        HomeNumberRepository homeNumberRepository = new HomeNumberRepository(homeNumber);
        CalculatorDigit calculatorDigit = new CalculatorDigit();

        JLabel keySumNum = new LableText("ผลรวมเลข: ",14f,Font.BOLD);
        JLabel sumNum = new LableText("-");
        JLabel keyMsg = new LableText("ความหมายตัวเลข: ",14f,Font.BOLD);
        JLabel msg = new LableText("-");
        JLabel keyJob = new LableText("งารที่เหมาะ: ",14f,Font.BOLD);
        JLabel job = new LableText("-");
        JLabel keyAddParticle = new LableText("ตกแต่งเพิ่มบัฟ: ",14f,Font.BOLD);
        JLabel addParticle = new LableText("-");
        JLabel keyDOB = new LableText("เลขมงคลวันเกิด: ",14f,Font.BOLD);
        JLabel DOB = new LableText("-");

        JPanel panel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel textLablePanel = new JPanel();
        JPanel textLablePanel2 = new JPanel();
        JPanel textLablePanel3 = new JPanel();
        JPanel textLablePanel4 = new JPanel();
        JPanel textLablePanel5 = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        textLablePanel.setBackground(new Color(117, 55, 10));
        textLablePanel2.setBackground(new Color(117, 55, 10));
        textLablePanel3.setBackground(new Color(117, 55, 10));
        textLablePanel4.setBackground(new Color(117, 55, 10));
        textLablePanel5.setBackground(new Color(117, 55, 10));
        textPanel.setBackground(new Color(117, 55, 10));
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textLablePanel.add(keyMsg);
        textLablePanel.add(msg);
        textLablePanel2.add(keyJob);
        textLablePanel2.add(job);
        textLablePanel3.add(keyAddParticle);
        textLablePanel3.add(addParticle);
        textLablePanel4.add(keyDOB);
        textLablePanel4.add(DOB);
        textLablePanel5.add(keySumNum);
        textLablePanel5.add(sumNum);

        textPanel.add(textLablePanel5);
        textPanel.add(textLablePanel);
        textPanel.add(textLablePanel2);
        textPanel.add(textLablePanel3);
        textPanel.add(textLablePanel4);
        panel.setBackground(new Color(196, 97, 24));
        panel.setLayout(layout);

        JScrollPane scrollPane = new JScrollPane(textPanel);
        scrollPane.setPreferredSize(new Dimension(100, 100));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        scrollPane.setBackground(new Color(117, 55, 10));
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(188, 96, 27), 2   ));

        JLabel HomeNo = new LableText("บ้านเลขที่: ",15f,Font.BOLD);
        JTextField input = new InputBox(20);
        JLabel labelSelect = new LableText("เลือกวันเกิด: ", 15f, Font.BOLD);
        JComboBox<String> comboBox = new SelectBox<String>(constant.DAYS);
        JButton button = new ButtonBox("ทำการคำนวณ!",16f,Font.BOLD);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                if(s.equals("ทำการคำนวณ!")) {
                    String in = input.getText();
                    String se = comboBox.getSelectedItem().toString();
                    if(in.length() <= 0) {
                        JLabel msg = new LableText("กรุณากรอกเลขที่บ้านด้วย!!!!",15f,Font.BOLD,Color.BLACK);
                        JOptionPane.showMessageDialog(frame,msg,"แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    int rootDigit = calculatorDigit.exec(in);
                    if(rootDigit == -1)
                        return;
                    List<String> dob = birthdayNumberRepository.find(se,rootDigit);
                    HomeNumber home = homeNumberRepository.find(rootDigit);
                    sumNum.setText(rootDigit + "");
                    msg.setText(home.msg);
                    job.setText(home.job);
                    addParticle.setText(home.recommend.toString());
                    DOB.setText(dob.toString());
                }
            }
        });





        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

        vGroup.addGap(50);
        vGroup.addGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(HomeNo)
                        .addComponent(input)
        );
        vGroup.addGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSelect)
                        .addComponent(comboBox)
        );
        vGroup.addGap(20);
        vGroup.addComponent(button);
        vGroup.addGap(30);
        vGroup.addGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(20).addComponent(scrollPane)
        );
        layout.setVerticalGroup(vGroup);

        GroupLayout.ParallelGroup hGroup = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
        hGroup.addGroup(
                layout.createSequentialGroup().addGap(50)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(HomeNo)
                                .addComponent(labelSelect))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(input)
                                .addComponent(comboBox)).addGap(50)
        );
        hGroup.addGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(button).addGap(20).addComponent(scrollPane).addGap(20)
        );
        layout.setHorizontalGroup(hGroup);
        frame.add(panel);
    }





    public void run() {
        this.ui();
        frame.setVisible(true);
    }
}
