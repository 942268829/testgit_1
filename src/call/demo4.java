package call;
import java.util.*;
public class demo4 {
    public static void main(String[] args) {
		// 创建一个数组
		int[] array = { 65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
		// 创建反转排序类的对象
		demo4 sorter = new demo4();
		// 调用排demo4对象的方法将数组反转
		sorter.sort(array);
	}
	
	/**
	 *直接选择排序法
	 * 
	 * @param array
	 *            要排序的数组
	 */
	public void sort(int[] array) {
		System.out.println("数组原有内容：");
		showArray(array);// 输出排序前的数组值
		int temp;
		int len = array.length;
		for (int i = 0; i < len / 2; i++) {
			temp = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = temp;
		}
		System.out.println("数组反转后内容：");
		showArray(array);// 输出排序后的数组值
	}
	
	/**
	 * 显示数组所有元素
	 * 
	 * @param array
	 *            要显示的数组
	 */
	public void showArray(int[] array) {
		for (int i : array) {// foreach格式遍历数组
			
            char a =(char)i;
            System.out.print("\t" + a);// 输出每个数组元素值
		}
		System.out.println();
	}
}
