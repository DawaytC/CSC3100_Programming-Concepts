public class problem1 {
	public static void main(String[] args) {
	
		String s1 = "Welcome";
		String s2 = "welcome";
		
		boolean b = s1.equals(s2);
		System.out.println("a)" + b);
		
		boolean c = s1.equalsIgnoreCase(s2);
		System.out.println("b)" + c);
		
		int x = s1.compareTo(s2);
		System.out.println("c)" + x);
		
		int y = s1.length();
		System.out.println("d)" + y);
		
		char xx = s1.charAt(0);
		System.out.println("e)" + xx);
		
		String d = s1.substring(1, 4);
		System.out.println("f)" + d);
		
		String sa = s1.toLowerCase();
		System.out.println("g)" + sa);
		
		String s3 = s1.replace("e", "E");
		System.out.println("h)" + s3);
		
		int f3 = s1.indexOf("e");
		System.out.println("i)" + f3);
		
		String f4 = s1.concat("s2");
		System.out.println("j)" + f4);
		
	}
}
