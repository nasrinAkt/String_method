package all_string;

public class equals_ignorecase {

	public static void main(String[] args) {
		equals_ignorecase lime = new equals_ignorecase();
		lime.black();
		lime.white();
		equals_ignorecase.phone();
		equals_ignorecase.mobile();
	}
public void black() {
String a = "I like black color";
String b = "i Like Black Color";
boolean m = a.equalsIgnoreCase(b);
System.out.println(m);
}
public void white() {
String a = "White is the best color";
boolean f = a.equalsIgnoreCase("white is THE BEST COLOR");
System.out.println(f);
}	
public static void phone() {
String a = "very powerful";
String b = "VERY POWERFUL";
boolean l = a.equalsIgnoreCase(b);
System.out.println(l);
}	
	
public static void mobile() {
String a = "verry powerful";
String b = "VERY POWERFUL";
boolean l = a.equalsIgnoreCase(b);
System.out.println(l);
}	
		
	
}
