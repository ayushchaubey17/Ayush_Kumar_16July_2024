public class NearestPrime {
    public static void main(String[] args) {
        int arr[] = {10, 12, 13, 23, 35};
        nearestPrime(arr);

    }
    public  static  void  nearestPrime(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            int num = arr[i];

            while (count==0){

                if (primeChecK(num)) {
                    count++;
                    break;
                }

            }


        }

    }


    public  static  boolean primeChecK(int a){
        if(a==1)return false;
        if(a==2) return  true;

        for (int i = 3; i < a; i++) {
            if(a%i==0)return true;

        }
        return false;

    }
}
