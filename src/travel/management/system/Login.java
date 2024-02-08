
package travel.management.system;

import java.awt.*;
import javax.swing.*;


public class Login extends JFrame {
    
    Login(){
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0 ,0 , 400, 400 );
        add(p1);
        
        setVisible(true);
    }
    
    public static void main(String []args){
        new Login();
    }
    
}
