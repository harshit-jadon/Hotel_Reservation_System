package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation<E> implements IOperations<E> {
    List<HotelDetails<E>> hotelDetails = new ArrayList<>();

    @Override
    public void addHotel(E hotelName, E hotelWeekDayRate, E hotelWeekEndRate) {
        hotelDetails.add(new HotelDetails<>(hotelName,  hotelWeekDayRate,  hotelWeekEndRate));
    }
    @Override
    public int hotelSize() {
        return this.hotelDetails.size();
    }
    @Override
    public final HotelDetails<E> cheapestHotel(E checkInDate,E checkOutDate) {
        HotelDetails<E> hotel = hotelDetails.get(0);
        for(int i= 1; i<hotelDetails.size(); i++){
            if(hotel.getHotelWeekDayRate() > hotelDetails.get(i).getHotelWeekDayRate())
                hotel = hotelDetails.get(i);
        }
        E price = hotel.getHotelWeekDayRate() * (checkInDate+checkOutDate);
        return new HotelDetails<>(hotel.getHotelName(), price, hotel.getHotelWeekDayRate());
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
    }
}