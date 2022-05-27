package conceitodeclasseeencapsulamento;

public class MoldePessoa{
    public String nome;
    public int idade;
    public char sexo;

    public void mostraDados(String pNome, int pIdade, char pSexo) {
        System.out.println("<---------------------------->");
        System.out.println("Nome: " + pNome);
        System.out.println("Idade: " + pIdade);
        System.out.println("Sexo: " + pSexo);
        System.out.println("<---------------------------->");
    }
}