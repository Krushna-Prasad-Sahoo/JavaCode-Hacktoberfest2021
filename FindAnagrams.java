import java.io.*;
import java.util.*;

public class FindAnagrams {
    public static void main(String[] args) {
        String filePath = "SampleData.txt";
        List<String> anagramWords = anagramsList(filePath);
        for (String words : anagramWords) {
            System.out.println(words);
        }
    }
    
    public static List<String> anagramsList(String filePath) {
        //ADD YOUR CODE HERE
	List<String> anagrams = new ArrayList<String>();
	try{
        FileInputStream fin = new FileInputStream(filePath);
	BufferedReader br = new BufferedReader(new InputStreamReader(fin));
        Map<String, String> anaDict = new LinkedHashMap<String, String>();
	String word = "";
        while((word = br.readLine()) != null){
                word = word.toLowerCase();
                String key  = generateKey(word);
                if(anaDict.containsKey(key)){
                        anaDict.put(key, anaDict.get(key) + "," + word);
                } else {
                        anaDict.put(key, word);
                }
        }
        for(String key : anaDict.keySet()){
                String value = anaDict.get(key);
                if(value.indexOf(",") > 0 ){
                        anagrams.add(value);
                }
        }
       
	}catch(Exception e){
		System.out.println(e.getClass());
	}
	return anagrams;
}

        public static String generateKey(String word){
                char[] let = word.toCharArray();
                Arrays.sort(let);
                return new String(let);
        }
}
