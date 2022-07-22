package call;
import java.util.*;
public class demo13 {
    public static void main(String[] args) {
        Date date = new Date(); // 创建Date对象date
		String year = String.format("%tY", date); // 将date进行格式化
		String month = String.format("%tB", date);
		String day = String.format("%te", date);
        System.out.println(date);
		System.out.println("今年是：" + year + "年"); // 输出信息
		System.out.println("现在是：" + month);
		System.out.println("今天是：" + day + "号");
    }
}
