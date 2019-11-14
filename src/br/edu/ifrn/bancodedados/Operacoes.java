
package br.edu.ifrn.bancodedados;

import br.edu.ifrn.dominio.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Operacoes {
    private Connection conexao;

    public Operacoes() {
        this.conexao = new Conexao().pegaConexao();
    }
    
    public void addAluno(Aluno aluno){
        String sql = "insert into aluno(Id_Turma, Nome)" + "values (?,?)";
        
        try(PreparedStatement stmt = conexao.prepareStatement(sql)){
			
			stmt.setInt(1, aluno.getIdTurma());
			stmt.setString(2, aluno.getNome());

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
    
    public void removerAluno(int id){
        String sql = "delete from aluno where id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int resultado = stmt.executeUpdate();

            if (resultado < 1) {
                JOptionPane.showMessageDialog(null, "Erro ao Remover", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
