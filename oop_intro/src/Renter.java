public class Renter {
    
    //Attributes or Properties
    private String name;
    private String address;
    private int numberOfBedrooms;
    private int numberOfBathrooms;

    //Default Constructor
    public Renter(){
        name = "N/A";
        address = "address";
        numberOfBedrooms = 0;
        numberOfBathrooms = 0;
    }


    //Overloading the Constructor
    public Renter(String name, String address, int bedCount, int bathCount){
        this.name = name;
        this.address = address;
        numberOfBedrooms = bedCount;
        numberOfBathrooms = bathCount;
    } 

    //Overloaded construction that accepts one parameter
    public Renter(String name){
        this.name = name;
        address = "address";
        numberOfBedrooms = 0;
        numberOfBathrooms = 0;
    }

    //Getter and Setter methods
    public void setName(String aName){
        name = aName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setBedRoom(int roomCount){
        numberOfBedrooms = roomCount;
    }
    public void setBathrooms(int bathCount){
        numberOfBathrooms = bathCount;
    }

    //Getter Methods
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getRoomCount(){
        return numberOfBedrooms;
    }

    public int getBathCount(){
        return numberOfBathrooms;
    }

    public String toString(){

        return String.format("Name: " + name + " Address: " + address + " Bed Count: " + numberOfBedrooms);
    }
    //Potentially Methods

}
