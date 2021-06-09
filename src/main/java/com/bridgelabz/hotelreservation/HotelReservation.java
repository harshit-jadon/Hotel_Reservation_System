package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation<E> implements IOperations<E> {
    List<HotelDetails<E>> hotelDetails = new ArrayList<>();

    @Override
    public void addHotel(E hotelName, E hotelPrice, E hotelRating) {
        hotelDetails.add(new HotelDetails<>(hotelName, hotelPrice, hotelRating));
    }

    @Override
    public int hotelSize() {
        return this.hotelDetails.size();
    }

    @SafeVarargs
    @Override
    public final HotelDetails<E> cheapestHotel(E checkInDate,E checkOutDate) {
        HotelDetails<E> hotel = hotelDetails.get(0);
        for(int i= 1; i<hotelDetails.size(); i++){
            if(hotel.getHotelPrice() > hotelDetails.get(i).getHotelPrice())
                hotel = hotelDetails.get(i);
        }
        E price = hotel.getHotelPrice() * (checkInDate+checkOutDate);
        return new HotelDetails<>(hotel.getHotelName(), price, hotel.getHotelRating());
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
    }
}