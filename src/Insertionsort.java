public class Insertionsort {



    int[] arrayNum = new int[20];
    int index = 0;


    public Insertionsort(){

    }
    public void add(int num){
        arrayNum[index] = num;
        index++;

    }
    public void Sorting(){
        int key, i, j;
        for(i=1; i < arrayNum.length; i++){
            key = arrayNum[i];
            for (j = i-1; (j >=0) && arrayNum[j] > key; j--){
                arrayNum[j+1] = arrayNum[j];
            }
            arrayNum[j+1] = key;
            System.out.println("-------- Iteração ------ ["+i+"]");
            showValue();
        }

    }
    public void showValue(){
        for(int i=0; i < arrayNum.length; i++){
            System.out.println(arrayNum[i]+"  ");
        }
        System.out.println("");
    }
}
