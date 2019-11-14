package br.edu.ifrn.bancodedados;

import br.edu.ifrn.dominio.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TurmaDao {

    private Connection conexao;

    public TurmaDao() {
        this.conexao = new Conexao().pegaConexao();
    }

    public void addTurma(Turma turma) {

        String sql = "insert into turma(Id_Turma, Curso, Série, Turno) values(?,?,?,?)";

        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, turma.getId());
            stmt.setString(2, turma.getCurso());
            stmt.setInt(3, turma.getSerie());
            stmt.setString(4, turma.getTurno());

            int resultado = stmt.executeUpdate();
            if (resultado < 1) {
                JOptionPane.showMessageDialog(null, "Erro ao implementar", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
    public void removerTurma(int id){
        String sql = "delete from turma where id = ?";
        
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
    
    public String getCurso() throws SQLException{
        
        String curso = null;
        String sql = "select Curso from turma";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            
            curso = rs.getString("Curso");
            
        }
        
        return curso;
    }
    
    public int getSerie() throws SQLException{
        
        int serie = 0;
        String sql ="select Série from turma";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            
            serie = rs.getInt("Série");
        }
        
        return serie;
        
    }
    
    public String getTurno() throws SQLException{
        
        String curso = null;
        String sql = "select Curso from turma";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            
            curso = rs.getString("Curso");
        }
    
        return curso;
    }   
    
    public int getId() throws SQLException{
        
        int id = 0;
        String sql = "Select Id_Turma from turma";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            
            id = rs.getInt("Id_Turma");
        }
        
        return id;
    }
}
