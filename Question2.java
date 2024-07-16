public class Question2 {
    public static void main(String[] args) {
        int [][] mat= new int[5][5];



        System.out.println();
        printPattern(mat);
        System.out.println();
        System.out.println();
        System.out.println();

        printMat(mat);
    }

    public static void printPattern(int[][] arr) {

        int row= arr.length;
        int col = arr[0].length;

        int startRow = 0;
        int startCol = col-1;
        boolean goDown = true;
        boolean goLeft = false;
        boolean goUpwardLeft = false;
        boolean goDownWardRight = false;
        boolean goRightDown=false;

        int count =0;
        for (; ; ) {
              count++;
            if(count==row*col)break;
        if (goDown ){
                if(startRow == row-1){
                    goDown=false;
                    goLeft=true;
                    continue;
                }
                System.out.print(arr[startRow++][startCol]+" ");
                System.out.print(arr[startRow--][startCol--]+" ");

                if(startCol== -1){
                    startCol++;
                    startRow++;
                    goDown= false;
                    goDownWardRight=true;
                    break ;
//

                }

                goDown= false;
                goUpwardLeft =true;
                continue;
            }

           else if (goLeft){
//
                System.out.print(arr[startRow][startCol--]+" ");
                System.out.print(arr[startRow++][startCol++]+" ");
                System.out.println();
                goLeft= false;
                if(startRow>=row-1){
                    startRow--;startCol--;
                    goUpwardLeft=true;
                    goLeft=false;
                    continue;
                }

                goDownWardRight=true;
                continue;
            }


           else if(goUpwardLeft){
                while (startRow!=0) {
                    System.out.print(arr[startRow--][startCol--] +" ");
                    if (startCol == -1) {
                        startCol++;startRow++;
                        goUpwardLeft = false;
                        goDown = true;
                        break;
                    }
                }
                System.out.println();

                goUpwardLeft = false;
                goLeft = true;continue;


            }

           else if(goDownWardRight){

                while (startCol != col-1 && startCol<row){

                    System.out.print(arr[startRow++][startCol++]+" ");
                }

                goDownWardRight = !goDownWardRight;

                goDown = true;
                continue;


            }

        }


        System.out.println();
        int st = row/2+1;
        int cl =1;

        int c=0;
        while (st< row){
            System.out.print(arr[st][cl]+" ");

            st++;cl++;

            if(st==row && c==0){
                st--;cl-=2;c++;
            }
        }
        System.out.println();
        int lastCol=col-2;
        while (lastCol < col) {
            System.out.print(arr[lastCol++][0]+" ");
        }



    }
    public  static  void  printMat(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }



}
