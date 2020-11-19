
public class String1 {
	public static void main(String[] args) {
		
		String str= new String("nice to meet you");
		System.out.println("length : " + str.length()); //16
		System.out.println("charAt : " + str.charAt(0)); //n
		System.out.println("indexOf : " + str.indexOf("o mee")); //6
		System.out.println("index : " + str.lastIndexOf("e")); //10
		
		String str2= new String("NICE TO MEET YOU");
		System.out.println("equals : "+str.equals(str2)); //false
		System.out.println("equalsIgnoreCase : "+str.equalsIgnoreCase(str2)); //true
		
		System.out.println("toUpperCase : "+str.toUpperCase()); //대문자
		System.out.println("toLowerCase : "+str.toLowerCase()); //소문자
		
		
		System.out.println("concat : "+str.concat(str2)); //붙이기
		System.out.println("+ :"+str+str2);
		System.out.println("str :"+str);
		
		
		
		
	}//main
	public static boolean eqTest(String s1, String s2) { //문자열 비교
		
		boolean rtb= true;
		
		if(s1.length() != s2.length())
		{
			return !rtb;
		}
		for (int i = 0; i < s1.length(); i++) {
			for (int k = 0; k < s2.length(); k++) {
				if(s1.charAt(i)!=s2.charAt(k)) {
					rtb =false;
					break;
				}
			}
		}
		return rtb;
		
	}
}
