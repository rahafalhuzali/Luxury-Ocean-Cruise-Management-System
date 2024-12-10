/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruise;

/**
 *
 * @author Delll
 */
public class Passenger{
    //Instance Variables 
    private String passengerName;
    private String passengerCruise;
    private String passengerRoomType;
  
    //Constructor-default
    Passenger(){
        
    }
    
    //Constructor-full
   Passenger(String pName,String pCruise,String pRoomType){
      passengerName=pName;
      passengerCruise=pCruise;  //should be BAL,OV,STE,or INT
      passengerRoomType=pRoomType;
   }  

    
   
    //Accessors
   
   public String getPassengerName(){
       return passengerName;
   }
   
   public String getPassengerCruise(){
       return passengerCruise;
   }
   
   public String getPassengerRoomType(){
       return passengerRoomType;
       
   }
   
     //Mutators 
   public void setPassengerName(String tVar){
       passengerName=tVar;
   }
   public void setPassengerCruise(String tVar){
       passengerCruise=tVar;
   }
   
   public void setPassengerRoomType(String tVar){
       passengerRoomType=tVar;
   }
    //print method
   
   public void printPassenger(){
     int spaceCount;
     String space1="";
      String space2="";
     spaceCount=20-passengerName.length();
     
     for(int i=1; i<=spaceCount; i++){
         space1=space1+ " ";
     }
     spaceCount=20-passengerCruise.length();
      for(int i=1; i<=spaceCount; i++){
         space2=space2+ " ";
     }
     
     System.out.println(passengerName+space1+passengerCruise+space2+passengerRoomType);
 }
   //method added to print passenger's name vice memory address
public String toString(){
    return passengerName;
}

    

}
