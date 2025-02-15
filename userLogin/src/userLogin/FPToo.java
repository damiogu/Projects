package userLogin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class FPToo {
    JFrame frame;
    private JTextField txtIncome;
    private JTextField txtAmountSaved;
    private JTextField txtDesiredAmount;
    private JTextField txtPercentage;
    private JLabel lblResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FPToo window = new FPToo();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FPToo() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(60, 63, 65));
        frame.getContentPane().setLayout(null);

        JPanel menu = new JPanel();
        menu.setBackground(new Color(245, 245, 245));
        menu.setBounds(10, 11, 1167, 540);
        frame.getContentPane().add(menu);
        menu.setLayout(null);
        menu.setBorder(new LineBorder(Color.BLACK, 2));

        frame.setBounds(100, 100, 1203, 601);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblIncome = new JLabel("INCOME");
        lblIncome.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblIncome.setHorizontalAlignment(SwingConstants.CENTER);
        lblIncome.setBounds(510, 120, 150, 45);
        menu.add(lblIncome);

        txtIncome = new JTextField();
        txtIncome.setFont(new Font("Tahoma", Font.PLAIN, 35));
        txtIncome.setHorizontalAlignment(SwingConstants.CENTER);
        txtIncome.setForeground(Color.WHITE);
        txtIncome.setBackground(new Color(112, 128, 144));
        txtIncome.setBounds(659, 120, 498, 45);
        menu.add(txtIncome);
        txtIncome.setColumns(10);

        JLabel lblAmountSaved = new JLabel("AMOUNT SAVED");
        lblAmountSaved.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAmountSaved.setHorizontalAlignment(SwingConstants.CENTER);
        lblAmountSaved.setBounds(499, 202, 150, 45);
        menu.add(lblAmountSaved);

        txtAmountSaved = new JTextField();
        txtAmountSaved.setFont(new Font("Tahoma", Font.PLAIN, 35));
        txtAmountSaved.setHorizontalAlignment(SwingConstants.CENTER);
        txtAmountSaved.setForeground(Color.WHITE);
        txtAmountSaved.setBackground(new Color(112, 128, 144));
        txtAmountSaved.setBounds(659, 202, 498, 45);
        menu.add(txtAmountSaved);
        txtAmountSaved.setColumns(10);

        JLabel lblDesiredAmount = new JLabel("Your Desired Amount");
        lblDesiredAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblDesiredAmount.setHorizontalAlignment(SwingConstants.CENTER);
        lblDesiredAmount.setBounds(420, 283, 250, 45);
        menu.add(lblDesiredAmount);

        txtDesiredAmount = new JTextField();
        txtDesiredAmount.setFont(new Font("Tahoma", Font.PLAIN, 35));
        txtDesiredAmount.setHorizontalAlignment(SwingConstants.CENTER);
        txtDesiredAmount.setForeground(Color.WHITE);
        txtDesiredAmount.setBackground(new Color(112, 128, 144));
        txtDesiredAmount.setBounds(659, 283, 498, 45);
        menu.add(txtDesiredAmount);
        txtDesiredAmount.setColumns(10);

        JLabel lblPercentage = new JLabel("% of Income you want to save");
        lblPercentage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPercentage.setHorizontalAlignment(SwingConstants.CENTER);
        lblPercentage.setBounds(335, 361, 350, 45);
        menu.add(lblPercentage);

        txtPercentage = new JTextField();
        txtPercentage.setFont(new Font("Tahoma", Font.PLAIN, 35));
        txtPercentage.setHorizontalAlignment(SwingConstants.CENTER);
        txtPercentage.setForeground(Color.WHITE);
        txtPercentage.setBackground(new Color(112, 128, 144));
        txtPercentage.setBounds(659, 361, 498, 45);
        menu.add(txtPercentage);
        txtPercentage.setColumns(10);

        lblResult = new JLabel("");
        lblResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblResult.setHorizontalAlignment(SwingConstants.CENTER);
        lblResult.setBounds(659, 484, 162, 45);
        lblResult.setBorder(new LineBorder(Color.BLACK, 1));
        menu.add(lblResult);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCalculate.setBackground(new Color(30, 144, 255));
        btnCalculate.setForeground(Color.WHITE);
        btnCalculate.setBounds(1057, 417, 100, 39);
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTime();
            }
        });
        menu.add(btnCalculate);

        JLabel lblYears = new JLabel("Amount of Years");
        lblYears.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblYears.setHorizontalAlignment(SwingConstants.CENTER);
        lblYears.setBounds(411, 484, 162, 45);
        menu.add(lblYears);

        JLabel lblTitle = new JLabel("MARRIED (Taxes Pre Calculated)");
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBounds(414, 11, 500, 50);
        lblTitle.setForeground(new Color(0, 128, 128));
        menu.add(lblTitle);

        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnMainMenu.setBackground(new Color(255, 69, 0));
        btnMainMenu.setForeground(Color.WHITE);
        btnMainMenu.setBounds(20, 283, 134, 70);
        btnMainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LOGIN login = new LOGIN();
                login.frame.setVisible(true);
                frame.dispose();
            }
        });
        menu.add(btnMainMenu);
    }

    private void calculateTime() {
        try {
            double income = Double.parseDouble(txtIncome.getText());
            double saved = Double.parseDouble(txtAmountSaved.getText());
            double percentage = Double.parseDouble(txtPercentage.getText()) / 100;
            double desiredAmount = Double.parseDouble(txtDesiredAmount.getText());

            if (income <= 20550) {
                income *= 0.90;
            } else if (income <= 83550) {
                income *= 0.88;
            } else if (income <= 178150) {
                income *= 0.78;
            } else if (income <= 340100) {
                income *= 0.76;
            } else if (income <= 431900) {
                income *= 0.68;
            } else if (income <= 647850) {
                income *= 0.65;
            } else {
                income *= 0.63;
            }

            double annualSavings = income * percentage + saved;
            double years = desiredAmount / annualSavings;
            lblResult.setText(String.format("%.2f", years));

        } catch (NumberFormatException e) {
            lblResult.setText("Invalid Input");
        }
    }
}
