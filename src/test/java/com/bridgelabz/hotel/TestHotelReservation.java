package com.bridgelabz.hotel;

import com.bridgelabz.hotelreservation.HotelDetails;
import com.bridgelabz.hotelreservation.IOperations;
import com.bridgelabz.hotelreservation.HotelReservation;
import org.junit.Assert;
import org.junit.Test;

public class TestHotelReservation {
    @Test
    public void givenHotelDetails_withNameRateAndRating_ShouldReturnTrue() {
        IOperations<String> operations = new HotelReservation<>();
        operations.addHotel("Lakewood","110","3");
        operations.addHotel("Bridgewood","160","4");
        operations.addHotel("Ridgewood","220","5");
        int size = operations.hotelSize();
        Assert.assertEquals(3,size);
    }

    @Test
    public void givenDates_shouldReturnCheapestHotel_withNamePriceAndRating() {
        IOperations<String> operations = new HotelReservation<>();
        operations.addHotel("Lakewood","110","3");
        operations.addHotel("Bridgewood","160","4");
        operations.addHotel("Ridgewood","220","5");
        HotelDetails hotel = operations.cheapestHotel("11Sep2020", "12Sep2020");
        int price = (int) hotel.getHotelPrice();
        Assert.assertEquals(220, price);
        System.out.println();

    }
}
