package userLogin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN {
    JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LOGIN window = new LOGIN();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LOGIN() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.getContentPane().setLayout(null);

        JPanel menu = new JPanel();
        menu.setBackground(Color.WHITE);
        menu.setBounds(10, 11, 1167, 540);
        frame.getContentPane().add(menu);
        menu.setLayout(null);

        frame.setBounds(100, 100, 1203, 601);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		  
		  


        JButton btnMarried = new JButton("MARRIED");
        btnMarried.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnMarried.setForeground(Color.WHITE);
        btnMarried.setBackground(Color.BLACK);
        btnMarried.setBounds(414, 375, 349, 140);
        btnMarried.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FPToo fp2 = new FPToo();
                fp2.frame.setVisible(true);
                frame.dispose();
            }
        });
        menu.add(btnMarried);

        JButton btnSingles = new JButton("SINGLES");
        btnSingles.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnSingles.setForeground(Color.WHITE);
        btnSingles.setBackground(Color.BLACK);
        btnSingles.setBounds(414, 224, 349, 140);
        btnSingles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FP fp = new FP();
                fp.frame.setVisible(true);
                frame.dispose();
            }
        });
        menu.add(btnSingles);
    }
}
