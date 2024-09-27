import java.util.Scanner;
class Driver {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringTools sTools = new StringTools();

System.out.println("lastLetter test cases:");
      System.out.println("Enter a word with at least one character: ");
      String answer1 = input.nextLine();
      System.out.println("The last letter is " + sTools.lastLetter(answer1));
      
 
      StringTools str1= new StringTools();
     

System.out.println("enter a nine digit phone number")  ;
String answer2= input.nextLine();
    System.out.println(str1.formatPhoneNumber(answer2));

    StringTools str2= new StringTools();
System.out.println("enter a word that is at least 3 letters long an odd in length")  ;   
String answer3= input.nextLine();
System.out.println(str2.middleThree(answer3));


StringTools str3= new StringTools();
System.out.println("enter a word that is at least 2 letters long")  ; 
   String answer4= input.nextLine(); 
System.out.println(str3.swapLastTwo(answer4))  ; 


public static void main (String[] args){
    System.out.println(frontAgain("edited", 2)); 
    System.out.println(frontAgain("edited", 1));  
    System.out.println(frontAgain("edited", 6));
}







    
    
    
      
}

