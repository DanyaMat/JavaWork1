package ru.DanyaMat.work1.ex3;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 2, 1, 6, 121};
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < array.length; i++)
            sum1 += array[i];
        int i = 0;
        while(i != array.length){
            sum2 += array[i];
            i++;
        }
        i = 0;
        do{
            sum3 += array[i];
            i++;
        } while(i != array.length);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
