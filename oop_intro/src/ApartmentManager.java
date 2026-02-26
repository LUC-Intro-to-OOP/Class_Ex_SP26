public class ApartmentManager {
    public static void main(String[] args) throws Exception {
      Apartment aparment_one;

        //Declarations
        Renter renter_one = new Renter();//Instantiated a new Renter object
        renter_one.name = "Caden";
        renter_one.address = "123 Fulton Blvd";
        renter_one.numberOfBathrooms = 2;
        renter_one.numberOfBedrooms = 3;
       


        Renter renter_two = new Renter();
        renter_two.name = "Bilal";
        renter_two.address = "125 Futon Blvd";
        renter_two.numberOfBathrooms = 4;
        renter_two.numberOfBedrooms = 1;

        System.out.println("Renter One: " + renter_one);
        System.out.println("Renter Two: " + renter_two);
        
    }
}
