package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.Text;

public class Golyo implements ActionListener{
    private JFrame frame;
    private JButton gomb1;
    private JButton gomb2;
    private JButton gomb3, g;
    private JLabel cim, kiiras1;
    private JPanel panel1, panel2;
    int golyo;
    
    public Golyo(){
    ini();
}
    public void ini(){
        frame = new JFrame();
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        golyo = (int)(Math.random() * 3) +1;
        System.out.println(golyo);
        gomb1 = new JButton("gomb1");
        gomb2 = new JButton("gomb2");
        gomb3 = new JButton("gomb3");
        
        cim = new JLabel("Ez a cím");
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        panel1.add(cim);
        
//        GridLayout ablak = new GridLayout();
//        frame.setLayout(ablak);
//        frame.add(gomb1);
//        frame.add(gomb2);
//        frame.add(gomb3);
       
 //FELADAT: label legyen a gombok felett + gombok fixek lehetőleg

        panel2.add(gomb1);  
        panel2.add(gomb2);
        panel2.add(gomb3);
        
        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.SOUTH);
        
        gomb1.addActionListener(this);
        gomb2.addActionListener(this);
        gomb3.addActionListener(this);
        
//        frame.getContentPane().add(gomb1, BorderLayout.WEST);
//        frame.getContentPane().add(gomb2, BorderLayout.EAST);
//        frame.getContentPane().add(gomb3, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Golyo();
    }
        @Override
    public void actionPerformed(ActionEvent e) {
//        cim.setText(e.getActionCommand());
        
        g = (JButton) e.getSource();
        
        
        if(golyo==1 && g.getText().endsWith("1")){
           g.setText("O");
       }else if(golyo==2 && g.getText().endsWith("2")){
           g.setText("O");
       }else if(golyo==3 && g.getText().endsWith("3")){
           g.setText("O");
       }   
        g.setText("X");
    }

}
