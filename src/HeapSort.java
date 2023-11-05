import java.util.Random;

public class HeapSort {
    private int[] vetor;
    private int tamanho;
    private int trocas;
    private int iteracoes;

    //Problemas
    //As iterações estão dando o mesmo valor do arrray SEMPRE

    public HeapSort(int tamanho) {
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

    public void HeapSort() {
        HeapMaximo();
        int n = tamanho - 1;

        for (int i = n; i >= 0; i--) {
            iteracoes++;
            if (i == 0) {
                break;
            }
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
            trocas++;

            maxHeapify(0, i);
        }
    }

    private void HeapMaximo() {
        int n = tamanho;

        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(i, n);
        }
    }

    private void maxHeapify(int i, int n) {
        int FilhoEsquerdo = 2 * i + 1;
        int FilhoDireito = 2 * i + 2;
        int largest = i;

        if (FilhoEsquerdo < n && vetor[FilhoEsquerdo] > vetor[largest]) {
            largest = FilhoEsquerdo;
        }

        if (FilhoDireito < n && vetor[FilhoDireito] > vetor[largest]) {
            largest = FilhoDireito;
        }

        if (largest != i) {
            int swap = vetor[i];
            vetor[i] = vetor[largest];
            vetor[largest] = swap;
            trocas++;

            maxHeapify(largest, n);
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