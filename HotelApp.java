/*
*HotelApp.java
*@author Diego Lemos
* 31/03/2022
*/


import java.util.Scanner;
import java.util.Arrays;

public class HotelApp{
  public static void main(String[] args) {

    	// Declare and Create objects for input
    Scanner enter = new Scanner(System.in);

    // Declare variables
    int option = 0; // Users option
    String hotel; //Item attribute
    String country; //Item attribute
    int rating; //Item attribute
    int maxRating = 0; // To show the highest rating
    int result = 0; // To get the final highest rating


    Hotel[] hotels; //Declare array
    final int MAX_NUM_ITEMS = 5; //Declare maximum number of items
    hotels = new Hotel[MAX_NUM_ITEMS]; //Maximum number is set on the array
    Hotel h; // Declare variable to recive the attributes inputs
    int numitem = 0; // Declare variable to use on for loopins



    //Main Menu
    while(option != 6){
    System.out.println("Please enter a option: " + "\n" +
    "1 - Add an Item" + "\n" +
    "2 - Display all the items" + "\n" +
    "3 - Search and display all the items " + "\n" +
    "4 - Calculate and display the averege rating" + "\n"+
    "5 - Give a rating for the Hotels between 1 and 5 " + "\n" +
    "6 - Exit application " + "\n"  );

    option = enter.nextInt(); // User entry

    if(option < 1 || option > 6){
      System.out.println("This is an invalid option, please try again.");
    }

    switch(option){
      case 1: // input of items
        if(numitem < 5 ){
        System.out.println("Enter a hotel name:  ");
        hotel = enter.next();
        System.out.println("Enter an country:  ");
        country = enter.next();
        for(rating = 0; rating < 1 || rating > 5;){
           System.out.println("Please give a rating between 1 and 5");
           rating = enter.nextInt();}

        h = new Hotel( hotel, country, rating); // Declaration where h will recive the arrey inputs
        hotels[numitem] = h;
        numitem++;
      }else { System.out.println("Sorry, you reached the maximum items.");
      }
        break;
      case 2: // Display all the items inputed
        if(numitem == 0){
          System.out.println("There is no items add until now.");
        }else{
          for(int i = 0; i < numitem; i++){
           System.out.println("Listed Hotels: ");
           hotels[i].displayItems();
        }
        }
         break;
      case 3:// Use to search an item through rating
        System.out.println("Enter the rating you are searching for");
        int shRating = enter.nextInt();
        boolean match = false;

        for(int i = 0; i < numitem; i++){
          if(hotels[i].getRating() == shRating){
            System.out.println("Hotels with rating  " + shRating + ":");
            System.out.println("Rating: " + hotels[i].getRating());
            System.out.println("Hotel: " + hotels[i].getHotel());
            System.out.println("country: " + hotels[i].getCountry());
            match = true;
          }else if(!match){
            System.out.println("Sorry, there is no Hotel with this rating. Try again.");

          }
        }
        break;
        case 4:// Average calculation
          System.out.println("Average rating calculation: ");

          double av = 0;
          for(int i = 0; i < numitem; i++){
            av += hotels[i].getRating();
          }
          System.out.println("The average rating is: " + av/numitem);

          break;

          case 5:// Show the highest rating

          if(numitem == 0){
            System.out.println("There is no item add until now");
          }else {
            for(int i = 0; i < numitem; i++){
              if(hotels[i].getRating() >= maxRating){
                maxRating=hotels[i].getRating();
                result = i;
              }
            }
            System.out.println(" The highest rating is: ");
            hotels[result].displayItems();
          }
          break;

          case 6:// Finish the programme
            System.out.println("Thank you for using the app!!!");
          break;



    }//switch

  }//while





  }//main
}//class
