import javax.swing.JEditorPane;  
import javax.swing.JFrame;  
  
public class pantalla9 {  
    JFrame myFrame = null;  
  
    public static void main(String[] a) {  
        (new pantalla9()).test();  
    }  
  
    private void test() {  
        myFrame = new JFrame("JEditorPane");  
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        myFrame.setSize(400, 200);  
        JEditorPane myPane = new JEditorPane();  
        myPane.setContentType("text/plain");  
        myPane.setText("El JEditorPane admite texto con cierto formato. Por defecto conoce el text/plain, text/html y text/rtf"  
                + " .El tipo text/plain es el tipo por defecto, así que si no indicamos nada, es el que se usará."  
                + "");  
        myFrame.setContentPane(myPane);  
        myFrame.setVisible(true);  
    }  

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}  
