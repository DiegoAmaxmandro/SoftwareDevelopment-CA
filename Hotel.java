/*
*Hotel.java
*@author Diego Lemos
* 31/03/2022
*/

public class Hotel{
  // Declare variables
  private String hotel;
  private String country;
  private int rating;

    //Constructor
  public Hotel(){
  }
  public Hotel(String hotel, String country, int rating){
    this.hotel = hotel;
    this.country = country;
    this.rating = rating;
  }
  public void displayItems(){
    System.out.println("hotel: " + hotel);
    System.out.println("country: " + country);
    System.out.println("rating: " + rating);
  }






  //Getters and Setters

  public String getHotel(){
    return hotel;
  }

  public String getCountry(){
    return country;
  }

  public int getRating(){
    return rating;
  }

  public void setHotel(String hotel){
    this.hotel = hotel;
  }

  public void setCountry(String country){
    this.country = country;
  }

  public void setRating(int rating){
    this.rating = rating;
  }


}//class
