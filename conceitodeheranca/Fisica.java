package conceitodeheranca;

public class Fisica extends Pessoa{

    public String  cpf, rg;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pessoa: Nome = "+nome+" Situação = "+situacaoPessoa+" CPF = "+cpf+" RG = "+rg;
    }
    
}
