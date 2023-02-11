package com.engeto.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Booking> listOfBookings = new ArrayList<>();

        ///region Vytvoř hosty. Vypiš na obrazovku jejich popis:

        Guest guest1 = new Guest("Adéla", "Malíková"
                , LocalDate.of(1993, 10, 3));
        Guest guest2 = new Guest("Jan", "Dvořáček"
                , LocalDate.of(1995, 5, 5));

        System.out.println("Guest " + guest1.getName() + guest1.getSurname()
                + " is born " + guest1.getDateOfBirth() + ".");
        System.out.println("Guest " + guest2.getName() + guest2.getSurname()
                + " is born " + guest2.getDateOfBirth() + ".");
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
        ///endregion

        ///region Připrav rezervace:

        Booking booking = new Booking(guest1, false, true
                , LocalDate.of(2021, 7, 19)
                , LocalDate.of(2021, 7, 26), 1);
        Booking booking1 = new Booking(guest2, true, false
                , LocalDate.of(2021, 9, 3)
                , LocalDate.of(2021, 9, 14), 2);

        listOfBookings.add(booking);
        listOfBookings.add(booking1);
        //System.out.println(listOfBookings.size());


        System.out.println(
                "Name: "
                        + booking.guest.getName()
                        + " "
                        + booking.guest.getSurname() + ", is vacation: "
                        + booking.isVacation() + ", is workstay: "
                        + booking.isWorkStay() + ", start date is: "
                        + booking.getStartDay() + ", end date is: "
                        + booking.getEndDay()
        );

        System.out.println(
                "Name: "
                        + booking1.guest.getName()
                        + " "
                        + booking1.guest.getSurname() + ", is vacation: "
                        + booking1.isVacation() + ", is workstay: "
                        + booking1.isWorkStay() + ", start date is: "
                        + booking1.getStartDay() + ", end date is: "
                        + booking1.getEndDay()
        );


        ///endregion


    }
}