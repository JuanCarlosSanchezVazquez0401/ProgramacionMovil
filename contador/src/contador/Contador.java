
package contador;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Contador extends JFrame implements Runnable, ActionListener {
    JLabel num; int i = 0; boolean contar;
    JButton btnIniciar, btnDetener; Thread hilo;

public Contador(){
    setTitle("Contador");
    setSize(200,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3,1));
    num = new JLabel(i + "");
    add(num); hilo = new Thread(this);
    btnIniciar = new JButton("iniciar");
    btnDetener = new JButton("Detener");
    btnIniciar.addActionListener(this);
    btnDetener.addActionListener(this);
    add(btnIniciar);
    add(btnDetener);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contador c = new Contador();
    }
    
}
