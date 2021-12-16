import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SuppliesCost extends JFrame {
  /*  JTable tab;
        JScrollPane scroll;
        JLabel month,tittle,total_paied,due;
        JTextField t1,t2,t3;
        JComboBox m;
        JButton back,submit;
        public SuppliesCost(){
            String[] column = {"DATE","NAME","SUPPLIES_NAME","SUPPLIES_COST","TOTAL"};
            String[][] row = {
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                    {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                    {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},

            };
            tab= new JTable(row,column);

            month=new JLabel("      MONTH          :");
            total_paied=new JLabel("TOTAL PAIED     : ");
            due=new JLabel("        DUE              : ");
            tittle=new JLabel("SUPPLIES CALCULATION");


            t1=new JTextField(10);
            t2=new JTextField(10);
            t3=new JTextField(10);

            m=new JComboBox();
            submit=new JButton("Submit");
            back=new JButton("Back");
            scroll = new JScrollPane(tab);

            setTitle("SUPPLIES ESTIMATES");
            setBounds(380, 120, 600, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setLayout(null);

            month.setBounds(60, 80, 150, 25);
            getContentPane().add(month);

            t1.setBounds(170, 80, 100, 25);
            getContentPane().add(t1);

            total_paied.setBounds(60, 110, 150, 25);
            getContentPane().add(total_paied);

            t2.setBounds(170, 110, 100, 25);
            getContentPane().add(t2);

            due.setBounds(60, 140, 100, 25);
            getContentPane().add(due);

            t3.setBounds(170, 140, 100, 25);
            getContentPane().add(t3);

            tittle.setBounds(150, 200, 220, 25);
            getContentPane().add(tittle);

            scroll.setBounds(40,220,450,200);
            getContentPane().add(scroll);

            submit = new JButton();
            submit.setBounds(360, 450, 80, 30);
            getContentPane().add(submit);

            back.setBounds(460, 450, 80, 30);
            getContentPane().add(back);

            setVisible(true);

            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        File file=new File("C:/Users/ASUS/Desktop/Project/SuppliesCost.txt");
                        if(!file.exists()){
                            file.createNewFile();
                        }
                        FileWriter fw=new FileWriter(file.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);

                        for(int i=0; i<tab.getRowCount();i++){
                            for(int j=0; j<tab.getColumnCount();j++){
                                bw.write(tab.getModel().getValueAt(i,j)+"");
                            }
                            bw.write("\n         \n");
                        }
                        bw.close();
                        fw.close();
                        JOptionPane.showMessageDialog(null,"Data Exported");
                    }
                    catch(Exception e1){
                        e1.printStackTrace();

                    }
                }
            });

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();
                    Welcome obj = new Welcome();
                }
            });
        }*/

    JTable tab;
    JScrollPane scroll;
    JLabel month,tittle,total_paied,due;
    JTextField t1,t2,t3;
    JComboBox m;
    JButton back,submit;

    public SuppliesCost(){

        String column[] = {"DATE","NAME","SUPPLIES_NAME","SUPPLIES_COST","TOTAL"};
        String row[][] = {
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","      ","     ","      ","     ","     ","     ","     ","     ","     "},
                {"","     ","     ","     ","     ","     ","     ","     ","     ","     ","     "},
        };
        tab= new JTable(row,column);

        month=new JLabel("      MONTH          :");
        total_paied=new JLabel("TOTAL PAIED     : ");
        due=new JLabel("        DUE              : ");
        tittle=new JLabel("SUPPLIES CALCULATION");


        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);

        m=new JComboBox();
        submit=new JButton("Submit");
        back=new JButton("Back");
        scroll = new JScrollPane(tab);

        setTitle("SUPPLIES CALCULATION");
        setBounds(380, 120, 580, 580);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        month.setBounds(60, 80, 150, 25);
        getContentPane().add(month);

        t1.setBounds(170, 80, 100, 25);
        getContentPane().add(t1);

        total_paied.setBounds(60, 110, 150, 25);
        getContentPane().add(total_paied);

        t2.setBounds(170, 110, 100, 25);
        getContentPane().add(t2);

        due.setBounds(60, 140, 100, 25);
        getContentPane().add(due);

        t3.setBounds(170, 140, 100, 25);
        getContentPane().add(t3);

        tittle.setBounds(150, 200, 220, 25);
        getContentPane().add(tittle);

        scroll.setBounds(40,220,450,200);
        getContentPane().add(scroll);

        submit.setBounds(360, 450, 80, 30);
        getContentPane().add(submit);

        back.setBounds(460, 450, 80, 30);
        getContentPane().add(back);

        setVisible(true);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                try{
                    File file=new File("C:/Users/ASUS/Desktop/Project/SuppliesCost.txt");
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    FileWriter fw=new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);

                    for(int i=0; i<tab.getRowCount();i++){
                        for(int j=0; j<tab.getColumnCount();j++){
                            bw.write(tab.getModel().getValueAt(i,j)+"");
                        }
                        bw.write("\n         \n");
                    }
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(null,"Data Exported");
                }
                catch(Exception e1){
                    e1.printStackTrace();

                }
            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Welcome obj = new Welcome();
            }
        });
    }



}



