
package br.edu.ifrn.dominio;


public class Grupo {
   
    private String tema;
    private int diaApresentacao;
    private int mesApresentacao;
    private int anoApresentacao;
    Turma turma;
 
    public Grupo(String tema, Turma turma) {
        this.tema = tema;
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDiaApresentacao() {
        return diaApresentacao;
    }

    public void setDiaApresentacao(int diaApresentacao) {
        this.diaApresentacao = diaApresentacao;
    }

    public int getMesApresentacao() {
        return mesApresentacao;
    }

    public void setMesApresentacao(int mesApresentacao) {
        this.mesApresentacao = mesApresentacao;
    }

    public int getAnoApresentacao() {
        return anoApresentacao;
    }

    public void setAnoApresentacao(int anoApresentacao) {
        this.anoApresentacao = anoApresentacao;
    }

    public int getIdTurma(){
        return turma.getId();
    }
    
    
    @Override
    public String toString() {
        return "Grupo{" + "tema=" + tema + ", diaApresentacao=" + diaApresentacao + ", mesApresentacao=" + mesApresentacao + ", anoApresentacao=" + anoApresentacao + '}';
    }
    
    
}
