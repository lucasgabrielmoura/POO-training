package conceitodeheranca;

import javax.swing.JOptionPane;

public class Pessoas {
    public static void main(String[] args){

        //Aplicando Herança com pessoa Jurídica e Física tendo atributos diferentes
        //mas que bebem das propriedade básicas da Pessoa.

        Juridica pesJ = new Juridica();
        pesJ.nome = "Jordi";
        pesJ.cnpj = "2992929";
        pesJ.inscriEstadual = "192939123";
        pesJ.situacaoPessoa = "I";

        Fisica pesF = new Fisica();
        pesF.nome = "Lucas";
        pesF.cpf = "0000000000";
        pesF.rg = "92929929";
        pesF.situacaoPessoa = "A";

        JOptionPane.showMessageDialog(null, pesF.toString(), "Cliente Física", 1);
        JOptionPane.showMessageDialog(null, pesJ.toString(), "Cliente Jurídico", 1);
    }
}
