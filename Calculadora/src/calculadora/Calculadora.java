
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

JPanel pp,pb;
JTextField p;
JButton b[];
String bt[] = new String[]{"7","8","9","+",
                            "4","5","6","-",
                            "1","2","3","*",
                            "0",".","=","/"};

public  Calculadora(){
    setTitle("Calculadora");
    setSize(190,170);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(2,1));
    setLayout(new BorderLayout());
    
pp = new JPanel();
pb = new JPanel();
p  = new JTextField(20);
b  = new JButton[16];

pb.setLayout(new GridLayout(4,4));
pp.add(p);
add(pp);add(BorderLayout.NORTH, pp);
for(int i = 0; i < 16; i++){
    b[i] = new JButton(bt[i]);
    pb.add(b[i]);
}

add(pb); add(BorderLayout.SOUTH,pb);{
} // fin del constructor
    

}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.setVisible(true);
    } //fin del main 
    
}
