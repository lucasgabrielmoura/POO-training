package conceitodeclasseeencapsulamento;

public class MPessoaTravado {

    private String nome;
    private int idade;
    private char sexo;

    public String toString(){
        return "Pessoa: [Nome= " + nome + ", Idade= " + idade + ", Sexo= " + sexo + "]";
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

}
