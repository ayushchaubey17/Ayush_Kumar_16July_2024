public class Quesyion3 {
    public static void main(String[] args) {
        String arr[][] = {
                {"pari", "karikalan"},
                {"udhiran", "sendhan"},
                {"sendhan","Arulmozhi"},
                {"karikalan","sendhan"}

        };

        String str = "Arulmozh";


        findGrandChilldren(arr,str);



    }

    public static void findGrandChilldren(String arr[][],String str) {
        int n = arr.length;
        String []son = new String[n];
        String []father = new String[n];
        for (int i = 0; i <n ; i++) {
          son[i]= arr[i][0];
          father[i] = arr[i][1];

        }

        printArray(son);
        System.out.println();
        printArray(father);


        System.out.println();
        int ind =-1;
        for(int i=0;i<n;i++){
            if(str.equals(father[i]))ind=i;
        }

        if(ind==-1) {
            System.out.println(0);
            return;
        }

        String fat = son[ind];
        int c=0;
        for (int i = 0; i <n ; i++) {
            if(fat.equals(father[i]))c++;
        }

        System.out.println(c);

    }


    public static void printArray(String str[]) {
        for(String el: str) System.out.print(el+" ");
    }
}
