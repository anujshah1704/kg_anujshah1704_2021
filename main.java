import java.util.HashMap;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class main {

	public static void  main(String[] args) throws IOException {
		System.out.println(stringMapping(args[0], args[1]));
		}

	private static String stringMapping(String s1, String s2) {
		HashMap<Character, Character> map = new HashMap<>();
		
		/*Since the mapping is ONE TO ONE the lengths of the input should be same*/
		/*Ignoring the case when string s2 will be greater than s1*/
		/*That is: although all characters of string s1 are mapped with s2 but s2 has more chars left; eg: s1= abd & s2 =45567 */
		if(s1.length()!=s2.length())
			return "false";
		
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		
		for(int i=0; i<char1.length;++i) {
			if(map.containsKey(char1[i])) {
				if(map.get(char1[i])!=char2[i])
					return "false";
			}
			else {
				map.put(char1[i], char2[i]);
			}
		}
		return "true";
	}
}