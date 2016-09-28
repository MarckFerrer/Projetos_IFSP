package passagemaviao;
public class PrimeiraClasse extends CadeiraAviao{
    public PrimeiraClasse(int fila, int poltrona, String nomePassageiro){
        int tamanhoFila = 5;
        int tamanhoPoltrona = 4;
        AdicionaPassageiro(fila, poltrona, nomePassageiro, tamanhoFila, tamanhoPoltrona);
        this.assentos = new boolean[5][4];
    }
}