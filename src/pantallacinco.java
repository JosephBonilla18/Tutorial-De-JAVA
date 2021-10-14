import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class pantallacinco extends JFrame implements ActionListener {
JButton boton;
JLabel texto;
JLabel txt;
JLabel txt2;
JLabel txt3;



public pantallacinco() {
setLayout(null);
boton=new JButton("SALIR");
boton.setBounds(100,50,100,30);
boton.addActionListener(this);
add(boton);
texto=new JLabel("Hacer click en el botón para salir.");
texto.setBounds(50,15,220,40);
add(texto);

txt = new JLabel("Un JButton es un componente en el que el");
txt.setBounds(8,80, 250,40);
txt.setForeground(new Color(32,68,240));
add(txt);

txt2 = new JLabel("usuario hace clic para desencadenar");
txt2.setBounds(8,100,250,40);
txt2.setForeground(new Color(32,68,240));
add(txt2);

txt3 = new JLabel("cierta acción");
txt3.setBounds(8,120,250,40);
txt3.setForeground(new Color(32,68,240));
add(txt3);

}


@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource()==boton) {
setTitle("Saldrá en 5 segundos");
try{
Thread.sleep(5000);
System.exit(0);
} catch(Exception excep) {
System.exit(0);
}
}
}


public static void main(String[] ar) {
pantallacinco ventana=new pantallacinco();
ventana.setBounds(500,250,300,250);
ventana.setVisible(true);
ventana.setResizable(false);
}
}