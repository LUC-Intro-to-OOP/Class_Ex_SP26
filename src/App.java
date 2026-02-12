public class App {
    public static void main(String[] args) throws Exception {


        String [] groceries = {"Eggs", "Fruit", "Tim Tams", "Yams"}; //Collection Initializer
        double [] prices = {13.00, 3.00, 6.50, 10.00};
        String foundItem = "";
        double foundPrice =0.00;
        boolean isFound = false; //flag variable
        for(var i = 0; i < groceries.length; i++){
            //System.out.print(groceries[i] + " ");
            //Selection structure
            if(groceries[i].equalsIgnoreCase("Yams")){
                isFound = true;
                
                foundItem = groceries[i];
                foundPrice = prices[i];
                i = groceries.length;  //Why would I do this
                
            }

        }

        //Let the enduser know that you found the item within the array
        if(isFound == true){
            System.out.println(foundItem + " was found in the array for a price of $" + foundPrice);
        }else{
            System.out.println("Fruit was not found in the array");
        }

    }
}
