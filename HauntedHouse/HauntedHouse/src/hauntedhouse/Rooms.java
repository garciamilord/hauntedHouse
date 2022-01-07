package hauntedhouse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

       
/**
 *
 * @author garci
 */

public class Rooms {
    private String userName; 
    private int personChoice;
    private String bookBag;
    private String[] option;
    private String lastRoom;
    /*the input there name */
    public void setuserName (){
        ImageIcon nameTag = new ImageIcon("Tell me your name.jpg");
        userName = JOptionPane.showInputDialog(null,"Tell me your name? Muhaaaah!", "Tell me your name",JOptionPane.INFORMATION_MESSAGE, nameTag, null, "").toString();
        ImageIcon doom = new ImageIcon("welcome.jpg");
        JOptionPane.showMessageDialog(null, "Welcome Spooky House!","Happy Halloween!",JOptionPane.INFORMATION_MESSAGE,doom);
    }
    /*this the front door method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void setFrontDoor() {
         option = new String [] { "Living Room" ,"Dining Room" , "Stairs"};
        ImageIcon deathdoor = new ImageIcon("frontdoor.jpg");
        JOptionPane.showMessageDialog(null, "Your at the front door.", "",JOptionPane.INFORMATION_MESSAGE, deathdoor);
        personChoice = JOptionPane.showOptionDialog( null, "Where do you like to go?", "Front Door", 0,JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
    if(personChoice == 0){
        livingRoom();
       
    }else if(personChoice == 1){
        diningRoom();
    } else{
         upStairs();
    }
    
    } 
    /*this the living room method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void livingRoom() {
        lastRoom = "Living Room";
       String [] livingRoomOption = { "Open Chest","Go to Bathroom" };
       ImageIcon deathroom = new ImageIcon("livingroom.jpg");
       JOptionPane.showMessageDialog(null, "Your in the Living Room.","", JOptionPane.INFORMATION_MESSAGE,deathroom);
       personChoice = JOptionPane.showOptionDialog(null, "What do you like to in this room?", "Living Rooming", 0,JOptionPane.INFORMATION_MESSAGE, null, livingRoomOption, livingRoomOption[0]);
       if(personChoice == 0){
           openChest();
       }else{
           goToBathroom();
           
       }
       
            
        
    }
    /*this the front door method store all  choice in aray, picture, appears in JOption message and option buttons*/
     public void goToBathroom(){
         lastRoom = "Bathroom";
        String [] bathRoomOption ={"Mirror", "Shower"};
        ImageIcon ddd = new ImageIcon("bathroom.jpg");
        JOptionPane.showMessageDialog(null, "Your in the bathroom.","", JOptionPane.INFORMATION_MESSAGE, ddd);
        personChoice = JOptionPane.showOptionDialog(null, "What do you like to do in the bathroom?", "Bathroom", 0,JOptionPane.INFORMATION_MESSAGE, null, bathRoomOption, bathRoomOption[0]);
        if(personChoice == 0){
            ImageIcon bloodMirror = new ImageIcon("mirror.jpg");
            JOptionPane.showMessageDialog(null, "See a bloody face looking back at you","", JOptionPane.INFORMATION_MESSAGE,bloodMirror);
            bookBag = "Mirror";
            
        }else{ 
            ImageIcon ghostShower = new ImageIcon("shower.jpg");
            JOptionPane.showMessageDialog(null, "Room suddenly steams up and you feel fingers touching the back of your neck","",JOptionPane.INFORMATION_MESSAGE, ghostShower );
        bookBag = "Shower";
        
        }
    }
      public void openChest(){
          
          ImageIcon bigChest = new ImageIcon("chest.jpg");
        JOptionPane.showMessageDialog(null, "Ghost escapes and scares you to death","",JOptionPane.INFORMATION_MESSAGE, bigChest);
        bookBag = "Chest";
        
       
        
    }
      /*this the upStairs method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void upStairs(){
        
        String [] upStairsOption = { "Master Bedroom","Bedroom one","Bedroom two"};
        ImageIcon deathStairs = new ImageIcon("staircase.jpg");
        JOptionPane.showMessageDialog(null, "Your in the second floor.", "",JOptionPane.INFORMATION_MESSAGE, deathStairs);
        personChoice = JOptionPane.showOptionDialog(null, "What do you want to do upstairs?", "Upstairs", 0,JOptionPane.INFORMATION_MESSAGE, null, upStairsOption, upStairsOption[0]);
        if(personChoice == 0){
            masterBedRoom();
        }else if(personChoice == 1){
            bedRoomOne();
        }else{
            bedRoomTwo();
        }
            
    }
    /* the master bedroom methods*/
    public void masterBedRoom(){
        lastRoom = "Master Bedroom";
        String [] masterBedRoomOption = { "Jewerly Box", "Master Bathroom"};
        ImageIcon hellMaster = new ImageIcon("masterbedroom.jpg"); 
        JOptionPane.showMessageDialog(null, "Master Bedroom.","",JOptionPane.INFORMATION_MESSAGE, hellMaster);
        personChoice = JOptionPane.showOptionDialog(null, "What do want do in the Master Bedroom?", "Master Bedroom", 0,JOptionPane.INFORMATION_MESSAGE, null, masterBedRoomOption, masterBedRoomOption[0]);
        if(personChoice == 0){
            jewerlyBox();
        }else{ masterBathRoom();
            
        }
    }
    public void jewerlyBox(){
        ImageIcon box= new ImageIcon("jewerlyBox.jpg");
        JOptionPane.showMessageDialog(null, "You find the cursed Hope Diamond and feel your doom!","", JOptionPane.INFORMATION_MESSAGE, box);
        bookBag = "Jewelry Box";
       
        
    }
    /*this the master Bathroom method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void masterBathRoom(){
        lastRoom = "Master Bathroom";
        String [] masterBathRoomOption = { "Intricate Oil Lamp","Shower"};
        ImageIcon MBathRoom = new ImageIcon("masterbathroom.jpg");
        JOptionPane.showMessageDialog(null, "Your in the Master Bathroom.","",JOptionPane.INFORMATION_MESSAGE, MBathRoom);
        personChoice = JOptionPane.showOptionDialog(null, "What do want do in the Master Bathroom?", "Master Bathroom", 0,JOptionPane.INFORMATION_MESSAGE, null, masterBathRoomOption, masterBathRoomOption[0] /*icon)*/);
        if(personChoice == 0){
            oilLamp();
        }else{ masterShower();
            
        }
        
    }
    public void oilLamp(){
        ImageIcon genie = new ImageIcon("genie.jpg");
        JOptionPane.showMessageDialog(null, "You rub the lamp and a genie pops out who says he’ll grant you 3 wishes. \n Be careful What you wish for ?", "",JOptionPane.INFORMATION_MESSAGE, genie);
        bookBag ="Intricate Oil Lamp";
        
        
        
    }
    public void masterShower(){
        ImageIcon masterShower = new ImageIcon("singshower.jpg");
        JOptionPane.showMessageDialog(null, "Suddenly hear singing in the shower, but no one is there", "", JOptionPane.INFORMATION_MESSAGE, masterShower);
        bookBag ="Mirror";
        
        
    }
    /*this the bedroom one method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void bedRoomOne(){
        lastRoom = "bedroom one";
        String[] bedRoomOneOption ={"Rocking Chair", "Window", "Bathroom"};  
        ImageIcon bedOne = new ImageIcon("bedone.jpg");
        JOptionPane.showMessageDialog(null, "Your in the Bedroom one.","",JOptionPane.INFORMATION_MESSAGE,bedOne);
       personChoice =JOptionPane.showOptionDialog(null, "What do you want to do in the bedroom one?", "Bedroom one", 0, JOptionPane.INFORMATION_MESSAGE, null, bedRoomOneOption, bedRoomOneOption[0]);
       if(personChoice == 0){
           rockingChair();
           
           
       }else if(personChoice == 1){ window();
           
       }else{goToBathroom();
           
       }        
        
    }
    public void rockingChair(){
        ImageIcon scaryChair = new ImageIcon("rockchair.jpg");
        JOptionPane.showMessageDialog(null, "Chair starts rocking by itself with no one in it","",JOptionPane.INFORMATION_MESSAGE, scaryChair);
        bookBag = "Rocking Chair";   
        
    }
    public void window(){
            ImageIcon scaryWindow = new ImageIcon("window.jpg");
           JOptionPane.showMessageDialog(null, "See a child outside on a swing who suddenly disappears","",JOptionPane.INFORMATION_MESSAGE,scaryWindow);
           bookBag = "Window";
           
    }
    /*this the bedroom two method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void bedRoomTwo() { 
        lastRoom = "bedroom two";
        String[] bedRoomTwoOption ={"Doll House", "Dresser", "Bathroom"};  
        ImageIcon bedTwo = new ImageIcon("bedtwo.jpg");
        JOptionPane.showMessageDialog(null, "Your in the Bedroom two.","",JOptionPane.INFORMATION_MESSAGE, bedTwo);
        personChoice =JOptionPane.showOptionDialog(null, "What do you want to do in the bedroom two?", "Bedroom two", 0, JOptionPane.INFORMATION_MESSAGE, null, bedRoomTwoOption, bedRoomTwoOption[0]);
        if(personChoice == 0){
            dollHouse();
            
        }else if(personChoice == 1){
            dresser();
            
        }else{
            goToBathroom();
        }
    }
   
   /*this the diningroom method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void diningRoom(){
        lastRoom = "Dining room";
        String[] diningRoomOption ={"Candelabra", "Kitchen" };
        ImageIcon eatTable = new ImageIcon("diningroom.jpg");
        JOptionPane.showMessageDialog(null, "Your in the Dining room.","",JOptionPane.INFORMATION_MESSAGE, eatTable);
        personChoice = JOptionPane.showOptionDialog(null, "What do you like to do in the Dining room?", "Dining Room", 0,JOptionPane.INFORMATION_MESSAGE, null, diningRoomOption, diningRoomOption[0]);
        if(personChoice == 0){
            lightCandle();
        }else{
            goToKitchen();
        }
    }
    public void dollHouse(){
        ImageIcon doll = new ImageIcon("dollhouse.jpg");
        JOptionPane.showMessageDialog(null, "The dolls start dancing on their own","",JOptionPane.INFORMATION_MESSAGE, doll);
        bookBag = "Doll House";
        
        
    }
    public void dresser(){
        ImageIcon deathDresser = new ImageIcon("dresser.jpg");
        JOptionPane.showMessageDialog(null, "A ghost flies out of the dresser as soon as you open it and goes right though your body");
        bookBag = "Dresser";    
        
    }        
    public void lightCandle(){
        ImageIcon liteCandle = new ImageIcon("candle.jpg");
        JOptionPane.showMessageDialog(null, "Light up by themselves and see a death shadow","",JOptionPane.INFORMATION_MESSAGE,liteCandle);
        bookBag = "Candelabra";
        
    }  
    /*this the kitchen method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void goToKitchen(){
        lastRoom = "Kitchen";
        String [] kitchenOption = {"Refrigerator","Cabinet","Pantry"};
        ImageIcon hellKitchen = new ImageIcon("kitchen.jpg");
        JOptionPane.showMessageDialog(null, "Your in the Kitchen.","",JOptionPane.INFORMATION_MESSAGE, hellKitchen);
        personChoice = JOptionPane.showOptionDialog(null, "What do like you ", "Kitchen", 0, JOptionPane.INFORMATION_MESSAGE, null, kitchenOption, kitchenOption[0]);
    if(personChoice == 0){
        fridge();
    }else if(personChoice == 1){
        cabinet();
    }else{
        pantry();
    }
    }
    public void fridge(){
        ImageIcon headFridge = new ImageIcon("fridge.jpg");
        JOptionPane.showMessageDialog(null, "Open it and find some delicious soul food.","", JOptionPane.INFORMATION_MESSAGE, headFridge);
        bookBag ="Refrigerator";
       
        
        
    }
    public void cabinet(){
        ImageIcon scaryCabinet = new ImageIcon("cabinet.jpg");
        JOptionPane.showMessageDialog(null, "The dishes and glasses start flying at you as soon as you open the door." +"\n"+"You get hit in the head and feel yourself start moving towards a light.","",JOptionPane.INFORMATION_MESSAGE, scaryCabinet);
        bookBag ="Cabinet";
        
    }
    /*this the pantry method store all  choice in aray, picture, appears in JOption message and option buttons*/
    public void pantry(){
        lastRoom = "Pantry";
        String [] pantryOption ={"Dusty recipe box","Broom"};
        ImageIcon scaryPantry = new ImageIcon("pantry.jpg");
        JOptionPane.showMessageDialog(null, "Your in the Pantry.","", JOptionPane.INFORMATION_MESSAGE, scaryPantry);
        personChoice = JOptionPane.showOptionDialog(null, "What do you like to do in the pantry?", "Pantry", 0, JOptionPane.INFORMATION_MESSAGE, null,pantryOption, pantryOption[0]);
        if(personChoice == 0){
            recipeBox();
            
        }else{
            broom();
            
        }
        
    }
    public void recipeBox(){
        ImageIcon menuBox = new ImageIcon("recipe.jpg");
        JOptionPane.showMessageDialog(null, "You open it up and a recipe for chocolate devils food cake appears our of no where.","",JOptionPane.INFORMATION_MESSAGE,menuBox);
        bookBag ="Dusty recipe box";
        
        
    }
    public void broom(){
        ImageIcon broomStick = new ImageIcon("broom.jpg");
        JOptionPane.showMessageDialog(null, "Flies up in the air as soon as you touch it","",JOptionPane.INFORMATION_MESSAGE, broomStick);
        bookBag ="Broom"; 
        
        
    }
    /*This method shows your result and location of your death in the house and store your name and item you have collected*/
    public void deathResults( ){
        ImageIcon gameOver = new ImageIcon("gameover.jpg");
        JOptionPane.showMessageDialog(null, this.userName + " dead: " + lastRoom + " and collected : " + this.bookBag,"GameOver", JOptionPane.INFORMATION_MESSAGE,gameOver);
    System.exit(0);
    }
    
}
            
    
    
    
