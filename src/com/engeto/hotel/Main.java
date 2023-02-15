package com.engeto.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {

        BookingList bookingList = new BookingList();


        ///region Booking lists for each booking
        List<Guest> bookingGuests = new ArrayList<>();
        List<Guest> booking1Guests = new ArrayList<>();
        List<Guest> booking2Guests = new ArrayList<>();

        ///endregion

        ///region Vytvoř hosty. Vypiš na obrazovku jejich popis:

        Guest guest1 = new Guest("Adéla", "Malíková"
                , LocalDate.of(1993, 10, 3));
        Guest guest2 = new Guest("Jan", "Dvořáček"
                , LocalDate.of(1995, 5, 5));



        System.out.println("Guest " + guest1.getName() + guest1.getSurname()
                + " is born " + guest1.getDateOfBirth() + ".");
        System.out.println("Guest " + guest2.getName() + guest2.getSurname()
                + " is born " + guest2.getDateOfBirth() + ".");
        System.out.println(" ");
        ///endregion

        ///region Vytvoř pokoje a vypiš na obrazovku jejich popis:

        Room room1 = new Room(1, 1
                , BigDecimal.valueOf(1000), true, true);
        Room room2 = new Room(2, 1
                , BigDecimal.valueOf(1000), true, true);
        Room room3 = new Room(3, 3
                , BigDecimal.valueOf(2400), false, true);

        System.out.println("Room num." + room1.getRoomNumber() + " has "
                + room1.getNumOfBeds() + " bed, " + "a balkony and seaview for "
                + room1.getPricePerNight() + "Kč/night.");
        System.out.println("Room num." + room2.getRoomNumber() + " has "
                + room2.getNumOfBeds() + " bed, " + "a balkony and seaview for "
                + room2.getPricePerNight() + "Kč/night.");
        System.out.println("Room num." + room3.getRoomNumber() + " has "
                + room3.getNumOfBeds() + " beds, " + "and seaview without a balcony for "
                + room3.getPricePerNight() + "Kč/night.");
                System.out.println(" ");
        ///endregion

        ///region Create bookings and add guests to each booking :

        bookingGuests.add(guest1);
        Booking booking = new Booking(guest1.getName(), guest1.getSurname(), true,false
                , LocalDate.of(2021, 7, 19)
                , LocalDate.of(2021, 7, 26), 1,bookingGuests);
        booking1Guests.add(guest1);
        booking1Guests.add(guest2);
        Booking booking1 = new Booking(guest2.getName(), guest2.getSurname(), true, false
                , LocalDate.of(2021, 9, 3)
                , LocalDate.of(2021, 9, 14), 2,booking1Guests);




//        System.out.println(
//                "Name: "
//                        + booking.getName()
//                        + " "
//                        + booking.getSurname() + ", is vacation: "
//                        + booking.isVacation() + ", is workstay: "
//                        + booking.isWorkStay() + ", start date is: "
//                        + booking.getStartDay() + ", end date is: "
//                        + booking.getEndDay() + ", num. of guests: "
//                        + booking.getNumOfGuests()
//        );
//
//        System.out.println(
//                "Name: "
//                        + booking1.getName()
//                        + " "
//                        + booking1.getSurname() + ", is vacation: "
//                        + booking1.isVacation() + ", is workstay: "
//                        + booking1.isWorkStay() + ", start date is: "
//                        + booking1.getStartDay() + ", end date is: "
//                        + booking1.getEndDay() + ", num. of guests: "
//                        + booking1.getNumOfGuests()
//        );
//                System.out.println(" ");


        ///endregion

                bookingList.listOfBookings.add(booking);
                bookingList.listOfBookings.add(booking1);


                bookingList.printListOfAllBookings();

    }

}