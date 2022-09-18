public class Quicksort {

        static void quickSort (int a[], int b, int c){
            //  b adalah index bawah, c adalah index atas untuk partisi
            int i=b, j=c, h;
            int pivot=a[b];

            System.out.println("INI I : "+ i);
            System.out.println("INI B : "+b);
            System.out.println("INI J : "+j);
            System.out.println("INI C : "+c);
            do{

                for (int k = 0; k < a.length; k++) {
                    System.out.print(a[k] + "\t");
                }

                System.out.println("\nCek While");
                System.out.println("\nThis is a[i]<pivot "+(a[i]<pivot));
                System.out.println("This is i "+i);
                System.out.println("This is a[i] "+a[i]);
                System.out.println("This is pivot in a[i] "+pivot);
                while (a[i]<pivot) i++;
                System.out.println("\nThis is a[i]<pivot "+(a[i]<pivot));
                System.out.println("This is i "+i);
                System.out.println("This is a[i] "+a[i]);
                System.out.println("This is pivot in a[i] "+pivot);

                System.out.println("\nThis is a[j] "+a[j]);
                System.out.println("This is j "+j);
                System.out.println("This is pivot in a[j] "+pivot);
                System.out.println("This is a[j]>pivot "+(a[j]>pivot));
                while (a[j]>pivot) j--;
                System.out.println("\nThis is a[j]>pivot "+(a[j]>pivot));
                System.out.println("This is j "+j);
                System.out.println("This is a[j] "+a[j]);
                System.out.println("This is pivot in a[j] "+pivot);

                System.out.println("INI I : "+ i);
                System.out.println("INI B : "+b);
                System.out.println("INI J : "+j);
                System.out.println("INI C : "+c);


                if (i<=j)
                {
                    h=a[i]; a[i]=a[j]; a[j]=h;

                    System.out.println("Cek TabInt");
                    for (int k = 0; k < a.length; k++) {
                        System.out.print(a[k] + "\t");
                    }

                    System.out.println("\nCek if");
                    System.out.println("INI H : "+h);
                    System.out.println("INI a[i] : "+(a[i]));
                    System.out.println("INI a[j] : "+(a[j]));

                    i++; j--;

                    System.out.println("INI I : "+ i);
                    System.out.println("INI J : "+j);

                    for (int k = 0; k < a.length; k++) {
                        System.out.print(a[k] + "\t");
                    }
                    System.out.println("Cek 1");

                }
                for (int k = 0; k < a.length; k++) {
                    System.out.print(a[k] + "\t");
                }
                System.out.println("Cek 2");
            } while (i<=j);

            if (b<j) quickSort(a, b, j);
            if (i<c) quickSort(a, i, c);

        }


        public static void main(String[] args) {
            int tabInt[]={3,4,2,9,10};
            int i,n = tabInt.length;
            System.out.print("data sebelum di urutkan\n");

            for(i=0;i<n;i++){
                System.out.print(tabInt[i]+ "  ,");
            }
            System.out.println();
            System.out.print("\n");
            quickSort(tabInt,0,n-1);
            System.out.print("\nsetelah di urutkan dengan quick sort\n");

            for(i=0;i<n;i++){
                System.out.print(tabInt[i]+" , ");
            }

        }

    }

