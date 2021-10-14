import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class pantallaseis extends JFrame{
   protected JSlider selector;
   protected JPanel  mostrador;
   protected JLabel  salida;
   protected JLabel txt;
   protected JLabel txt2;
   public pantallaseis(){
   
    getContentPane().setLayout(new GridLayout(8,15));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    selector  = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
    selector.setSize(1,40);
    salida    = new JLabel("0");
    txt = new JLabel("El JSLIDER tiene un pequeño botón que se puede arrastrar a la derecha o izquierda.");
    txt.setForeground(new Color(32, 68, 240));
    txt2 = new JLabel("Según la posición del pequeño botón, el JSlider tendrá un valor específico.");
    txt2.setForeground(new Color(32, 68, 240));
    mostrador = new JPanel(){{
        add(salida);
        add(txt);
        add(txt2);
    }}; 
    
    add(selector);
    add(mostrador);

    selector.addChangeListener(new ChangeListener(){
        public void stateChanged(ChangeEvent e){
            salida.setText(String.valueOf(selector.getValue()));
            mostrador.setBackground(new Color(selector.getValue() * (int)((new Random()).nextDouble() * 1000000)));
            mostrador.setOpaque(true);
        }
    });
    pack();
   }
    
   public static void main (String [] args)
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new pantallaseis().setVisible(true);
            }
        });
    }
}