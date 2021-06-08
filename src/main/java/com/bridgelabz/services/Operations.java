package com.bridgelabz.services;

import com.bridgelabz.entity.HotelDetails;

import java.util.ArrayList;
import java.util.List;

public class Operations <E> implements IOperations<E>{
    List<HotelDetails<E>> hotelDetails = new ArrayList<>();
    @Override
    public void addHotel(E hotelName, E hotelPrice, E hotelRating) {
        hotelDetails.add(new HotelDetails<>(hotelName,hotelPrice,hotelRating));
    }
}
