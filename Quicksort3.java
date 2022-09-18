public class Quicksort3 {
    static void quickSort3(int a[], int b, int c) {
// b adalah index bawah, c adalah index atas untuk partisi

        //inout data = O(1)
        int i = b, j = c, h, ke=0;
        int pivot = a[b];

        //looping do while = O(n)
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

        if (b < j) quickSort3(a, b, j);
        if (i < c) quickSort3(a, i, c);

    }

    public static void main(String[] args) {
        int tabInt[] = {3, 4, 2, 9, 10, 5, 8, 6, 1, 7,14,15,63,23,41,17,19,11,19,20,21,26,27,28,13};
        int i, n = tabInt.length;
        System.out.println("Jumlah data : " + n);
        System.out.print("data sebelum diurutkan\n");
        for (i = 0; i < n; i++) {
            System.out.print(tabInt[i] + " ,");
        }
        System.out.print("\n\n");
        quickSort3(tabInt, 0, n - 1);
        System.out.print("\ndata setelah diurutkan dengan quick sort\n");
        for (i = 0; i < n; i++) {
            System.out.print(tabInt[i] + " , ");
        }
    }
}