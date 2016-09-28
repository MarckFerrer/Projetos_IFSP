package passagemaviao;

import javax.swing.JOptionPane;

public class CadeiraAviao {
    boolean assentos[][];
    float preco[][];
    String passageiro[][];

    public boolean[][] getAssentos() {
        return assentos;
    }

    public float[][] getPreco() {
        return preco;
    }

    public String[][] getPassageiro() {
        return passageiro;
    }

    public void setAssentos(int fila, int cadeira) {
        this.assentos[fila][cadeira] = true;
    }

    public void setPreco(float[][] preco) {
        this.preco = preco;
    }

    public void setPassageiro(int fila, int cadeira, String nomePassageiro) {
        this.passageiro[fila][cadeira] = nomePassageiro;
    }
    
    public void AdicionaPassageiro(int fila, int cadeira, String nome, int tamanhoFila, int tamanhoPoltrona){
        if(this.assentos[fila][cadeira] == false){
            this.assentos = new boolean[tamanhoFila][tamanhoPoltrona];
            setAssentos(fila, cadeira);
            setPassageiro(fila, cadeira, nome);
            JOptionPane.showMessageDialog(null, "O passageiro "+nome+" foi adicionado!");
        }
        else{
            JOptionPane.showMessageDialog(null, "A cadeira "+cadeira+" da fileira "+fila+" não está disponível");
        }
    }
    
    public void MostraAssento(){
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[0].length; j++) {
                System.out.println("|"+assentos[i][j]+"|");
            }
            System.out.println("");
        }
    }
}