class Result {

  // function checks if the username can be changed to a smaller one

    public static boolean isSmallerAlphabetically(String username){
        char [] usernameArray = username.toCharArray();

      //iterate thru each pair of characters
        for(int i=0;i<usernameArray.length-1;i++){
            if(usernameArray[i]>usernameArray[i+1]){
              // if character found is greater we can perform the swap
                return true;
            }
           
        } return false;
    }
    public static List<String> possibleChanges(List<String> usernames) {
 
    List<String> result = new ArrayList<>();
    for (String username:usernames){
        if(isSmallerAlphabetically(username)){
            result.add("YES");
        }
        else{
            result.add("NO");
        }
    }return result;
    
   

    }

}
