package call;
import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        int ia[] =new int[]{1,8,9,4,5};

        Arrays.sort(ia);
        
        for(;;){
            System.out.println("请输入想要查询的目标");
            Scanner reader=new Scanner(System.in);
            int a=reader.nextInt();
            int index = Arrays.binarySearch(ia, a);
            if(index<0)
            {
                System.out.println("你搜索的目标不在范围内");
            }else{
                System.out.println(a+"的索引位置是："+index);
            }
            
        }
    }
}
