
public class stringMatcher {
	public int checker(String sinput, String tinput){
		int inputlen = sinput.length();
		int testlen = tinput.length();
		for(int i = 0; i < (inputlen - testlen); i++){
			if(tinput.equalsIgnoreCase((sinput.substring(i, testlen + i)))){
				return i;
			}
		}
		return -1;
	}
	
	public boolean checkerwithpattern(String sinput, String testinput){
		int inputlen = sinput.length();
		int testlen = testinput.length();
		String[] s = new String[3];
		s = testinput.split("}");
		System.out.println(s[0] + " "+ s[1] + " " + s[2]);
		int i = 0;
		int count = 0;
		while(i < 3){
			count = checker(sinput, s[i]);
			System.out.println(count);
			if(count == -1){
				return false;
			}
			sinput = sinput.substring(count + s[i].length());
			System.out.println(sinput);
			i = i+ 1;
		}
		return true;
	}
	
	
	
	
	
	public static void main(String[] args){
		String input = "cabccbacbacab";
		String testinput = "ab}ba}cc";
		stringMatcher st = new stringMatcher();
		System.out.println(st.checkerwithpattern(input, testinput));
	}

}
