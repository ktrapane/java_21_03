package com.company;

public class Main {

    public static void main(String[] args) {
	// Automatic conversion.
        //Conversions that do not cause any data loss.
        //Byte to Shorts
        byte value_byte = 124;
        short value_short = value_byte;
        System.out.println("New value of short from byte 124 is (value_short): " + value_short);

        //byte to float
        float value_float = 22;



        //Conversations that will cause data loss

        // int to float
        int value_of_int = 123456789;
        float value_of_float = value_of_int;
        System.out.println("New value of float from int 123456789 is (value_of_float): " + value_of_float);

        //long to float
        long value_of_long = 2013232414423431L;
        float newValueOfFloat = value_of_long;
        System.out.println("New value of float from long 2013232414423431L is (newValueOfFloat): " + newValueOfFloat);

        //long to double
        double value_of_double = value_of_long;
        System.out.println("New value of double from long 2013232414423431L is (value_of_double): " + value_of_double);

        //casting.
        //double to float
        double available_balance = 99.9989;
        float float_available_balance = (float) available_balance;
        System.out.println("Available balance in float: " + float_available_balance);

        //double to long
        long long_available_balance = (long) available_balance;
        System.out.println("Available balance in long: " + long_available_balance);


        //Class work.

        //double to int
        int int_available_balance = (int) available_balance;
        System.out.println("Available balance in int: " + int_available_balance);


        //float to int
        float float_value = 12.32f;
        int float_value_casted_to_int = (int) float_value;
        System.out.println("float value in int " + float_value_casted_to_int);


        //long to int
        long long_value = 12345676467L;
        int long_value_casted_to_int = (int) long_value;
        System.out.println("long value in int " + long_value_casted_to_int);

    }
}
