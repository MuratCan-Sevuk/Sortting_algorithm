public class Main {
    static int Max(int[] n){
        int m=n[0];
        for (int i = 1; i < n.length; i++) {
            if (m<n[i]) m=n[i];
        }
        return m;
    }
    static int Min(int[] n){
        int m=n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i]<m) m=n[i];
        }
        return m;
    }
    static int[] BubbleSort(int[] n) {
        for (int j = n.length; 0 < j; j--) {
            for (int i = 1; i < n.length; i++) {
                int cur;
                if (n[i - 1] > n[i]) {
                    cur = n[i];
                    n[i] = n[i - 1];
                    n[i - 1] = cur;
                }
            }
        }
        return n;
    }
    static int[] SelectionSort(int[] n) {   //2 li bir şekilde elemanları karşılaştırır 1. elemandan başlar min elamını aklında tutar ve min elemanla başdaki elamnı yerdeğiştirir sonra 2. den başlar mini ikinci ile yer değiştirir, bunu dizi soununa kadar yapar.
        for (int i = 0; i < n.length - 1; i++) {
            int minInd = i;
            int min = n[minInd];
            for (int j = i + 1; j < n.length; j++) {
                if (n[j] < min) {
                    min = n[j];
                    minInd = j;
                }
            }
            int tmp;
            tmp = n[i];
            n[i] = n[minInd];
            n[minInd] = tmp;
        }
        return n;
    }
    static int[] InsertionSort(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            int j = i;
            while (-1 < j) {
                if (n[j] > n[j + 1]) {
                    int cur = n[j + 1];
                    n[j + 1] = n[j];
                    n[j] = cur;
                }
                j--;
            }
        }
        return n;
    }
    static int[] MaxHeap(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int j = i;
            while (-1 < j) {
                if (n.length > (2 * j + 1)) {
                    if (n[j] < n[2 * j + 1]) {
                        int cur = n[j];
                        n[j] = n[2 * j + 1];
                        n[2 * j + 1] = cur;
                    } else if (n[j] < n[2 * j + 2]) {
                        int cur = n[j];
                        n[j] = n[2 * j + 2];
                        n[2 * j + 2] = cur;
                    }
                }
                j--;
            }

        }
        return n;
    }
    static int [] MinHeap(int[] n){
        for (int i = 0; i < n.length; i++) {
            int j = i;
            while (-1 < j) {
                if (n.length > (2 * j + 1)) {
                    if (n[j] > n[2 * j + 1]) {
                        int cur = n[j];
                        n[j] = n[2 * j + 1];
                        n[2 * j + 1] = cur;
                    } else if (n[j] > n[2 * j + 2]) {
                        int cur = n[j];
                        n[j] = n[2 * j + 2];
                        n[2 * j + 2] = cur;
                    }
                }
                j--;
            }

        }
        return n;

    }
    static int[] QuickSort(int[] n,int it,int is,int p){
        if(is>p) {int temp=n[it];
            n[it]=n[p];
            n[p]=temp;
            return n;}
        if (n[p]>=n[is]) {it++;
            if (it+2>=is){int temp=n[it];
                n[it]=n[is];
                n[is]=temp;
            }
            return QuickSort(n,it,is+1,p);
        }
        if (n[p]<n[is]) return QuickSort(n,it,is+1,p);
        return n;
    }
    public static void main(String[] args) {
        int[] dizi = {3,2,5,0,1,8,7,6,9,4};
        int[] ndizi = QuickSort(dizi,-1,0, dizi.length-1);
        for (int i = 0; i < ndizi.length; i++) {
            System.out.print(ndizi[i]+" ");
        }
    }
}