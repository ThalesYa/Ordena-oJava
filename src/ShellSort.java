import java.util.Random;

public class ShellSort {
    private int[] vetor;
    private int tamanho;
    private int trocas;
    private int iteracoes;

    public ShellSort(int tamanho) {
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

    public void ShellSort() {
        int n = tamanho;
        int h = 1;

        while (h < n / 3) {
            h = 3 * h + 1; // Sequência de incremento de Knuth
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && vetor[j] < vetor[j - h]; j -= h) {
                    iteracoes++;
                    int temp = vetor[j];
                    vetor[j] = vetor[j - h];
                    vetor[j - h] = temp;
                    trocas++;
                }
            }
            h /= 3;
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