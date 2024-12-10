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
public class Ship {
    //Instance Variables
    private String shipName;
    private int roomBalcony;
    private int roomSuite;
    private int roomOceanView;
    private int roomInterior;
    private boolean inService;
    
    //Constructor-default
    Ship(){ 
    
}
    //Constructor-full
  Ship (String cName, int cBalcony,int cOceanView , int cSuite ,int cInterior , boolean cInService ){
      shipName= cName;
      roomBalcony= cBalcony;
      roomOceanView=cOceanView;
      roomSuite=cSuite;
      roomInterior=cInterior;
      inService=cInService;
  }
  //Accessors
  public String getShipName(){
      return shipName;
  }
  public int getRoomOceanView(){
      return roomOceanView;
  }
  public int getRoomBlacony(){
      return roomBalcony;
  }
  public int getRoomSuite (){
      return roomSuite;
  }
  public int getRoomInterior(){
      return roomInterior;
  }
  public boolean getInService(){
      return inService;
  }
  
  //Mutators 
  public void setShipName(String cVar){
      shipName= cVar;
      
  }
  
  public void setRoomBalcony(int cVar){
       roomBalcony=cVar;
  }
  
  public void  setRoomOceanView(int cVar){
      roomOceanView=cVar;
  }
  public void setRoomSuite (int cVar){
            roomSuite=cVar;
  }
  
  public void setRoomInterior(int cVar){
      roomInterior=cVar;
  }
  
 public void setInService(boolean cVar){
     inService=cVar;
 }
 //print method
 public void printShipData(){
     int spaceCount;
     String space="";
     spaceCount=20-shipName.length();
     
     for(int i=1; i<=spaceCount; i++){
         space=space+"";
     }
     System.out.println(shipName+space+roomBalcony+"\t"+
             roomOceanView+"\t"+roomSuite+"\t"+roomInterior+"\t\t"+inService);
 }
 //method added to print ship's name vice memory address
public String toString(){
    return shipName;
}
    
  
}
