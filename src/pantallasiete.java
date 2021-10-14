package chuidiang.ejemplos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class pantallasiete {
	private JTextField tf;
        
	private JSpinner spinner;

	private JFrame v;
        
        private JLabel txt;

	/**
	 * Crea una instancia de esta clase.
	 * @param args
	 */
	public static void main(String[] args) {
		new pantallasiete();
	}
	
	public pantallasiete()
	{
		tf = new JTextField(20);
               
                txt = new JLabel("En el JSPINNER con los dos botones triangulares se puede hacer que el valor del cuadro aumente o disminuya.También se puede escribir directamente un valor dentro del cuadro.");
		txt.setForeground(new Color(32, 68, 240));
                
		spinner = new JSpinner();
		spinner.setValue(30);
		
		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				tf.setText(spinner.getValue().toString());
			}
		
		});
		
		v = new JFrame("JSPINNER");
                v.getContentPane().setLayout(new GridLayout(12,15));
		v.getContentPane().add(spinner);
		v.getContentPane().add(tf);
                v.getContentPane().add(txt);
		v.pack();
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
