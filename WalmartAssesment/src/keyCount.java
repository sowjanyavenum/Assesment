import java.util.Arrays;
import java.util.HashMap;
import com.google.gson.Gson;



public class keyCount {

	public static void main(String[] args) {
		String str="Walmart Technology is reinventing the way the world shops and we’ve only just begun. Our team includes @Walmart Labs in Silicon Valley and Bengaluru, which powers the eCommerce experience, as well as technology teams across data and analytics, retail, back office and more who help power store and digital experiences.";
		String repeat=StringCount(str);
		System.out.println("The number of times of repeation for each word is :" +repeat);
	}
	public static String StringCount(String sentence){
		String str1=sentence.replaceAll("[.,]", "");
		String[] myPhrase = str1.split(" ");
		
		 Gson gsonObj = new Gson();
		// ArrayList<HashMap<String, String>> dataMap = new ArrayList<HashMap<String, String>>();
	 HashMap<String, Integer> myWordsCount = new HashMap<String, Integer>();
	 
		    for (String s : myPhrase){
		        if (myWordsCount.containsKey(s)){
		        	myWordsCount.replace(s, myWordsCount.get(s) + 1);
		        	
		        }
		        else {
		        	myWordsCount.put(s, 1);
		        }
		      
		    }
		     String jsonStr = gsonObj.toJson(Arrays.asList(myWordsCount));
	       	return jsonStr;
	       
	}
		
			
	}


