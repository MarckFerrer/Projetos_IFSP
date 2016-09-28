package passagemaviao;

import javax.swing.JOptionPane;

public class PassagemAviao {
    public static void main(String[] args) {
        Object[] listaDeOpcoes = {"Classe Econômica", "Primeira Classe"};
        Object[] PrimeiraClasseFila = {1,2,3,4,5};
        Object[] PrimeiraClassePoltrona = {1,2,3,4};
        Object[] ClasseEconomicaFila = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        Object[] ClasseEconomicaPoltrona = {1,2,3,4,5,6};
        String resposta1 = (String)JOptionPane.showInputDialog(null, "Selecione a opção desejada abaixo :\n",
                "Escolha o que fazer",JOptionPane.PLAIN_MESSAGE, null, listaDeOpcoes, "");
        if(resposta1 == listaDeOpcoes[1]){
            int resposta2 = (int)JOptionPane.showInputDialog(null, "Selecione qual a fila da categoria " +resposta1+ ":\n",
                "Escolha o que fazer",JOptionPane.PLAIN_MESSAGE, null, PrimeiraClasseFila, "");
            int resposta3 = (int)JOptionPane.showInputDialog(null, "Selecione qual a fila da categoria " +resposta1+ ":\n",
                "Escolha o que fazer",JOptionPane.PLAIN_MESSAGE, null, PrimeiraClassePoltrona, "");
            String nomePassageiro = JOptionPane.showInputDialog("Dikgite o nome do cliente");
            
            ClasseEconomica cliente = new ClasseEconomica(resposta2, resposta3, nomePassageiro);
        }
        else{
            int resposta2 = (int)JOptionPane.showInputDialog(null, "Selecione qual a fila da categoria " +resposta1+ ":\n",
                "Escolha o que fazer",JOptionPane.PLAIN_MESSAGE, null, ClasseEconomicaFila, "");
            int resposta3 = (int)JOptionPane.showInputDialog(null, "Selecione qual a fila da categoria " +resposta1+ ":\n",
                "Escolha o que fazer",JOptionPane.PLAIN_MESSAGE, null, ClasseEconomicaPoltrona, "");            
            String nomePassageiro = JOptionPane.showInputDialog("Dikgite o nome do cliente");
            PrimeiraClasse cliente = new PrimeiraClasse(resposta2, resposta3, nomePassageiro);
        }
    }
}