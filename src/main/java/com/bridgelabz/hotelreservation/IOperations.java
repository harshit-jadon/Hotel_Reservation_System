package com.bridgelabz.hotelreservation;

public interface IOperations <E>{
     void addHotel(E hotelName, E hotelWeekDayRate, E hotelWeekEndRate);

     int hotelSize();

     HotelDetails<E> cheapestHotel(E checkInDate, E checkOutDate );



}
