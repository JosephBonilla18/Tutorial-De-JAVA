import java.awt.*;
import javax.swing.*;
public class pantallacuatro {
 JTextField dato1,dato2;
 JLabel txt;
 public pantallacuatro(){
 JFrame ventana = new JFrame("Text Field");
 dato1 = new JTextField("Joseph",20); 
 dato1.setBackground(new Color(255, 173, 91));
 dato1.setForeground(Color.white);
 dato2 = new JTextField("Bonilla",20);
 dato2.setBackground(new Color(118, 223, 245));
 dato2.setForeground(Color.black);
 dato2.setLocation(20,180);
 JLabel txt = new JLabel("El componente TextField es un campo de texto editable por el usuario");
 txt.setFont(new Font("Arial", Font.PLAIN, 11));
 txt.setLocation(20,180);
 txt.setSize(30,30);
 ventana.getContentPane().setLayout(new GridLayout(12,35));

 
 ventana.setSize(370, 400);
 ventana.setVisible(true);
 ventana.add(dato1);
 ventana.add(dato2);
 ventana.add(txt);
 }
 public static void main (String[]args){
 pantallacuatro t1 = new pantallacuatro();
 }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
