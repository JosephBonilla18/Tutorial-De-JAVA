import java.awt.Color;
import javax.swing.*;    
import java.awt.event.*;  
public class pantallatres {  
    public static void main(String[] args) {    
    JFrame f=new JFrame("Password Field");    
     final JLabel label = new JLabel();            
     label.setBounds(20,150, 200,50);  
     final JPasswordField value = new JPasswordField();   
     value.setBounds(100,75,100,30);   
     JLabel l1=new JLabel("Usuario:");    
        l1.setBounds(20,20, 80,30);    
        JLabel l2=new JLabel("Contraseña:");    
        l2.setBounds(20,75, 80,30);    
        JButton b = new JButton("Registrarse");  
        b.setBounds(100,120, 80,30);
        b.setSize(120,50);
        b.setBackground(new Color(248,98,7));
        b.setForeground(Color.white);
        JButton c = new JButton("Siguiente");
        c.setLocation(80,200);
        c.setSize(120,50);
        c.setBackground(Color.blue);
        c.setForeground(Color.white);
         JLabel label2 = new JLabel("El JPassWordField es una subclase del JTextField"); 
         label2.setBounds(20,200,300,30); 
         f.add(label2); 
         JLabel label3 = new JLabel("empleado para recibir contraseñas");
         label3.setBounds(20,230,300,30);
         f.add(label3);
        final JTextField text = new JTextField();  
        text.setBounds(100,20, 100,30);    
                f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);  
                f.setSize(350,350);
                f.setLayout(null);    
                f.setVisible(true);  
                b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {       
                   String data = "Usuario " + text.getText();  
                   data += ", Contraseña: "   
                   + new String(value.getPassword());   
                   label.setText(data);          
                }  
             });   
}  

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  


