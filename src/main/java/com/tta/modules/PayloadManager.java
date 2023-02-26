package com.tta.modules;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tta.payloads.pojos.Booking;
import com.tta.payloads.pojos.Bookingdates;

public class PayloadManager {

    // JSON -> Java Object
    // JAVA -> Json String
    ObjectMapper objectMapper;
    public String createPayload() throws JsonProcessingException {
        String payload = null;
        // Java Booking ->  JSON String
        objectMapper = new ObjectMapper();
        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(199);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Breakfast, lunch");
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-10-01");
        bookingdates.setCheckout("2022-10-01");
        booking.setBookingdates(bookingdates);
        payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        return payload;
    }


}
