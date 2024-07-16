import java.util.Arrays;
import java.util.TreeMap;

public class Question1 {
    public static void main(String[] args) {
        int arr[] = new int[]{13,-3,-5,-100,-1};
//        int arr2[] = new int[]{1,2,3,4,5,6,7,8,9};
        int n = arr.length;

        sort(arr,n);


    }

    public static void sort(int arr[], int n) {
        int half = n/2;
        int oddArr[] = new int[(n % 2 == 1) ? (half + 1) : half];
        int o=0,e=0;
        int evenArr[] = new int[half];


        for (int i = 0; i < n; i++) {
            if (i%2==0)oddArr[o++]= arr[i];
            else evenArr[e++] = arr[i];

        }




       oddArr = bubbleSort(oddArr);
      evenArr =  bubbleSort(evenArr);



        printArray(oddArr);
        System.out.println();
        printArray(evenArr);
         System.out.println();
        int j=0;
        for (int i = 0; i < n; i++) {
            if (i%2==0)arr[i] = oddArr[--o];
            else arr[i] = evenArr[j++];
        }

        printArray(arr);



    }

    public static  int [] bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int swap = 0;

            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }


    public static void printArray(int arr[]) {
        for(int el:arr) System.out.print(el+" ");
    }
}
