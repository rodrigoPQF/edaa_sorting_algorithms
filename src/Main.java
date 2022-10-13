import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Insertionsort insertionsort = new Insertionsort();
        Mergingsort mergingsort = new Mergingsort();
        Random generator = new Random();
        for (int i =0; i < 20; i++){
            insertionsort.add(generator.nextInt(100));
            mergingsort.add(generator.nextInt(100));
        }

        long startTime = System.nanoTime();
        insertionsort.Sorting();
        long endTime = System.nanoTime();
        System.out.println("TEMPO DE EXECUÇÃO DO INSERÇÃO FOI DE ["+ (endTime - startTime)/ 1000+"] Milisegundos");

        int[] merging = mergingsort.arrayReturn();
        startTime = System.nanoTime();
        mergingsort.showValue();
        mergingsort.Sorting(merging, merging.length);
        endTime = System.nanoTime();
        System.out.println("TEMPO DE EXECUÇÃO DO MERGE FOI DE ["+ (endTime - startTime)/ 1000+"] Milisegundos");

    }
}