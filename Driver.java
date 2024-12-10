/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruise;
 import java.util.ArrayList;
import java.util.Scanner;
public class Driver
{
    //instanc
  private static ArrayList<Ship> shipList = new ArrayList();
   private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> PassengerList = new ArrayList();
   
   
   
    
    public static void main (String[] args){
        initializeShipList();
        initializeCruiseList();
        initializePassengerList();
    }
        
       // hardcoded ship data for testing // Initialize ship list 
public static void initializeShipList () { 
add("Candy Cane", 20, 40, 10, 60, true);
add ("Peppermint Stick", 10, 20, 5, 40, true);
add ("Bon Bon", 12, 18, 2, 24, false);
add ("Candy Corn", 12, 18, 2, 24, false) ;
        
}  
// hardcoded cruise data for testing // Initialize cruise list 
public static void initializeCruiseList () { 
 Cruise newCruise = new Cruise ("Southern Swirl", "Candy Cane","Miami", "Cuba", "Miami",100,5550);
  
    cruiseList.add(newCruise);
    


}
// hardcoded cruise data for testing // Initialize passenger list

public static void initializePassengerList () { 
    Passenger newPassengerl = new Passenger ("Neo AndeESon" ,"Southern Swirl ", "STE");
     PassengerList.add(newPassengerl);
            Passenger newPassenger2 = new Passenger("Trinity" ,"Southern Swirl", "STE");
            PassengerList.add(newPassenger2);
            Passenger newPassenger3 = new Passenger ("Morpheus", "SouthernSwirl", "BAL");
            PassengerList.add (newPassenger3);
}
// custom method to add ships to the shipList ArrayList 
public static void add (String tName, int tBalcony, int toceanview, int tSuite, int tInterior, boolean tInservice)
{ 
    Ship newShip = new Ship (tName, tBalcony, toceanview, tSuite, tInterior, tInservice);
shipList.add (newShip);

}
public static void printShipList (String listType) { 
// printShipList () method prints list of ships from the
// shiplist ArrayList. There are three different outputa
// based on the listType String parameter: - prints a list of ship names only
// active - prints a 1ist of ship names that are "in service"
// tull prints tabbed data on all ships 
if (shipList.size () < 1) { 
    System.out.println("\nThere are no ships to print.");
    return;
} 
if (listType =="name") { 
        System.out.println("\n\nSHIP LIST - Name");
for (int i = 0; i<shipList.size ();i++) { 
    System.out.println(shipList.get(i));
}
}
else if (listType == "active") {
    System.out.println ("\n\nSHIP LIST Active");
} // complete this code block
else if (listType=="full"){
   System.out.println("\n\nSHIP LIST -FULL");
   System.out.println("-----------------------------------------------------------------------");
   System.out.println("                 Number of Rooms                       In");
   System.out.println("SHIP NAME            Bal OV Ste Int         Service");
   System.out.println("\n-----------------------------------------------------------------------");
  for (Ship eachShip: shipList)
      eachShip.printShipData();
}else
    System.out.println("\n\nError: List type not defined.");

}
public static void printCruiseList(String listType){
    if (cruiseList.size()<1){
        System.out.println("\n There are no Cruises to print.");
        return;
    }
    if(listType=="List"){
        System.out.println("\n\nCRUISE LIST");
for (int i = 0; i<cruiseList.size ();i++) { 
    System.out.println(cruiseList.get(i));
        
    }
    }else if (listType=="details"){
   System.out.println("\n\nCRUISE LIST -DETAILS");
   System.out.println("-----------------------------------------------------------------------");
   System.out.println("                 |---------------PORTS------------------------------------|");
   System.out.println("CRUIS NAME       SHIPNAME         DEPARTURE           DESTINATION          RETURNPORT");
   System.out.println("\n-----------------------------------------------------------------------");
  for (Cruise eachCruise: cruiseList)
      eachCruise.printCruiseDetails();
            }else
        System.out.println("\n\nError: List type not defined.");
}
public static void printPassengerList(String listType){
    if (PassengerList.size()<1){
        System.out.println("\n There are no Passenger to print.");
        return;
    }
    System.out.println("\n\nPASSENGER LIST");
    System.out.println("------------------------------------------------------");
    System.out.println("PAASSENGER NAME      CRUISE      ROOMTYPE");
    System.out.println("\n------------------------------------------------------------");
    for(Passenger eachPassenger : PassengerList)
        eachPassenger.printPassenger();
}
//display text-based menu
public static void displayMenu(){
    System.out.println("\n\n");
    System.out.println("\t\t\tLuxury Ocean Cruise Outings");
    System.out.println("\t\t\t\t\tSystem Menu\n");
    System.out.println("[1] Add Ship                    [A]Print Ship Names");
    System.out.println("[2] Edit Ship                   [B]Print Ship In Service List");
    System.out.println("[3] Add Cruise                  [C]Print Ship Full List");
    System.out.println("[4] Edit Cruise                 [D]Print Cruise List");
    System.out.println("[5] Add Passenger               [E]Print Cruise Details");
    System.out.println("[6] Add Cruise                  [F]Print Passenger List");
    System.out.println("[X] Exit System");
    System.out.println("\nEnter a Menu Selection:");
    
}
//Add a New Ship
  public static void addShip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\naddShip method not complete.");
        // complete this method
        //shipName; roomBalcony; roomOceanView; roomSuite; roomInterior; inService;
        Ship vessel = new Ship();
        System.out.print("\nShip name: ");
        vessel.setShipName(sc.nextLine());
        //set ship space (Balcony)
        System.out.print("How many balcony rooms: ");
        vessel.setRoomBalcony(sc.nextInt());
        //set ship ocean view rooms (int)
        System.out.print("How many Ocean Veiw rooms: ");
        vessel.setRoomOceanView(sc.nextInt());
        //set suite rooms (int)
        System.out.print("How many Suit rooms: ");
        vessel.setRoomSuite(sc.nextInt());
        //set interior rooms
        System.out.print("How many interior rooms: ");
        vessel.setRoomInterior(sc.nextInt());
        //set active service
        System.out.print("Is the Ship in active service?\n"
                + "1. Yes"
                + "\n2. No"
                + "\nChoice: ");
        int choice;
        choice = sc.nextInt();
        if (choice == 1) {
            vessel.setInService(true);
        }
        else if (choice == 2) {
            vessel.setInService(false);
        }
        else {
            System.out.println("You entered an incorrect value, setting " + vessel.getShipName() + "to Inactive.");
            vessel.setInService(false);
        }
        //add vessel to list of ships
        shipList.add(vessel);
        //close scanner.
        //sc.next();
        sc.close();

    }
  //Edit an exitsiting ship 
  public static void EditShip(){
      System.out.println("The\"Edit Ship\"feature is not yet implemented.");
  }
   public static void addCruise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\naddShip method not complete.");
        // complete this method
        //
        Cruise vessel = new Cruise();
        System.out.print("\nCruiseName ");
        vessel.setCruiseName(sc.nextLine());
        //setCruiseShipName
        System.out.print("CruiseShipName: ");
        vessel.setCruiseShipName(sc.nextLine());
        //set DepartureTime
        System.out.print("Time and Date: ");
        vessel.setDepartureTime(sc.nextLine());
        //set Destination 
        System.out.print("Destination: ");
        vessel.setDestination(sc.nextLine());
        //set Price
        System.out.print("How much Tickit ");
        vessel.setPrice(sc.nextInt());
        //set a ReturnPort
        
     System.out.print("Return Port: ");
        vessel.setReturnPort(sc.nextLine());
         System.out.print("Capacity: ");
        vessel.setCapacity(sc.nextInt());
       
       
        //add vessel to list of ships
        cruiseList.add(vessel);
        //close scanner.
        //sc.next();
        sc.close();

  
         
      
}
   
   
   //Edit an exitsiting Cruise
  public static void EditCruise(){
      System.out.println("The\"Edit Cruise\"feature is not yet implemented.");
  }
  
  
  public static void addPassenger(){
      Scanner newPassengerInput = new Scanner(System.in);
      System.out.println("Enter the new passenger's name:");
      String newPassengerName = newPassengerInput.nextLine();
      
      
      //ensure new passenger name dose not already exist
      
    for(Passenger eachPassenger :PassengerList){
        if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)){
            System.out.println("That is already in the System.Exiting to menu.... ");
            return;//quits addPassenger() method procssing 
        }
    }
    
    //get cruise name for Passinger 
    System.out.println("Enter Cruise name:");
    String newCruiseName = newPassengerInput.nextLine();
    
    //ensure cruise exists
    
  for(Cruise eachCruise:cruiseList){
    if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)){ 
        //cruise dose exist
    }else{
      System.out.println("That cruise dose not exist in the System.Exiting to menu....  ");
      return;//quits addPassenger() method procssing 
                }
    } 
  
 //get room Type 
 System.out.println("Enter Room Type:(Balcony,Suite,OceanView,or Interior)");
 String room=newPassengerInput.nextLine();
 //validate room type 
 if ((room.equalsIgnoreCase("Balcony"))||(room.equalsIgnoreCase("Suite")) ||  
 (room.equalsIgnoreCase("OceanView")) ||(room.equalsIgnoreCase("Interior"))){
     //validation passed -add passenger 
   Passenger newPassenger= new Passenger(newPassengerName,newCruiseName,room.toUpperCase());
   PassengerList.add(newPassenger);
      
  }else{
      
     System.out.println("Invalid input. Exiting to menu...");
     return;//quits addPassenger() method procssing 
  }
}
  public static void EditPassenger(){
      System.out.println("The\"Edit Cruise\"feature is not yet implemented.");
  }
  
  //Method Check if input is a number 
  public static boolean isNumber(String str){
      for(int i=0; i<str.length();i++){
       if(Character.isDigit(str.charAt(i)) ==false)
          return false;
      }
      return true;
  }
     public static void mainMenu() {
        char choice = '0';
        Scanner scnr = new Scanner(System.in);
                displayMenu();
                try {
                    //scnr.next();
                    choice = scnr.next().charAt(0); // might throw an exception
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("\n\nException caught - " + e);
                }
                while (choice != 'x') {             
                    if (choice == 'x') {
                        break;
                    }
                    else if (choice == '1') {
                        addShip();
                        displayMenu();
                    }
                    else if (choice == '2') {
                        EditShip();
                        displayMenu();
                    }   
                    else if (choice == '3') {
                        addCruise();
                        displayMenu();
                    }
                    else if (choice == '4') {
                        EditCruise();
                        displayMenu();
                    }
                    else if (choice == '5') {
                        addPassenger();
                        displayMenu();
                    }
                    else if (choice == '6') {
                        EditPassenger();
                        displayMenu();
                    }
                    else if (choice == 'A' || choice == 'a') {
                        printCruiseList("name");
                        displayMenu();
                    }
                    else if (choice == 'B'|| choice == 'b') {
                        printCruiseList("active");
                        displayMenu();
                    }
                    else if (choice == 'C' || choice == 'c') {
                        printCruiseList("full");
                        displayMenu();
                    }
                    else if (choice == 'D' || choice == 'd') {
                        printShipList("list");
                        displayMenu();
                    }
                    else if (choice == 'E' || choice == 'e') {
                        printShipList("details");
                        displayMenu();
                    }
                    else if (choice == 'F' || choice == 'f') {
                        printPassengerList("List");
                        displayMenu();
                    }
                    else {
                        System.out.println("\nSomething went wrong");
                        System.out.print("\nChoice: ");
                    }
                }
            //close scanner
            scnr.close();
     }
}




    

    

    
