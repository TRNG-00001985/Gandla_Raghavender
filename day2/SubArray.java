import java.util.Arrays;
public class SubArray {
    public static void main(String args[]){
    int[] array1={1,2,3,4,5,6};
    int[] subarr=Arrays.copyOfRange(array1,1,3);
    System.out.println(Arrays.toString(subarr));
    }
}
