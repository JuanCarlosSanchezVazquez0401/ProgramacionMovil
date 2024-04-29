package capitales;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Capitales extends JFrame implements ActionListener {

    HashMap<String, String> edocap;
    //String ArrEstado [] ={"Sonora","Ciudad de Mexico"};
    //String ArrCapital []={"Hermosillo","CDMX"};    
    JComboBox<String> estados;
    JLabel cap;
    JPanel panel;

    public Capitales() {
        setTitle("Estados y Capitales");
        setSize(300, 100);
        setDefaultCloseOperation(3);

        edocap = new HashMap<>();
        edocap.put("Aguascalientes", "Aguascalientes");
        edocap.put("Baja California", "Mexicali");
        edocap.put("Baja California Sur", "La Paz");
        edocap.put("Campeche", "Campeche");
        edocap.put("Chiapas", "Tuxtla Gutiérrez");
        edocap.put("Chihuahua", "Chihuahua");
        edocap.put("Coahuila", "Saltillo");
        edocap.put("Colima", "Colima");
        edocap.put("Durango", "Durango");
        edocap.put("Guanajuato", "Guanajuato");
        edocap.put("Guerrero", "Chilpancingo");
        edocap.put("Hidalgo", "Pachuca");
        edocap.put("Jalisco", "Guadalajara"); // Ya proporcionado
        edocap.put("Michoacán", "Morelia");
        edocap.put("Morelos", "Cuernavaca");
        edocap.put("Nayarit", "Tepic");
        edocap.put("Nuevo León", "Monterrey"); // Ya proporcionado
        edocap.put("Oaxaca", "Oaxaca");
        edocap.put("Puebla", "Puebla");
        edocap.put("Querétaro", "Querétaro");
        edocap.put("Quintana Roo", "Chetumal");
        edocap.put("San Luis Potosí", "San Luis Potosí");
        edocap.put("Sinaloa", "Culiacán");
        edocap.put("Sonora", "Hermosillo"); // Ya proporcionado
        edocap.put("Tabasco", "Villahermosa");
        edocap.put("Tamaulipas", "Ciudad Victoria");
        edocap.put("Tlaxcala", "Tlaxcala");
        edocap.put("Veracruz", "Xalapa");
        edocap.put("Yucatán", "Mérida");
        edocap.put("Zacatecas", "Zacatecas");

        estados = new JComboBox<>();
        for (String e : edocap.keySet()) {
            estados.addItem(e);
        }

        //estados = new JComboBox<>();
        //for(String e : ArrEstado){
        //    estados.addItem(e);
        //}
        /*
        for(int i=0;i<ArrEstado.length;i++){
            estados.addItem(ArrEstado[i]);
        }
         */
        estados.addActionListener(this);

        cap = new JLabel();

        panel = new JPanel(new BorderLayout());
        panel.add(estados, BorderLayout.NORTH);
        panel.add(cap, BorderLayout.SOUTH);
        add(panel);
    }//fin constructor

    public static void main(String[] args) {
        Capitales c = new Capitales();
        c.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String estadoSelec = (String) estados.getSelectedItem();
        System.out.println(estadoSelec);
        String capitalSelec = edocap.get(estadoSelec);
        System.out.println(capitalSelec);
        cap.setText(capitalSelec);

        /*
        int estadoSelec = (int)estados.getSelectedIndex();
        System.out.println(estadoSelec);
        cap.setText(ArrCapital[estadoSelec]);
         */
    }
}
