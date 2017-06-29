package tw.aaa.myproject.OOPString;

public class StringWrapperClasses {

	public static void main(String[] args) {
		String num = "12345";
		System.out.println("num+1=" + num + 1);
		Integer b = new Integer(num);
		int c = b.intValue();
		System.out.println("num1+1=" + (c + 1));
		int a = Integer.parseInt(num);
		System.out.println("num2+1=" + (a + 1));
		Integer i1 = 6;
		int i2 = i1;
		System.out.println("++i1=" + (++i1));
		System.out.println("++i2=" + (++i2));
	}

}
