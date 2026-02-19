import java.util.*;

public class MethodsAgain {
  public static void main(String args[]) {
    
    //DECLARATIONS
    Scanner input = new Scanner(System.in); //Declaring and instantiating a Scanner Object
    int numOne, numTwo;
    int [] returnedValues;

   //Ask the end end user for two numbers
   System.out.print("Please enter first number: ");
   numOne = Integer.parseInt(input.nextLine());
   
   
   System.out.print("Please enter second number: ");
   numTwo = Integer.parseInt(input.nextLine());
   
   //Call or involk the method
   returnedValues = calcNumbers(numOne, numTwo);
   
   
   
   //Output the results of the two methods.
   System.out.println("The sum from first method is: " + returnedValues[0]);
   System.out.println("The values multiplied from the second method is: " + returnedValues[1]);
   
   
  }//end of main
  
  //One method adds the two numbers
  public static int [] calcNumbers(int numberOne, int numberTwo){
     
      //DECLARATIONS
      int addedValue, multiValue;
      int [] arrayHolder = new int[2];
      addedValue =  numberOne + numberTwo;
      
       multiValue = multiTwo(numberOne, numberTwo);
       
       arrayHolder[0] = addedValue;
       arrayHolder[1] = multiValue;
       
       return arrayHolder;
      
     
  }//End of addTwo method
  
 //Another method that multiply's the two numbers
 public static int multiTwo(int numberOne, int numberTwo){
     return numberOne * numberTwo;
    
 }//End of MultiTwo method
}