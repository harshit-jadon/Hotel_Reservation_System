package com.bridgelabz.hotelreservation;

public interface IOperations <E>{
     void addHotel(E hotelName, E hotelPrice, E hotelRating);

     int hotelSize();

     HotelDetails cheapestHotel(E checkInDate, E checkOutDate );



}
