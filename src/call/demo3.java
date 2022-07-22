package call;
import java.util.*;
import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        String str[]=new String[]{"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        Arrays.sort(str);
        for(;;){
            System.out.println("请输入想要查询的目标");
            Scanner reader=new Scanner(System.in);
            String a=reader.next();
            int index = Arrays.binarySearch(str, a);
            if(index<0)
            {
                System.out.println("你搜索的目标不在范围内");
            }else{
                System.out.println(a+"的索引位置是："+index);
            }
            System.out.println("     ");
        }
    }
}
