public class Mergingsort {
    int[] arrayNum = new int[20];
    int index = 0;


    public Mergingsort(){

    }
    public void add(int num){
        arrayNum[index] = num;
        index++;

    }

    public int[] arrayReturn(){
        return arrayNum;
    }

    public void Sorting(int[] a, int n){

        if (n < 2){
            return;
        }
        int mid = n /2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i=0; i < mid; i ++){
            l[i] = a[i];
        }
        for (int i= mid; i < n; i++){
            r[i - mid] = a[i];
        }
        Sorting(l, mid);
        Sorting(r, n - mid);
        merge(a, l, r, mid, n - mid);


    }
    public void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public void showValue(){
        for(int i=0; i < arrayNum.length; i++){
            System.out.println(arrayNum[i]+"  ");
        }
        System.out.println("");
    }

}
