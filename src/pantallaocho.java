import java.awt.BorderLayout;
 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 
public class pantallaocho {
 
    public pantallaocho() {
        JTextArea textArea = new JTextArea();
        textArea.setText("Países de América");
        textArea.append("\n-------------------------------------------------------");
        textArea.append("\n JScrollPane es un contenedor para componentes");
        textArea.append("\n que necesiten redimensionarse a través de una");
        textArea.append("\n barra deslizable tanto vertical como horizontalmente.");
        textArea.append("\n-----------------------------------------------------");
        textArea.append("\n 1 - Estados Unidos");
        textArea.append("\n 2 - Canadá");
        textArea.append("\n 3 - Brasil");
        textArea.append("\n 4 - México");
        textArea.append("\n 5 - Argentina");
        textArea.append("\n 6 - Colombia");
        textArea.append("\n 7 - Perú");
        textArea.append("\n 8 - Chile");
        textArea.append("\n 9 - Honduras");
        textArea.append("\n 10 -Uruguay");
        JScrollPane scroll = new JScrollPane(textArea);
 
        JFrame frame = new JFrame("JScrollPane");
        frame.getContentPane().add(scroll, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        new pantallaocho();
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
