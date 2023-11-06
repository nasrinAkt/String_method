package all_string;

public class ends_with {

	public static void main(String[] args) {
		
	int a = 502;
	double b = 10.55;
	String c = " Nasrin Akter ";
	char d = 'n';
	System.out.println(a+b+c+d);
	ends_with now = new ends_with();
	now.danger();
	now.fan();
	ends_with.tablet();
	ends_with.tab();	
	}
public void danger() {
String a = "Hello world";
boolean d = a.endsWith("world");
System.out.println(d);

	
}
public void fan() {
String a = "What's going on mommy?";
boolean k = a.endsWith("mommy?");
System.out.println(k);
}	
public static void tablet() {
String a = "Why are you doing that?";
boolean j = a.endsWith("?");
System.out.println(j);
	
}	
public static void tab() {
String a = "Where are you?";
boolean s = a.endsWith("you?");
System.out.println(s);
}	
	
	
	
}
