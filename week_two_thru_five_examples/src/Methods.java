import java.util.Scanner;

public class Methods {

    static String [] food_items = {"Nuts", "Fish", "Lentils"};
     public static void main(String[] args) throws Exception {
        String name;
        Scanner input = new Scanner(System.in);
        outputItems(); //Calling or involking the method
        System.out.print("Plese enter the name of the item to see the price: ");
        name = input.nextLine();
        
        determinePriceForItem(name); //Call or involk the method and pass in name value

        System.out.println("The price of the item is: " + determinePriceForItem(name));

        
     }//end of main method

     public static void outputItems(){
        for(var i = 0; i < food_items.length; i++){
            System.out.println("Item #" + (i+1) + ": " + food_items[i]);
        }
     }

     public static double determinePriceForItem(String name){

        //Declarations
        double [] ITEM_PRICE = {.75, 5.00, 2.00};
        double price = 0.0;

        //Selection Structure
        if(name.equalsIgnoreCase((food_items[0]))){
            price = ITEM_PRICE[0];
        }else if(name.equalsIgnoreCase(food_items[1])){
            price = ITEM_PRICE[1];
        }else if(name.equalsIgnoreCase(food_items[2])){
            price = ITEM_PRICE[2];
        }else{
            System.out.println( "Item is not in array");
        }

        return price;
     }
}
