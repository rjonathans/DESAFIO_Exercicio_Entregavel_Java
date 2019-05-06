package br.com.digitalhouse;

public class Professor {
    //Attributes
    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codDeProfessor;

    //Constructor
    public Professor(String nome, String sobrenome, Integer tempoDeCasa, Integer codDeProfessor) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setTempoDeCasa(tempoDeCasa);
        this.setCodDeProfessor(codDeProfessor);
    }

    //Empty Constructor
    public Professor() {
    }

    //Methods
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodDeProfessor() {
        return codDeProfessor;
    }

    public void setCodDeProfessor(Integer codDeProfessor) {
        this.codDeProfessor = codDeProfessor;
    }

    //toString
    @Override
    public String toString() {
        return "\nProfessor: \n" +
                "nome: " + nome +
                "\nsobrenome: " + sobrenome +
                "\ntempoDeCasa: " + tempoDeCasa +
                "\ncodDeProfessor: " + codDeProfessor ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codDeProfessor == null) ? 0 : codDeProfessor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Professor other = (Professor) obj;
        if (codDeProfessor == null) {
            if (other.codDeProfessor != null)
                return false;
        } else if (!codDeProfessor.equals(other.codDeProfessor))
            return false;
        return true;
    }
}
