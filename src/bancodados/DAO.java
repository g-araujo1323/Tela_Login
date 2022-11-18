
package bancodados;

import java.sql.*;

public class DAO {
    private String usuario = "adm";
    private String senha = "@Usjt2022";
    private String host = "127.0.0.1";
    private String porta = "3306";
    private String bd = "sae";
    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd+"?useTimezone=true&serverTimezone=UTC", usuario, senha);
            System.out.println("Banco Conectado com Sucesso!!!!");
            return c;
        }
        catch (Exception e){
            System.out.println("Banco NAO Conectado!!!!");
            e.printStackTrace();
            return null;
        }
    }

}
