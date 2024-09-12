package net.fiwzi.quiz.cmd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import net.fiwzi.quiz.constants.constant;
import net.fiwzi.quiz.infrastructure.storages.BirthdayNumber;
import net.fiwzi.quiz.infrastructure.storages.DuoNumber;
import net.fiwzi.quiz.infrastructure.storages.HomeNumber;
import net.fiwzi.quiz.internal.UI.component.ButtonBox;
import net.fiwzi.quiz.internal.UI.component.InputBox;
import net.fiwzi.quiz.internal.UI.component.LableText;
import net.fiwzi.quiz.internal.UI.component.SelectBox;
import net.fiwzi.quiz.internal.repository.BirthdayNumberRepository;
import net.fiwzi.quiz.internal.repository.DuoNumberRepository;
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
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public JframeUserInterface(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void ui() {

        CardLayout cardLayout = new CardLayout();
        BirthdayNumber birthdayNumber = new BirthdayNumber();
        HomeNumber homeNumber = new HomeNumber();
        BirthdayNumberRepository birthdayNumberRepository = new BirthdayNumberRepository(birthdayNumber.get());
        HomeNumberRepository homeNumberRepository = new HomeNumberRepository(homeNumber);
        DuoNumber duoNumbers = new DuoNumber();
        DuoNumberRepository duoNumberRepository = new DuoNumberRepository(duoNumbers.get());

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
        JLabel keyDuoNumberMsg = new LableText("ความหมาย: ",14f,Font.BOLD);
        JLabel duoNumberMsg = new LableText("-");

        JLabel reComTitle = new LableText("วิธีแก้เคล็ดเลขที่บ้านเพื่อเสริมฮวงจุ้ย เพิ่มความเป็นสิริมงคล",18f,Font.BOLD);
        JLabel reComStateKey1 = new LableText("1.ติดแผ่นทองคำเปลว",14f,Font.BOLD);
        JLabel reComStateKey2 = new LableText("2.เพิ่มแสงไฟบริเวณป้ายเลขที่บ้าน",14f,Font.BOLD);
        JLabel reComStateKey3 = new LableText("3.เพิ่มตัวเลขให้เลขที่บ้าน",14f,Font.BOLD);
        JLabel reComStateKey4 = new LableText("4.ปลูกต้นไม้มงคล",14f,Font.BOLD);
        JLabel reComStateKey5 = new LableText("5.แก้เคล็ดด้วยหลักฮวงจุ้ย",14f,Font.BOLD);
        JLabel reComStateKey6 = new LableText("6.เลี้ยงปลาหน้าบ้าน",14f,Font.BOLD);
        JLabel reComStateKey7 = new LableText("7.ติดเหรียญบาท",14f,Font.BOLD);

        JLabel reComStateValue1 = new LableText("การใช้แผ่นทองคำเปลวเป็นวิธีที่ได้รับความนิยม โดยการนำมาติดบนเลขที่ถือว่าไม่เป็นมงคล เพื่อเปลี่ยนให้เลขนั้นมีความหมายใหม่ที่เป็นมงคลยิ่งขึ้น และการติดทองคำนี้ยังมีวิธีการเฉพาะเจาะจงที่จำเป็นต้องทำตามเพื่อให้ความเชื่อนั้นมีผล",13f);
        JLabel reComStateValue2 = new LableText("แสงสว่างมีความหมายในการเปลี่ยนแปลงและให้แสงสว่างในชีวิต ดังนั้นการเพิ่มแสงไฟที่ป้ายบ้านเลขที่นั้นจึงเป็นการช่วยให้เลขที่บ้านนั้นมีพลังงานที่ดีและเป็นมงคลยิ่งขึ้น",13f);
        JLabel reComStateValue3 = new LableText("การเพิ่มตัวเลขบริเวณเลขที่บ้านเป็นวิธีง่ายๆ เพื่อให้ค่าผลบวกของตัวเลขนั้นสอดคล้องกับเลขมงคลตามที่เราต้องการ แต่ควรระวังในการเลือกขนาดของตัวเลขให้เหมาะสม เพื่อไม่ให้เกิดความสับสนในการอ่านเลขที่บ้าน",13f);
        JLabel reComStateValue4 = new LableText("ต้นไม้มงคลสามารถช่วยเสริมดวง สร้างสมดุลและพลังงานดีภายในบ้าน ไม่เพียงแต่จะเป็นการประดับสวน แต่ยังมีพลังเสริมดวงตามความเชื่อด้วย",13f);
        JLabel reComStateValue5 = new LableText("หลักฮวงจุ้ยเป็นความรู้ที่ศึกษาเกี่ยวกับ ทิศทางฮวงจุ้ยบ้าน หรือการจัดสิ่งแวดล้อมในบ้านเพื่อให้มีพลังงานที่ดี หากเรารู้สึกว่าเลขที่บ้านยังไม่น่าพึงพอใจ การจัดบ้านตามหลักฮวงจุ้ยเป็นอีกหนึ่งวิธีที่สามารถช่วยปรับปรุงพลังงานภายในบ้านได้",13f);
        JLabel reComStateValue6 = new LableText("ปลามงคล เช่น ปลาคาร์ฟ หรือปลามังกร ถือว่าเป็นสัญลักษณ์ของความรุ่งเรืองและโชคลาภ การเลี้ยงปลาเหล่านี้หน้าบ้านไม่เพียงแต่จะช่วยในการเสริมดวง แต่ยังส่งเสริมความสวยงามและความสุขภาพสำหรับสัตว์เลี้ยงด้วย",13f);
        JLabel reComStateValue7 = new LableText("เหรียญบาทนั้นมีค่าเท่ากับดาวหนึ่งดวง ดังนั้นการติดเหรียญบาทบริเวณป้ายเลขที่บ้านจะทำให้เราเพิ่มค่าตัวเลขของเลขบ้านได้ โดยไม่จำเป็นต้องเปลี่ยนป้ายเลขที่บ้านออกไป",13f);


        JPanel page1 = new JPanel(cardLayout);
        JPanel panel = new JPanel();
        JPanel page2 = new JPanel();

        page1.add(panel, "Page_1");
        page1.add(page2, "Page_2");


        JPanel textPanel = new JPanel();
        JPanel textPanel1 = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        GroupLayout layout2 = new GroupLayout(page2);
        GroupLayout layout3 = new GroupLayout(textPanel1);
        textPanel1.setLayout(layout3);

        JScrollPane scrollPane = new JScrollPane(textPanel);
        scrollPane.setPreferredSize(new Dimension(100, 100));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBackground(new Color(117, 55, 10));
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(188, 96, 27), 2   ));




        JScrollPane scrollPane1 = new JScrollPane(textPanel1);
        scrollPane.setPreferredSize(new Dimension(100, 100));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBackground(new Color(117, 55, 10));
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(188, 96, 27), 2   ));

        JPanel[] labelPanels = new JPanel[6];

        JComponent[][] labelContent = {
                {keyMsg, msg},
                {keyJob, job},
                {keyAddParticle, addParticle},
                {keyDOB, DOB},
                {keySumNum, sumNum},
                {keyDuoNumberMsg,duoNumberMsg}
        };

        JButton goBack = new ButtonBox("<- กลับ",12f);
        goBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(page1, "Page_1");
            }
        });

        Color backgroundColor = new Color(117, 55, 10);
        textPanel.setBackground(backgroundColor);

        textPanel1.setBackground(backgroundColor);
        page2.setLayout(layout2);
        layout2.setAutoCreateGaps(true);
        layout2.setAutoCreateContainerGaps(true);
        GroupLayout.SequentialGroup vGroup2 = layout2.createSequentialGroup();
        GroupLayout.SequentialGroup hGroup2 = layout2.createSequentialGroup();
        vGroup2.addComponent(goBack);
        vGroup2.addComponent(scrollPane1);
        hGroup2.addGroup(
                layout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(scrollPane1).addComponent(goBack)
        );
        layout2.setVerticalGroup(vGroup2);
        layout2.setHorizontalGroup(hGroup2);


        layout3.setAutoCreateGaps(true);
        layout3.setAutoCreateContainerGaps(true);
        GroupLayout.SequentialGroup vGroup3 = layout3.createSequentialGroup();
        GroupLayout.SequentialGroup hGroup3 = layout3.createSequentialGroup();

        vGroup3.addGroup(
                layout3.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(reComTitle)
        );
        vGroup3.addComponent(reComStateKey1);
        vGroup3.addComponent(reComStateValue1);
        vGroup3.addComponent(reComStateKey2);
        vGroup3.addComponent(reComStateValue2);
        vGroup3.addComponent(reComStateKey3);
        vGroup3.addComponent(reComStateValue3);
        vGroup3.addComponent(reComStateKey4);
        vGroup3.addComponent(reComStateValue4);
        vGroup3.addComponent(reComStateKey5);
        vGroup3.addComponent(reComStateValue5);
        vGroup3.addComponent(reComStateKey6);
        vGroup3.addComponent(reComStateValue6);
        vGroup3.addComponent(reComStateKey7);
        vGroup3.addComponent(reComStateValue7);


        layout3.setVerticalGroup(vGroup3);

        hGroup3.addGroup(
                layout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(reComTitle)
                        .addComponent(reComStateKey1).addComponent(reComStateValue1)
                        .addComponent(reComStateKey2).addComponent(reComStateValue2)
                        .addComponent(reComStateKey3).addComponent(reComStateValue3)
                        .addComponent(reComStateKey4).addComponent(reComStateValue4)
                        .addComponent(reComStateKey5).addComponent(reComStateValue5)
                        .addComponent(reComStateKey6).addComponent(reComStateValue6)
                        .addComponent(reComStateKey7).addComponent(reComStateValue7)
        );

        layout3.setHorizontalGroup(hGroup3);

        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));

        for (int i = 0; i < labelPanels.length; i++) {
            labelPanels[i] = new JPanel();
            labelPanels[i].setBackground(backgroundColor);
            for (JComponent component : labelContent[i]) {
                labelPanels[i].add(component);
            }
            textPanel.add(labelPanels[i]);
        }

        panel.setBackground(new Color(196, 97, 24));
        page2.setBackground(new Color(196, 97, 24));
        panel.setLayout(layout);

        JLabel HomeNo = new LableText("บ้านเลขที่: ",15f,Font.BOLD);
        JTextField input = new InputBox(20);
        JLabel labelSelect = new LableText("เลือกวันเกิด: ", 15f, Font.BOLD);
        JComboBox<String> comboBox = new SelectBox<String>(constant.DAYS);
        JButton button = new ButtonBox("ทำการคำนวณ!",16f,Font.BOLD);
        JButton recom = new ButtonBox("แนะนำเสริมดวง",12f,Font.BOLD);
        recom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(page1, "Page_2");
            }
        });
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
                    String sumDigit = calculatorDigit.address(in);
                    if(rootDigit == -1)
                        return;
                    List<String> duoMsgs = duoNumberRepository.find(sumDigit);
//                    System.out.println(duoMsgs.get(0).toString());
//                    System.out.println(duoMsgs.get(1).toString());
                    List<String> dob = birthdayNumberRepository.find(se,rootDigit);
                    HomeNumber home = homeNumberRepository.find(rootDigit);
                    sumNum.setText(rootDigit + "");
                    msg.setText(home.msg);
                    job.setText(home.job);
                    addParticle.setText(home.recommend.toString());
                    DOB.setText(dob.toString());
                    duoNumberMsg.setText(duoMsgs.toString());
//                    duoNumber
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
        vGroup.addGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button)
        );
        vGroup.addComponent(recom);
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
                layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(button).addComponent(recom).addComponent(scrollPane)
        );
        layout.setHorizontalGroup(hGroup);
        frame.add(page1);
    }

    public void run() {
        this.ui();
        frame.setVisible(true);
    }
}
