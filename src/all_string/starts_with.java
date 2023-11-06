package all_string;

public class starts_with {

	public static void main(String[] args) {
		starts_with pen	= new starts_with();
		pen.tv();
		pen.mom();
		starts_with.dad();
		starts_with.sister();

	}

	public void tv() {
	String a = "delete";
	boolean t = a.startsWith("d");
	System.out.println(t);
	}
	public void mom() {
	String a = "All the way back";
	boolean m = a.startsWith("All");
	System.out.println(m);
	}
	public static void dad() {
	String a = "My course almost finish";
	boolean h = a.startsWith("My");
	System.out.println(h);
			
	}
	public static void sister() {
	String a = "I am comming to your house.";
	boolean k = a.startsWith("I");
	System.out.println(k);
			
	}
	
}
