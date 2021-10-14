package ventanas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class pantallaone extends JFrame implements ItemListener{
 
 private JTextField texto;
 private JCheckBox negrita;
 private JCheckBox cursiva;
 private Font fuente;
 private JLabel titulo;
 private JLabel txt;
 public pantallaone()
 {
  super("CheckBox");
  this.setLayout(new FlowLayout());
  this.setSize(500,300);
  this.definirVentana();
  this.setVisible(true);
 }
  
 
 public void definirVentana()
 {
  texto=new JTextField(20);
  negrita=new JCheckBox("Negrita");
  cursiva=new JCheckBox("Cursiva");
  add(texto);
  add(negrita);
  add(cursiva);
  negrita.addItemListener(this);
  cursiva.addItemListener(this);  
   
  titulo = new JLabel("El CheckBox es un widget que permite realizar selecciones múltiples");
  titulo.setForeground(new Color(0,134,190));
  titulo.setFont(new Font("Arial", Font.PLAIN, 12));
  titulo.setSize(500, 25);
  titulo.setLocation(100, 500);
  this.add(titulo);
  
  txt = new JLabel("de un conjunto de opciones");
  txt.setForeground(new Color(0,134,190));
  txt.setFont(new Font("Arial", Font.PLAIN, 12));
  txt.setSize(500, 25);
  txt.setLocation(100, 540);
  this.add(txt);
  
 }
 
 
 public void itemStateChanged(ItemEvent e) {
  
  if(negrita.isSelected() && cursiva.isSelected())
  {
   fuente =new Font("Serief",Font.BOLD|Font.ITALIC,14);
   texto.setFont(fuente);
  }
  else if(cursiva.isSelected())
  {
   fuente=new Font("Serief",Font.ITALIC,14);
   texto.setFont(fuente);
  }
  else if(negrita.isSelected())
  {
   fuente=new Font("Serief",Font.BOLD,14);
   texto.setFont(fuente);
  }
  else
   {fuente=new Font("Serief",Font.PLAIN,14);
  texto.setFont(fuente);}
   
 }
 public static void main(String[] args) {
  pantallaone test=new pantallaone();
  
 }

 
  

}