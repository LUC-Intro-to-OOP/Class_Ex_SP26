/*-------------------------------------------------------------
# Program 6: MPLS Dog Management System using OOP Principles
**Programs 6 is similar in functionality to program 5**


    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Spring I 2023
    System: Visual Studio Code, Windows 10
    Author: C. Fulton
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DogManagement {
    public static void main(String[] args) throws Exception {
        
        //DECLARATIONS
        int userInputSelection = 0;
        ArrayList<Dog> dogList = new ArrayList<>(); //ArrayList that will hold my dogs from csv file

        dogList = readFromFile(); //Calls the readFromFile method and adds dog to arrayList

        welcome(); //Calls welcome method

        userInputSelection = userSelectInput(); //Get menu item **CONSIDER ADDING DEFENSIVE PROGRAM TO ENFORCE 1 - 4**

        //Selection structure to determine which method to call [ UPDATE, DELETE, UPDATE, EXIT]
        if(userInputSelection == 1){
            //Create method
        }else if (userInputSelection == 2){
            //Display method

        }else if (userInputSelection == 3){
            //Update method
                //Consider using the set method  **Once you find the item you update, you use the set method to
                //update that specific item.  
        }else if (userInputSelection == 4){
            //Exit
        }

       
        //Example of how to output items <-- Helpful for userInputSelection #2
        //Looping structure to output dogs in list  **CONSIDER ADDING THIS TO METHOD FOR DISPLAY METHOD**
        for(var i = 0; i < dogList.size(); i++){
            System.out.println(dogList.get(i));
        }

    }//End of main

    //Welcome the end user
    public static void welcome(){
        System.out.println("Welcome, this program outputs the dog records");
    }

    public static ArrayList<Dog> readFromFile() throws FileNotFoundException, IOException{

        //DECLARATION
        ArrayList<Dog> dogFromFile = new ArrayList<>(); //Arraylist to hold dogs within my readFromFile method
        final String COMMA_DELIMITER = ",";
        String fileName = "src\\doginfo.csv";
        //Dog aDog;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); //Reads the first line which is the headers
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                Dog aDog = new Dog(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2]));
                dogFromFile.add(aDog);
            }
            br.close();
        }
        
        return dogFromFile;

    }

    public static int userSelectInput(){
        int selectedItem = 0;

        //NEED language from video that ask user to select item

        return selectedItem;
    }



}
