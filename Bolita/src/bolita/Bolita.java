package bolita;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bolita extends Canvas {

    int moverX, moverY;

    public Bolita() {
        this.setSize(400, 200);
    }

    public void paint(Graphics g) {
        //super.print(g);
        g.fillOval(moverX, moverY, 30, 30);

    }

    public int getMoverX() {
        return moverX;
    }

    public int getMoverY() {
        return moverY;
    }

    public void setMoverX(int moverX) {
        this.moverX = moverX;
    }

    public void setMoverY(int moverY) {
        this.moverY = moverY;
    }

    

    // clase controlador 
    public class Controlador extends JFrame {

        JPanel pBolita, pControl;

        public Controlador() {

            setTitle("Mover");
            setSize(400, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(2, 1));
            setResizable(false);

            Bolita b = new Bolita();
            pBolita = new JPanel();
            pControl = new Control();
            pBolita.add(b);
            Control control  = new Control(b);
            pControl.add(control);
            add(pBolita); add(pControl);
        }
        //aqui va el main

        public class Control extends JPanel implements ActionListener {

            JButton btnIzquierda, btnDerecha, btnArriba, btnAbajo;
            Bolita bolita;

            public Control() {
            }

            public Control(Bolita b) {
                setLayout(new BorderLayout());
                btnIzquierda = new JButton("Izquierda");
                btnDerecha = new JButton("Derecha");
                btnArriba = new JButton("Arriba");
                btnAbajo = new JButton("Abajo");

                btnIzquierda.addActionListener(this);
                btnDerecha.addActionListener(this);
                btnArriba.addActionListener(this);
                btnAbajo.addActionListener(this);

                bolita = new Bolita();
                bolita = b;

                add(btnIzquierda, BorderLayout.WEST);
                add(btnDerecha, BorderLayout.EAST);
                add(btnArriba, BorderLayout.NORTH);
                add(btnAbajo, BorderLayout.SOUTH);

            }

            public void actionPerformed(ActionEvent e) {

                if (e.getSource().equals(btnIzquierda)) {
                    bolita.setMoverX(bolita.getMoverX() - 5);
                }

                if (e.getSource().equals(btnDerecha)) {
                    bolita.setMoverX(bolita.getMoverX() + 5);
                }

                if (e.getSource().equals(btnArriba)) {
                    bolita.setMoverY(bolita.getMoverY() - 5);
                }

                if (e.getSource().equals(btnAbajo)) {
                    bolita.setMoverY(bolita.getMoverY() + 5);
                }

                bolita.repaint();
            }

        }
        
    }
    
    
}

