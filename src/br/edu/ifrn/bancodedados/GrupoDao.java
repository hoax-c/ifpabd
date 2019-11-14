
package br.edu.ifrn.bancodedados;

import br.edu.ifrn.dominio.Grupo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GrupoDao {
    
    private Connection conexao;
    
    public GrupoDao(){
         this.conexao = new Conexao().pegaConexao();
    }
    public void addGrupo(Grupo grupo){
        String sql = "insert into grupo(Tema, Id_Turma)" + "values (?,?)";
        
        try(PreparedStatement stmt = conexao.prepareStatement(sql)){
			
			stmt.setString(1, grupo.getTema());
			stmt.setInt(2, grupo.getIdTurma());

			int resultado = stmt.executeUpdate();
			
			if(resultado < 1){
				JOptionPane.showMessageDialog(null, "Erro ao implementar", "Aviso", JOptionPane.ERROR_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
    }
    
    
    public void removerGrupo(int id) {
        String sql = "delete from grupo where id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int resultado = stmt.executeUpdate();

            if (resultado < 1) {
                JOptionPane.showMessageDialog(null, "Erro ao implementar", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
    public String getTema() throws SQLException{
        String tema = null;
        String sql = "select Tema from grupo";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            
            tema = rs.getString("Tema");
            
        }
        return tema;
        
    }
    
    
}
