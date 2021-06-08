package com.bridgelabz.hotel;

import com.bridgelabz.entity.HotelDetails;
import com.bridgelabz.services.IOperations;
import com.bridgelabz.services.Operations;
import org.junit.Assert;
import org.junit.Test;

public class TestHotelReservation {
    @Test
    public void givenHotelDetails_withNameRateAndRating_ShouldReturnTrue() {
        IOperations<String> operations = new Operations<>();
        operations.addHotel("Lakewood","110","3");

    }
}
