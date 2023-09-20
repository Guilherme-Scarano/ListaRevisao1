package br.bubblesortdecrescente;

public class BubbleSortDecrescente {

  public static void bsort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                // Comparação em ordem decrescente (>) em vez de crescente (<)
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Vetor antes da ordenação: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bsort(arr);

        System.out.print("\nVetor depois da ordenação decrescente: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
