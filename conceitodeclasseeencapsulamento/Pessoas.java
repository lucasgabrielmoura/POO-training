package conceitodeclasseeencapsulamento;

import javax.swing.JOptionPane;

public class Pessoas {
    
    public static void main(String[] args){
        //Objeto de classe 
        MoldePessoa pes1 = new MoldePessoa();
        //Atributos da classe
        pes1.idade = 19;
        pes1.nome = "Lucas";
        pes1.sexo = 'M';

        //Método de classe
        pes1.mostraDados(pes1.nome, pes1.idade, pes1.sexo);

        //Objeto classe travado
        MPessoaTravado pes2 = new MPessoaTravado();
        pes2.setIdade(12);
        pes2.setNome("Lucas");
        pes2.setSexo('M');
        JOptionPane.showMessageDialog(null, pes2.toString(), "Cliente", 1);
    }

}
