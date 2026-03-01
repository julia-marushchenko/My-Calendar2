/**
 *  Java program to demonstrate abstract class Calendar.
 */

package com.mycalendar;

import java.util.Calendar;

/**
 * Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Creating calendar instance.
        Calendar calendar = Calendar.getInstance();

        // Printing time zone to console.
        System.out.println(calendar.getTimeZone());

        // Printing current time to console.
        System.out.println(calendar.getTime());

    }
}
