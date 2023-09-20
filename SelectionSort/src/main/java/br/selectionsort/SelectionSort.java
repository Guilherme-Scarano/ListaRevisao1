package br.selectionsort;


public class SelectionSort {

    public static void ssort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Comparação de caracteres usando o operador de comparação
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Troca os caracteres nas posições i e minIndex
            char temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'z', 'b', 'r', 'a', 'f'};

        System.out.print("Vetor antes da ordenação: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }

        ssort(arr);

        System.out.print("\nVetor depois da ordenação: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
