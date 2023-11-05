import org.junit.Test;

public class TesteDeTempo {

    @Test
    public void testeBubbleSortPerformance()
    {
        int[] tamanhos = {50, 500, 1000, 5000, 10000}; // Tamanhos pra testar

        for (int tamanho : tamanhos) {
            long tempoTotalExecucao = 0;
            long totalTrocas = 0;
            long totalIteracoes = 0;

            System.out.println("=============================");
            System.out.println("BUBBLESORT");
            System.out.println("Tamanho do Vetor: " + tamanho);
            System.out.println("Tempos de Execução Individual:");

            for (int i = 0; i < 5; i++) { // Execute o teste 5 vezes para cada tamanho
                BubbleSort testeBubble = new BubbleSort(tamanho);
                testeBubble.PreencherVetorAleatoriamente();

                long startTime = System.nanoTime(); // Marca o início da execução
                testeBubble.BubbleSort();
                long endTime = System.nanoTime(); // Marca o fim da execução

                long executionTime = endTime - startTime; // Calcula o tempo de execução em nanossegundos
                System.out.println("Execução " + (i + 1) + ": " + executionTime + " ns");

                long iteracoes = testeBubble.getIteracoes();
                long trocas = testeBubble.getTrocas();

                totalIteracoes += iteracoes;
                totalTrocas += trocas;
                tempoTotalExecucao += executionTime;
            }

            long tempoMedioExecucao = tempoTotalExecucao / 5; // Calcula o tempo médio de execução
            long mediaIteracoes = totalIteracoes / 5; // Calcula a média das iterações
            long mediaTrocas = totalTrocas / 5; // Calcula a média das trocas

            System.out.println("Média por Execução: " + tempoMedioExecucao + " ns");
            System.out.println("Média das iterações: " + mediaIteracoes);
            System.out.println("Média das trocas: " + mediaTrocas);
            System.out.println("=============================");
        }
    }

    @Test
    public void testeHeapSortPerformance()
    {
        int[] tamanhos = {50, 500, 1000, 5000, 10000}; // Tamanhos pra testar

        for (int tamanho : tamanhos) {
            long tempoTotalExecucao = 0;
            long totalTrocas = 0;
            long totalIteracoes = 0;

            System.out.println("=============================");
            System.out.println("HEAPSORT");
            System.out.println("Tamanho do Vetor: " + tamanho);
            System.out.println("Tempos de Execução Individual:");

            for (int i = 0; i < 5; i++) { // Execute o teste 5 vezes para cada tamanho
                HeapSort testeheapSort = new HeapSort(tamanho);
                testeheapSort.PreencherVetorAleatoriamente();

                long startTime = System.nanoTime(); // Marca o início da execução
                testeheapSort.HeapSort();
                long endTime = System.nanoTime(); // Marca o fim da execução

                long executionTime = endTime - startTime; // Calcula o tempo de execução em nanossegundos
                System.out.println("Execução " + (i + 1) + ": " + executionTime + " ns");

                long iteracoes = testeheapSort.getIteracoes();
                long trocas = testeheapSort.getTrocas();

                totalIteracoes += iteracoes;
                totalTrocas += trocas;
                tempoTotalExecucao += executionTime;
            }

            long tempoMedioExecucao = tempoTotalExecucao / 5; // Calcula o tempo médio de execução
            long mediaIteracoes = totalIteracoes / 5; // Calcula a média das iterações
            long mediaTrocas = totalTrocas / 5; // Calcula a média das trocas

            System.out.println("Média por Execução: " + tempoMedioExecucao + " ns");
            System.out.println("Média das iterações: " + mediaIteracoes);
            System.out.println("Média das trocas: " + mediaTrocas);
            System.out.println("=============================");
        }
    }

    @Test
    public void testeSelectionSortPerformance()
    {
        int[] tamanhos = {50, 500, 1000, 5000, 10000}; // Tamanhos pra testar

        for (int tamanho : tamanhos) {
            long tempoTotalExecucao = 0;
            long totalTrocas = 0;
            long totalIteracoes = 0;

            System.out.println("=============================");
            System.out.println("SELECTIONSORT");
            System.out.println("Tamanho do Vetor: " + tamanho);
            System.out.println("Tempos de Execução Individual:");

            for (int i = 0; i < 5; i++) { // Execute o teste 5 vezes para cada tamanho
                SelectionSort testeSelectionSort = new SelectionSort(tamanho);
                testeSelectionSort.PreencherVetorAleatoriamente();

                long startTime = System.nanoTime(); // Marca o início da execução
                testeSelectionSort.SelectionSort();
                long endTime = System.nanoTime(); // Marca o fim da execução

                long executionTime = endTime - startTime; // Calcula o tempo de execução em nanossegundos
                System.out.println("Execução " + (i + 1) + ": " + executionTime + " ns");

                long iteracoes = testeSelectionSort.getIteracoes();
                long trocas = testeSelectionSort.getTrocas();

                totalIteracoes += iteracoes;
                totalTrocas += trocas;
                tempoTotalExecucao += executionTime;
            }

            long tempoMedioExecucao = tempoTotalExecucao / 5; // Calcula o tempo médio de execução
            long mediaIteracoes = totalIteracoes / 5; // Calcula a média das iterações
            long mediaTrocas = totalTrocas / 5; // Calcula a média das trocas

            System.out.println("Média por Execução: " + tempoMedioExecucao + " ns");
            System.out.println("Média das iterações: " + mediaIteracoes);
            System.out.println("Média das trocas: " + mediaTrocas);
            System.out.println("=============================");
        }
    }
    @Test
    public void testeShellSortPerformance()
    {
        int[] tamanhos = {50, 500, 1000, 5000, 10000}; // Tamanhos pra testar

        for (int tamanho : tamanhos) {
            long tempoTotalExecucao = 0;
            long totalTrocas = 0;
            long totalIteracoes = 0;

            System.out.println("=============================");
            System.out.println("SHELLSORT");
            System.out.println("Tamanho do Vetor: " + tamanho);
            System.out.println("Tempos de Execução Individual:");

            for (int i = 0; i < 5; i++) { // Execute o teste 5 vezes para cada tamanho
                ShellSort testeShellSort = new ShellSort(tamanho);
                testeShellSort.PreencherVetorAleatoriamente();

                long startTime = System.nanoTime(); // Marca o início da execução
                testeShellSort.ShellSort();
                long endTime = System.nanoTime(); // Marca o fim da execução

                long executionTime = endTime - startTime; // Calcula o tempo de execução em nanossegundos
                System.out.println("Execução " + (i + 1) + ": " + executionTime + " ns");

                long iteracoes = testeShellSort.getIteracoes();
                long trocas = testeShellSort.getTrocas();

                totalIteracoes += iteracoes;
                totalTrocas += trocas;
                tempoTotalExecucao += executionTime;
            }

            long tempoMedioExecucao = tempoTotalExecucao / 5; // Calcula o tempo médio de execução
            long mediaIteracoes = totalIteracoes / 5; // Calcula a média das iterações
            long mediaTrocas = totalTrocas / 5; // Calcula a média das trocas

            System.out.println("Média por Execução: " + tempoMedioExecucao + " ns");
            System.out.println("Média das iterações: " + mediaIteracoes);
            System.out.println("Média das trocas: " + mediaTrocas);
            System.out.println("=============================");
        }
    }

}