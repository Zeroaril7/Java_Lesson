public class Quicksort10 {
    static void quickSort10(int a[], int b, int c) {

        int i = b, j = c, h;
        int pivot = a[b];

        do {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                h = a[i];
                a[i] = a[j];
                a[j] = h;
                i++;
                j--;
                for (int k = 0; k < a.length; k++) {
                    System.out.print(a[k] + "\t");
                }
                System.out.println();
            }
        } while (i <= j);
        if (b < j) quickSort10(a, b, j);
        if (i < c) quickSort10(a, i, c);
    }

    public static void main(String[] args) {
        int tabInt[] = {5, 4, 2, 7, 10, 3, 8, 6, 1, 9};
        int i, n = tabInt.length;
        System.out.println("Jumlah data : " + n);
        System.out.print("data sebelum diurutkan\n");
        for (i = 0; i < n; i++) {
            System.out.print(tabInt[i] + " ,");
        }
        System.out.print("\n\n");
        quickSort10(tabInt, 0, n - 1);
        System.out.print("\ndata setelah diurutkan dengan quick sort\n");
        for (i = 0; i < n; i++) {
            System.out.print(tabInt[i] + " , ");
        }
    }
}