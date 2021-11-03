package 稀疏数组.src;

public class sparsearr {
    public static void main(String[] args) {
        int [][]arr=new int[11][11];
        arr[1][2]=1;
        arr[2][3]=2;
        arr[2][4]=2;

        for (int[] row : arr) {
            for (int col: row) {
                System.out.printf("%2d",col);
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
if (arr[i][j]!=0){
    sum++; }
            }
        }
        System.out.println(sum);
int sparsearr[][]=new int[sum+1][3];
sparsearr[0][0]=11;
sparsearr[0][1]=11;
sparsearr[0][2]=sum;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]!=0){
                    count++;
                    sparsearr[count][0]=i;
                    sparsearr[count][1]=j;
                    sparsearr[count][2]=arr[i][j];
                }
            }
        }
        for (int i = 0; i < sparsearr.length; i++) {
            System.out.printf("%2d\t%2d\t%2d\n",sparsearr[i][0],sparsearr[i][1],sparsearr[i][2]);
        }
        System.out.println();

        System.out.println("稀疏数组转二维数组");       



       int a= sparsearr[0][0];
       int b= sparsearr[0][1];
       int c= sparsearr[0][2];
       int arr2 [][]=new int[a][b];
        for (int i = 1; i < sparsearr.length; i++) {
             arr2[sparsearr[i][0]][sparsearr[i][1]]=sparsearr[i][2];
        }
        for (int[] row2 : arr2) {
            for (int col2 : row2) {
                System.out.printf("%2d",col2);
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
    }
}
