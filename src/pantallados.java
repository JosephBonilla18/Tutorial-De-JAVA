package chuidiang.ejemplos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 * Ejemplo de uso de JComboBox.
 * @author chuidiang
 */
public class pantallados {

	private JTextField tf;
	private JComboBox combo;
	private JFrame v;
        private JLabel txt;
        private JLabel txt2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new pantallados();
	}
	
	public pantallados()
	{
                txt = new JLabel("Elija una mes:");
                txt2 = new JLabel("Un JComboBox, es un componente que nos permite seleccionar un dato.");
                txt2.setForeground(new Color(32,68,240));
		
		tf = new JTextField(20);
		
		
		combo = new JComboBox();
		combo.addItem("Enero");
		combo.addItem("Febrero");
		combo.addItem("Marzo");
		combo.addItem("Abril");
                combo.addItem("Mayo");
                combo.addItem("Junio");
                combo.addItem("Julio");
                combo.addItem("Agosto");
                combo.addItem("Septiembre");
                combo.addItem("Octubre");
                combo.addItem("Noviembre");
                combo.addItem("Diciembre");
                
		
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText(combo.getSelectedItem().toString());
			}
		});

		
		v = new JFrame("COMBOBOX");
		v.getContentPane().setLayout(new GridLayout(12,20));
                v.getContentPane().add(txt);
		v.getContentPane().add(combo);
		v.getContentPane().add(tf);
                v.getContentPane().add(txt2);
		v.pack();
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}