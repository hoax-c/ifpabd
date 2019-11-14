
package br.edu.ifrn.dominio;

public class Turma {
   
    public int idTurma;
    private String curso;
    private int serie;
    private String turno;

    public Turma(String curso, int serie, String turno) {
        
        this.curso = curso;
        this.serie = serie;
        this.turno = turno;
    }

    
    
    public int getId() {
        return idTurma;
    }

    public void setId(int id) {
        this.idTurma = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + idTurma + ", curso=" + curso + ", serie=" + serie + ", turno=" + turno + '}';
    }
    
    
}
