public class Quicksort4 {
    static void quickSort4(int a[], int b, int c) {

        int i = b, j = c, h, ke=0;
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
                    System.out.print( a[k] + "\t");
                }
                System.out.println();
            }
        } while (i <= j);

        if (b < j) quickSort4(a, b, j);
        if (i < c) quickSort4(a, i, c);

    }

    public static void main(String[] args) {
        int tabInt[] = {3, 4, 2, 9, 10, 5, 8, 6, 1, 7,14,15,63,23,41,17,19,11,19,20,21,26,27,28,13,32,44,51,62,34,76,12,59,93,27,51,63,83,24,17,34,5,99,85,82,58,38,29,60,57};
        int i, n = tabInt.length;
        System.out.println("Jumlah data : " + n);
        System.out.print("data sebelum diurutkan\n");
        for (i = 0; i < n; i++) {
            System.out.print(tabInt[i] + " ,");
        }
        System.out.print("\n\n");
        quickSort4(tabInt, 0, n - 1);
        System.out.print("\ndata setelah diurutkan dengan quick sort\n");
        for (i = 0; i < n; i++) {
            System.out.print(tabInt[i] + " , ");
        }
    }
}