import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Tic implements ActionListener {

    private JFrame f   = new JFrame("Tic-Tac-Toe");
    private JPanel jpl;                         // Left Panel
    private JPanel jpr;                         // Right Panel
    private JButton b[] = new JButton[9];
    private JLabel l1 = new JLabel();   //player X
    private JLabel score_p1 = new JLabel("0");
    private JLabel l2 = new JLabel();   //player O
    private JLabel score_p2 = new JLabel("0");
    private JButton reset, exit;
    private int score_1=0, score_2=0;
    private int state = 1;
    int k=0;

    public Tic()
    {
        f.setSize(750,400);
        f.setLocationRelativeTo(null);

        l1.setText(JOptionPane.showInputDialog(f,"Enter player 1 name "));
        l2.setText(JOptionPane.showInputDialog(f,"Enter player 2 name "));

        jpl = new JPanel(new GridLayout(3,3));

        for(int i=0; i<9; i++)
        {
            b[i] = new JButton();
            b[i].setFont(new Font("Arial", Font.ITALIC, 50));
            b[i].addActionListener(this);
            jpl.add(b[i]);

        }

        jpl.setBounds(0,0,400,400);

        jpr = new JPanel(null);
        jpr.setBounds(401,0,349,400);
        jpr.setBackground(Color.GREEN);

        l1.setBounds(30,50,100,50);
        l1.setFont(new Font("Arial", Font.ITALIC, 18));

        score_p1.setBounds(170,50,70,50);
        score_p1.setFont(new Font("Arial", Font.ITALIC, 18));

        l2.setBounds(30,100,100,50);
        l2.setFont(new Font("Arial", Font.ITALIC, 18));

        score_p2.setBounds(170,100,70,50);
        score_p2.setFont(new Font("Arial", Font.ITALIC, 18));

        reset = new JButton("Reset");  reset.setBounds(50,250,100,40);
        exit  = new JButton("Exit");   exit.setBounds(200,250,70,40);

        jpr.add(l1); jpr.add(l2);   jpr.add(exit);   jpr.add(reset);
        jpr.add(score_p1);  jpr.add(score_p2);

        reset.addActionListener(this);
        exit.addActionListener(this);

        f.add(jpl);   f.add(jpr);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        set();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b[0] && b[0].getText().equals(" "))
        {
            if(state == 1)  { b[0].setText("X");  state =0; k++; }
            else            { b[0].setText("O");  state =1; k++; }
        }

        if(e.getSource() == b[1] && b[1].getText().equals(" "))
        {
            if(state == 1)  { b[1].setText("X");  state =0; k++; }
            else            { b[1].setText("O");  state =1; k++;}
        }

        if(e.getSource() == b[2] && b[2].getText().equals(" "))
        {
            if(state == 1)  { b[2].setText("X");  state =0; k++; }
            else            { b[2].setText("O");  state =1; k++; }
        }

        if(e.getSource() == b[3] && b[3].getText().equals(" "))
        {
            if(state == 1)  { b[3].setText("X");  state =0; k++; }
            else            { b[3].setText("O");  state =1; k++; }
        }

        if(e.getSource() == b[4] && b[4].getText().equals(" "))
        {
            if(state == 1)  { b[4].setText("X");  state =0; k++; }
            else            { b[4].setText("O");  state =1; k++; }
        }

        if(e.getSource() == b[5] && b[5].getText().equals(" "))
        {
            if(state == 1)  { b[5].setText("X");  state =0; k++; }
            else            { b[5].setText("O");  state =1; k++; }
        }

        if(e.getSource() == b[6] && b[6].getText().equals(" "))
        {
            if(state == 1)  { b[6].setText("X");  state =0; k++; }
            else            { b[6].setText("O");  state =1; k++; }
        }

        if(e.getSource() == b[7] && b[7].getText().equals(" "))
        {
            if(state == 1)  { b[7].setText("X");  state =0; k++; }
            else            { b[7].setText("O");  state =1; k++; }
        }

        if(e.getSource() == b[8] && b[8].getText().equals(" "))
        {
            if(state == 1)  { b[8].setText("X");  state =0; k++; }
            else            { b[8].setText("O");  state =1; k++; }
        }


        if(e.getSource() == exit)
        {
            int i = JOptionPane.showConfirmDialog(f,"Are you want to Close ? ");
            if(i == JOptionPane.YES_OPTION)
                f.dispose();
        }


        if(e.getSource() == reset)
        {
            int i = JOptionPane.showConfirmDialog(f,"Are you want to reset ?");
            if(i == JOptionPane.YES_OPTION)
            {  set();  score_1 = 0;  score_2 = 0;  state =1;}
        }

        // Result condition  check   first for row

        for (int i=0; i<=6; i=i+3)
        {
            if( b[i].getText().equals(b[i+1].getText()) && b[i].getText().equals(b[i+2].getText()))
            {
                if(b[i].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(f,l1.getText() +" Won");
                    set();
                    score_1++;
                    state =1;
                }
                else if(b[i].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(f,l2.getText() +" Won");
                    set();
                    score_2++;
                    state =1;
                }
            }
        }

        //For Columns
        for (int i=0; i<=2; i=i+1)
        {
            if( b[i].getText().equals(b[i+3].getText()) && b[i].getText().equals(b[i+6].getText()))
            {
                if(b[i].getText().equals("X"))
                {
                    JOptionPane.showMessageDialog(f, l1.getText() +" Won");
                    set();
                    score_1++;
                    state =1;
                }
                else if(b[i].getText().equals("O"))
                {
                    JOptionPane.showMessageDialog(f, l2.getText() +" Won");
                    set();
                    score_2++;
                    state =1;
                }
            }
        }

        //  Diagnoal
        if(b[0].getText().equals(b[4].getText()) & b[0].getText().equals(b[8].getText()))
        {
            if(b[0].getText().equals("X"))
            {
                JOptionPane.showMessageDialog(f, l1.getText() +" Won");
                set();
                score_1++;
                state =1;
            }

            if(b[0].getText().equals("O"))
            {
                JOptionPane.showMessageDialog(f, l2.getText() +" Won");
                set();
                score_2++;
                state =1;
            }
        }

        if(b[2].getText().equals(b[4].getText()) & b[2].getText().equals(b[6].getText()))
        {
            if(b[2].getText().equals("X"))
            {
                JOptionPane.showMessageDialog(f, l1.getText() +" Won");
                set();
                score_2++;
                state =1;
            }

            if(b[2].getText().equals("O"))
            {
                JOptionPane.showMessageDialog(f, l2.getText() +" Won");
                set();
                score_2++;
                state =1;
            }
        }

        score_p1.setText(String.valueOf(score_1));
        score_p2.setText(String.valueOf(score_2));
        if(k == 9) { try{ Thread t1 = new Thread();   t1.sleep(200); set();}catch (Exception e1){}}
    }


    public void set()
    {
        for(int i=0; i<9; i++)     b[i].setText(" ");   k =0;  state = 1;
    }

    public static void main(String[] args)
    {
        new Tic();
    }
}
