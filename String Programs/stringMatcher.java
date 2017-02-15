
public class stringMatcher {
	public boolean checker(String sinput, String tinput){
		int inputlen = sinput.length();
		int testlen = tinput.length();
		System.out.println(testlen);
		for(int i = 0; i < (inputlen - testlen); i++){
			if(tinput.equalsIgnoreCase((sinput.substring(i, testlen + i)))){
				return true;
			}
		}
		return false;
	}
	
	
	
	public static void main(String[] args){
		String input = "hellobrother";
		String testinput = "lO";
		stringMatcher st = new stringMatcher();
		System.out.println(st.checker(input, testinput));
	}

}
