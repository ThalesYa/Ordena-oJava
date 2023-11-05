import java.util.Random;

public class BubbleSort {
    private int[] vetor;
    private int tamanho;
    private int trocas;
    private int iteracoes;

    public BubbleSort(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new int[tamanho];
        this.trocas = 0;
        this.iteracoes = 0;
    }

    public void PreencherVetorAleatoriamente() {
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(tamanho) + 1;
        }
    }

    public void BubbleSort() {
        int n = tamanho - 1;
        boolean ordenado;

        for (int i = 0; i < n; i++) {
            ordenado = false;
            for (int j = 0; j < n - i; j++) {
                iteracoes++;
                if (vetor[j] > vetor[j + 1]) {
                    int vetTemp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = vetTemp;
                    ordenado = true;
                    trocas++;
                }
            }
            if (!ordenado) {
                break;
            }
        }
    }

    public void DisplayVetor() {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int getTrocas() {
        return trocas;
    }

    public int getIteracoes() {
        return iteracoes;
    }
}