
package ClasesOthers;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hello
 */
public class Validaciones {
   
    public void letras(JTextField campo)
    {
       campo.addKeyListener(new KeyAdapter()
               {
                  public void KeyTyped(KeyEvent e) 
                  {
                      char c= e.getKeyChar();
                      if(Character.isDigit(c))
                      {
                          e.consume();
                           JOptionPane.showMessageDialog(null, "solo se pueden ingresar letras");
                          
                      }
                  }
               });
    }
    
     public void numeros(JTextField campo)
    {
       campo.addKeyListener(new KeyAdapter()
               {
                  public void KeyTyped(KeyEvent e) 
                  {
                      char c= e.getKeyChar();
                      if(Character.isLetter(c))
                      {
                          
                          e.consume();
                          JOptionPane.showMessageDialog(null,"solo se pueden ingresar números");
                      }
                  }
               });
    }
     
     
     public void limite(JTextField campo, int cantidad)
    {
       campo.addKeyListener(new KeyAdapter()
               {
                  public void KeyTyped(KeyEvent e) 
                  {
                      char c= e.getKeyChar();
                      int tam=campo.getText().length();
                      if(tam>=cantidad)
                      {
                          e.consume();
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
                      }
                  }
               });
    }
    
    
    
    
}
