package call;
import java.io.IOException;

public class demo {
    public static void main(String[] args) {
        try {
			myTest11();
		} catch (Exception e) {
			
		}
    }
    public static void myTest1()
	{
		int  a = 178;
		long b = 8864L;
		double c = 37.266;    
		double d = 37.266D; 
		double e = 26.77e3; 
		float f = 87.363F;
		char g = 'd' ; 
		boolean h = true; 
		boolean i = false;	
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
    public static void myTest2(){

        byte a=50; short b=4; int c=28; long d=43;

		long result=0l;
		System.out.println(result);

		result +=a-1;
		System.out.println(result);

		result *=b+5;
		System.out.println(result);

		result /=d+6;
		System.out.println(result);

		result -=c;
		System.out.println(result);

		result %=d;
		System.out.println(result);
    }
    public static void myTest3()
	{
		int d = 257;
		byte c = (byte)d;
		System.out.println("d=" + d);
		System.out.println("c=" + c);
	}
    public static void myTest4()
	{
		char a1 = 'A',a2;// A的ASCII值为65
		int n;
		n = (int) a1 + 1;
		a2 = (char) n;
		System.out.println(a1 + a2);
		System.out.println(a1 + "," +a2); 

	}
    public static void myTest5()
	{
		String json = "{\nname\n=\n王朝\n}";
		System.out.println(json);

	}
    public static void myTest6()
	{
		System.out.println("java\n语\b言");
		System.out.println("java\r语言");
		System.out.println("java\t语言");
		System.out.println("\\java语言\\");
		System.out.println("\'java语言\'");
		System.out.println("\"java语言\"");
	}
    public static int a;
	public static int b;
	public static void myTest7(int a,int b)
	{
		demo.a = a;
		demo.b = b;

		System.out.println(demo.a);
		System.out.println(demo.b);
	}
    public static void myTest8()
	{
		char a = '\u5E74';//char a = ‘年’;
		String a1 = "Java\u8BED\u8A00";
		String a2 = "\u0030\u0031";
		System.out.println(a );
		System.out.println(a1);
		System.out.println(a2);
	}
    public static void myTest9()
	{
		int a=2, b=31;
		boolean c = a < b;
		boolean d = a >= a * 2 - b * 9;
		boolean yy = 'b' > 'a';

		int aa = yy ? a : b;  //三目运算符

		System.out.println("a < d = " + c);
		System.out.println("d = " + d);
		System.out.println("cc = " + yy);
		System.out.println("aa = " + aa);
	}
    public static void myTest10()
	{
		//byte 8位  [-127-128]
		byte a = 42;
		byte a1 = (byte) (a << 1); 	          //84
		byte a2 = (byte) (a << 2); 	          //168 
		byte a3 = (byte) (a << 3); 	          //336
		System.out.println("a1=" + a1);
		System.out.println("a2=" + a2);
		System.out.println("a3=" + a3);

		//更换数据类型，看是否会溢出
		//int 存储长度很长，左移没有达到存储极限，不会溢出
		int b = 42;
		int b1 = (int) (b << 1); 	          //84
		int b2 = (int) (b << 2); 	          //168 
		int b3 = (int) (b << 3); 	          //336
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("b3=" + b3);
	}
    public static void myTest11() throws IOException 
	{
		System.out.println("你喜欢Java吗(Y/N) ");
		char like = (char)System.in.read();
		if (like == 'Y' || like == 'y')			                   	    		
		{
			System.out.println("Good");
		}
		else{
			System.out.println("very good");
		}
	}
}
