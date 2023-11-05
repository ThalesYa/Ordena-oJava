import java.util.Random;

public class SelectionSort {
    private int[] vetor;
    private int tamanho;
    private int trocas;
    private int iteracoes;

    public SelectionSort(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new int[tamanho];
        this.trocas = 0;
        this.iteracoes = 0;
    }

    public void PreencherVetorAleatoriamente() {
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(tamanho) + 1;
        }
    }

    public void SelectionSort() {
        int n = tamanho;

        for (int i = 0; i < n - 1; i++) {
            int menorIndex = i;

            for (int j = i + 1; j < n; j++) {
                iteracoes++;
                if (vetor[j] < vetor[menorIndex]) {
                    menorIndex = j;
                }
            }

            if (menorIndex != i) {
                int vetTemp = vetor[i];
                vetor[i] = vetor[menorIndex];
                vetor[menorIndex] = vetTemp;
                trocas++;
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
