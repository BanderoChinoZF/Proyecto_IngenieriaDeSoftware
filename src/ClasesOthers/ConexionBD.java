package ClasesOthers;

import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/ingenieria";
    private static final String USER = "root";
    private static final String PASS = "123456789";
    
    public static Connection getConnection()
    {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return connection;
    }

   

    void establecerconexion(String root, String string) {
        //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement prepareStatement(String select__from_persona_WHERE_clave__) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
