import java.awt.FlowLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
 
public class pantalla10 extends JFrame {
 
    private static final long serialVersionUID = 1L;
 
    private JLabel label;
    private JTextField textField;
    private JButton button;
 
    public pantalla10() {
        setTitle("ToolTipText");
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addComponents();
    }
 
    private void addComponents(){
        label = new JLabel("Usuario:");
        label.setToolTipText("Introduce un nombre usuario");
 
        textField = new JTextField(10);
        textField.setToolTipText("Nombre de usuario");
 
        button = new JButton("Aceptar");
        button.setToolTipText("Pulse el botón aceptar");
 
        add(label);
        add(textField);
        add(button);
 
        pack();
        setLocationRelativeTo(null);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                try{
                    new pantalla10();
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}