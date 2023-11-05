public class Main {
    public static void main(String[] args) {
        int[] arraySizes = {10};

        for (int size : arraySizes) {
            ShellSort sorter = new ShellSort(size);
            sorter.PreencherVetorAleatoriamente();

            System.out.println("Array aelatório: ");
            sorter.DisplayVetor();

            sorter.ShellSort();

            System.out.println("\nArray arrumado: ");
            sorter.DisplayVetor();

            System.out.println();
            System.out.println(sorter.getIteracoes());
            System.out.println(sorter.getTrocas());
        }
    }
}