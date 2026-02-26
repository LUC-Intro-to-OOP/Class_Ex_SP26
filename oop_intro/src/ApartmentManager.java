import java.util.*;


public class ApartmentManager {
    public static void main(String[] args) throws Exception {
      

        //Declarations
        Scanner input = new Scanner(System.in);
        //[] renterList = new Renter[3]; //Array that is going hold objects

        //ArrayList that will hold my renters
        ArrayList<Renter> list = new ArrayList<>();



        Renter aRenter; //Declaring a renter object
        String name;


        //Create a looping structure that is going to iterate and populate my array
        for(var x = 0; x < 2; x++){
          System.out.print("Please enter name number" + (x+1) + ":");
          name = input.nextLine();
          aRenter = new Renter(name); //Instantiate the object
          list.add(aRenter);//adding the newly created object instance to the list
          //renterList[x] = new Renter(name); //istantiated my object instance and populated my array

        }

        for(var i = 0; i < 2; i++){
          System.out.print(list.get(i));
        }
       


   
       /*  
        Renter renter_one = new Renter("Caden", "123 Fulton Blvd", 2,2);//Instantiated a new Renter object
        Renter renterCui = new Renter("Cui");
        Renter renter_two = new Renter();
        renter_two.setName("Bilal");
        renter_two.setAddress("125 Futon Blvd");
        renter_two.setBathrooms(4);;
        renter_two.setBedRoom(1);

        //System.out.println("Renter One: " + renter_one);
        System.out.println("Name: " + renter_one.getName() + " Address: " + renter_one.getAddress());
        System.out.println("Renter Two: " + renter_two);
        System.out.println(renterCui);
        */
    }
}
