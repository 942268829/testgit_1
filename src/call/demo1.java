package call;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
       int arr[] =new int []{23,42,12,8};
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++)
       {
        //System.out.println("第"+i+"个元素是"+arr[i]);
        System.out.println(arr[i]);
       }
    }
}
