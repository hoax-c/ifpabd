
package br.edu.ifrn.dominio;

public class Aluno {
    
    private String nome;
    private int id;
    Turma turma;

    public Aluno(String nome, Turma turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
    public int getIdTurma(){
        return turma.getId();
    }
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", id=" + id + '}';
    }
    
    
    
}
