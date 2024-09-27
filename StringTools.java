
public class StringTools {
    //method for question 1
    public String lastLetter(String str) {
        return str.substring(str.length()-1);
        
        
    }
    
    public String formatPhoneNumber(String str1) {
        
    String areaCode = str1.substring(0, 3);
    String centralOfficeCode = str1.substring(3, 6);
    String lineNumber = str1.substring(6, 10);
    return "(" + areaCode + ") " + centralOfficeCode + "-" + lineNumber;

}
public String middleThree(String str) {
        int middle= str.length()/2;
        
        return str.substring(middle - 1, middle + 2);
        
        
        
        
   }
   
public String swapLastTwo (String str) {
        String restLetters= str.substring(0,str.length()-2);
        String secondLast= str.substring(str.length() - 2, str.length()-1);
        String last= str.substring(str.length() - 1);
        return restLetters+ last+ secondLast;
    }
    
public boolean frontAgain (String str, int n){
    string= str;
    number=n;
    
    String firstLetters= str.substring(0,n+1);
    String lastLetters= str.subtring(str.length()-n, str.length()-1);
    
    if (firstLetters= lastLetters);
    return true;
    
    if (firstLetters != lastLettes);
    return false;
    
    
    
    
    
    
    
    
    
    
    
    }

    
    
        
        
}

        
        

    
