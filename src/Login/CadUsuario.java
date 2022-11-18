package Login;

import bancodados.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CadUsuario {
    private String usuario;
    private String senha;

 
    public String ValidarSenha (String usu, String pass){
        
        usuario = usu;
        senha = pass;
 
        String sql = "SELECT senha FROM USUARIO WHERE login = ?";

        DAO dao = new DAO();
        try (Connection c = dao.obtemConexao()){

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario);

            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            String aux = "";
            while (rs.next()){
                senha = rs.getString("senha");       
            }
            System.out.println(senha);
        }   
        catch (Exception e){
            e.printStackTrace();
        }
        
        return(senha);
    }
 
}