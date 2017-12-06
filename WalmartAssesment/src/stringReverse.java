

//using java language
//1. Write a function that reverses a string. Ex: If the string is "abcd", it should produce "dcba."
//What's the runtime of this function?
//Any language is acceptable. If the language has a reverse() function, create your own instead. 
//If the language supports the swap function, you may use that.


public class stringReverse {

		
		public static void main(String[] args) {
		    String input = "abcd";
		    reverseWord(input);
		    
		}
		public static void reverseWord(String input){
		    int left=0;
		    int right=0;
		    long startTime = System.nanoTime();
		    char[] temparray= input.toCharArray();
		    right=temparray.length-1;
		    for (left=0; left < right ; left++ ,right--)
		    {
		     // Swap values of left and right 
		     char temp = temparray[left];
		     temparray[left] = temparray[right];
		     temparray[right]=temp;
		    }
		    for (char c : temparray)
		    {
		     System.out.print(c);
		    }
		   
		    long endTime   = System.nanoTime();
			
				long totalTime = (endTime - startTime);
				System.out.println("\nThe total time in nanosec is "+totalTime+"ns");
				
		   }
		}
		
  
		   
		
	

