package passagemaviao;
public class ClasseEconomica extends CadeiraAviao{
    public ClasseEconomica(int fila, int poltrona, String nomePassageiro){
        int tamanhoFila = 30;
        int tamanhoPoltrona = 6;
        this.assentos = new boolean[30][6];
        AdicionaPassageiro(fila, poltrona, nomePassageiro, tamanhoFila, tamanhoPoltrona);
    }
}