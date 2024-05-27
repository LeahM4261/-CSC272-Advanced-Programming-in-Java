import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Gui implements ActionListener {
    JRadioButton red;
    JRadioButton green;
    JRadioButton blue;
    JTextField output;

    public Gui(){
        output = new JTextField("Hello, world");
        red = new JRadioButton("Red");
        red.addActionListener(this);
        blue = new JRadioButton("Blue");
        blue.addActionListener(this);
        green = new JRadioButton("Green");
        green.addActionListener(this);

        JPanel colors = new JPanel();
        colors.add(red);
        colors.add(green);
        colors.add(blue);

        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(green);
        group.add(blue);


    JFrame frame = new JFrame("GUI Advanced");
        frame.setLayout(new BorderLayout());
        frame.add(BorderLayout.WEST, colors);
        frame.setSize(4000, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities. invokeLater(new Runnable() {
            public void run() {
                new Gui();
            }
        });
        
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("in here...");
        JRadioButton btn = (JRadioButton)e.getSource();
        if (btn == red)
            output.setForeground(Color.RED);
        else if (btn == green)
            output.setForeground(Color.GREEN);
        else 
            output.setForeground(Color.BLUE);
     
    }
    
}
