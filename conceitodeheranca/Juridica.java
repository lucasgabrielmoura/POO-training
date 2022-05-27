package conceitodeheranca;

public class Juridica extends Pessoa{
    public String cnpj, inscriEstadual;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pessoa: Nome = "+nome+" Situação = "+situacaoPessoa+" CNPJ = "+cnpj+" Inscrição Estadual = "+inscriEstadual;
    }
}
