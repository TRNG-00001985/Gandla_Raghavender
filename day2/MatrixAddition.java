import java.util.Arrays;
public class MatrixAddition
{
    public static void main(String[] args) {
        int[][] a={{1,2},{3,4}};
        int[][] b={{5,6},{7,8}};
        int[][] c=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println(Arrays.toString(c[0])+""+Arrays.toString(c[1]));
    }
}