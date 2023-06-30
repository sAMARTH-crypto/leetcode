public class ReverseString {
	
/* two pointer method is used in this case pointer left and right are assigned to the 
   first and last index of the array and it is being traversed and elements are being 
   swapped simultaneously */
	
	
	public static void reverseString(char[] s) {
	    int left = 0;
	    int right = s.length - 1;
	    
	    while (left < right) {
	        // Swap characters at left and right pointers
	        char temp = s[left];
	        s[left] = s[right];
	        s[right] = temp;
	        
	        // Move the pointers towards the center
	        left++;
	        right--;
	    }
	}
	
