/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruise;
public class Cruise {

    // Class Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departureTime;
    private String destination;
    private String returnPort;
    private double originalPrice;
    private int capacity;
     
      

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparturetime, String tDestination, 
            String tReturn,double tPrice ,int tCapcity) {
          if (tDestination.equals(tDeparturetime) == true) {
            throw new IllegalArgumentException("destination and origin are the same");
        }
      
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departureTime = tDeparturetime;
        destination = tDestination;
        returnPort = tReturn;
         
    
 
    
   
    // Accessors
    }

    

    

    public String getCruiseName() {
        return cruiseName;
    }
    
    public double getPrice() {
        return originalPrice;
    }
    
    public String getCruiseShipName() {
        return cruiseShipName;
    }
    
    public String getDepartureTime() {
        return departureTime;
    }
    public String getDestination() {
        return destination;
    }
  
    public String getReturnPort() {
        return returnPort;
    }
    
     public int getCapacity() {
        return capacity;
    }
    
    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDepartureTime(String tVar) {
        departureTime = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }
    
    public void setPrice(double tVar) {
        originalPrice = tVar;
    }
    

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }
    
    public void setCapacity(int tVar) {
        capacity = tVar;
    }

    // print cruise details
    public void printCruiseDetails() {
System.out.println("Cruise DeDetails:");
System.out.println("Cruis Name:"+this.getCruiseShipName());
System.out.println("Cruise Time:"+this.getDepartureTime());
System.out.println("Destination:"+this.getDestination());
System.out.println("Return Port:"+this.getReturnPort());
System.out.println("Capacity:"+this.getCapacity());
System.out.println("Price: "+this.getPrice()+"$");

    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }

    
}
    