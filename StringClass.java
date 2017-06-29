package tw.aaa.myproject.OOPString;

public class StringClass {

	public static void main(String[] args) {
	String data="abcdefg";
	System.out.println("charAt(5)="+data.charAt(5));
	System.out.println("length()="+data.length());
	System.out.println("indexOf('cd')="+data.indexOf("cd"));
	System.out.println("substring(3,5)="+data.substring(3,5));
	  System.out.println("data.toUpperCase()=" + data.toUpperCase());
	  String name="a-b-c-d";
	String[] ac=name.split("-");
	for(String a:ac)
	{
		System.out.println("name:" + a);
	}
	}

}
