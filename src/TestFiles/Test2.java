package TestFiles;

import java.util.Arrays;

class Sort{
    private int[] a;
    public Sort(int[] a){
        this.a = a;
    }
    public int[] bubbleSort(){
        int key = a[0];
        for (int j = a.length - 1 ; j >= 0 ; j--){
            for (int i = 0 ; i < a.length - 1 ; i++){
                if (a[i]>a[i+1]){
                    swap(a, i, i+1);
                }
            }
        }
        return a;
    }
    public int[] selectionSort(){
        int largest = 0;
        for (int j = a.length - 1; j >= 0 ; j--){
            for (int i = 0 ; i <= j ; i++){
                if (a[i] > a[largest]){
                    largest = i;
                }
            }
            swap(a, j, largest);
            largest = 0;
        }
        return a;
    }
    public void swap(int[] array, int i , int j){
        if(i==j){
            return;
        }
        int key = array[i];
        array[i] = array[j];
        array[j] = key;
    }
}
public class Test2 {
    public static void main(String[] args) {
        int[] a = new int[] {20, 35, -15, 7, 55, 1, -22};
        Sort sort = new Sort(a);
        sort.selectionSort();
        System.out.println(Arrays.toString(a));
    }
}