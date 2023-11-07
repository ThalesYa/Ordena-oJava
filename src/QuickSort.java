import java.util.Random;

public class QuickSort {
    private int[] vetor;
    private int trocas;
    private int iteracoes;

    public int[] getVetor() {
        return vetor;
    }

    public int getTrocas() {
        return trocas;
    }


    public int getIteracoes() {
        return iteracoes;
    }


    public void PreencherVetorAleatoriamente() {
        Random random = new Random();
        for (int i = 0; i < this.vetor.length; i++) {
            vetor[i] = random.nextInt(this.vetor.length) + 1;
        }
    }

    public QuickSort(int tamanho){
        this.vetor = new int[tamanho];
        this.trocas = 0;
        this.iteracoes = 0;

    }

    void quicksort(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
//Executa de forma recursiva a criacao e ordenacao das divisoes criadas pelos pivos
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
    }
//Cria pivo no codigo
    public int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                iteracoes++;
                i++;
            }while(vetor[i] < pivot);
            do{
                iteracoes++;
                j--;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            trocas++;
        }
    }

}
