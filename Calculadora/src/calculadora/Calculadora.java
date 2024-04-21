// bersion modificada si  subir a git
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

    JPanel pp, pb;
    JTextField p;
    JButton b[];
    String bt[] = new String[]{"7", "8", "9", "+",
        "4", "5", "6", "-",
        "1", "2", "3", "*",
        "0", ".", "=", "/"};
    String temp;
    int op1, op2;
    boolean opSuma, opResta, opMult, opDiv;
    

    public Calculadora() {
        setTitle("Calculadora");
        setSize(190, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        pp = new JPanel();
        pb = new JPanel();
        p = new JTextField(20);
        b = new JButton[16];

        pb.setLayout(new GridLayout(4, 4));
        pp.add(p);
        add(pp, BorderLayout.NORTH);
        add(pb, BorderLayout.CENTER);

        for (int i = 0; i < 16; i++) {
            b[i] = new JButton(bt[i]);
            b[i].addActionListener(this); // Agregar ActionListener a cada botón
            pb.add(b[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(b[0])){
            temp = p.getText();
            temp = temp + "7";
            p.setText(temp);
        }
        if(e.getSource().equals(b[1])){
            temp = p.getText();
            temp = temp + "8";
            p.setText(temp);
        }
        if(e.getSource().equals(b[2])){
            temp = p.getText();
            temp = temp + "9";
            p.setText(temp);
        }
        //if(e.getSource().equals(b[3])){
            //temp = p.getText();
            //temp = temp + "+";
            //p.setText(temp);
        //}
        if(e.getSource().equals(b[4])){
            temp = p.getText();
            temp = temp + "4";
            p.setText(temp);
        }
        if(e.getSource().equals(b[5])){
            temp = p.getText();
            temp = temp + "5";
            p.setText(temp);
        }
        if(e.getSource().equals(b[6])){
            temp = p.getText();
            temp = temp + "6";
            p.setText(temp);
        }
        //if(e.getSource().equals(b[7])){
            //temp = p.getText();
            //temp = temp + "-";
            //p.setText(temp);
        //}
        if(e.getSource().equals(b[8])){
            temp = p.getText();
            temp = temp + "1";
            p.setText(temp);
        }
        if(e.getSource().equals(b[9])){
            temp = p.getText();
            temp = temp + "2";
            p.setText(temp);
        }
        if(e.getSource().equals(b[10])){
            temp = p.getText();
            temp = temp + "3";
            p.setText(temp);
        }
        //if(e.getSource().equals(11)){
            //temp = p.getText();
            //temp = temp + "*";
            //p.setText(temp);
        //}
        if(e.getSource().equals(b[12])){
            temp = p.getText();
            temp = temp + "0";
            p.setText(temp);
        }
        if(e.getSource().equals(b[13])){
            temp = p.getText();
            temp = temp + ".";
            p.setText(temp);
        }
        //if(e.getSource().equals(b[14])){
            //temp = p.getText();
            //temp = temp + "=";
            //p.setText(temp);
        //}
        if(e.getSource().equals(b[15])){
            temp = p.getText();
            temp = temp + "/";
            p.setText(temp);
        }
        if(e.getSource().equals(b[3])){
            opSuma=true;opResta=false;opMult=false;opDiv=false;
            op1 = Integer.parseInt(p.getText());
            p.setText("");
        }
        if(e.getSource().equals(b[14])){
            if(opSuma){
                op2 = Integer.parseInt(p.getText());
                int res = op1+op2;
                p.setText(String.valueOf(res));
            }
            
        }
    }

    // Método para evaluar la expresión matemática
    private String evaluarExpresion(String expresion) {
        // Aquí iría la lógica de evaluación de expresiones matemáticas
        return ""; // Implementa la lógica para evaluar la expresión y devolver el resultado
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.setVisible(true);
    }
}
