package com.javacourse.chapter5.Operators_And_Expressions;

public class Notes{
    public static void main(String[] args){
        /*
            Easy Binary To Decimal Converting Trick

            Lets say we have to calculate what is this ( 0 0 0 1 0 1 0 0 ) in decimal

            Process:

            0    0   0   1  0  1  0  0
           128  64  32  16  8  4  2  1

           And add those numbers which have 1 bit

           In this case

           16 + 4 = 20

           So ( 0 0 0 1 0 1 0 0 ) in decimal is 20
        */
        /*
            When we add byte+short, int + int, we will get an Int datatype
            When we add int+float we will get float
            When we add char+short or int we get int
            compiler internally change it to int
            Changing data type to any data type
            eg: String to int, long to int
            is called coercion
        */
        /*
            We can change precedence of operator by using "()" brackets
        */
        /*
            There are 4 types of operators:
            1) post increment(post++)
            2) post decrement(post--)
            3) pre increment(++pre)
            4) pre decrement(--pre)
        */
        /*
            int x = 5, y;
            y = x++;
            here assignment is done first like this:
            y = x; here val of y = 5;
            then x++; it will increase
            so y = 5;
        */
        /*
            int x = 5;
            int t = ++x;
            Here, first increment and then assign the value to "t"
        */
        int x = 5, y;
        y=x++;
        System.out.println(y);//Here y = 5
        int t = ++x;
        System.out.println(t);//Here t = 6
        /*
            Lets take an example:
            int a = 2, b = 5, x = 4, C;
            C = a*(++x)+b; this will be = 15 (Here x in incremented then used)
            C = a*(x++)+b; this will be = 13 (Here x is used then incremented)
        */

        /*
            Post And Pre increment works on float also
            like here:
            float x = 5.3;
            x++;
            System.out.println(x);
            output will be:
            6.3
        */
        /*
            byte x = 4;
            x++;
            output = 5;
            and this will not be converted in to int in this post pre increment data will not change
        */
        /*
            char x = 'A'; // 'A' is 65
            x++; // Here it will be 66 which = 'B'
            sysout(x);
            output will be:
            'B'
        */
        /*
            We cannot perform increment decrement on boolean Data type
        */
        /*
            Bitwise operators
        */
        /*
            These operators perform operation on bits of data
        */
        /*
            We can only perform bitwise operations on integer type of data
        */
        /*
            We cannot perform bitwise operations on float and double type of data
        */
        /*
            If the sign bit is “0”, this means the number is positive in value. If the sign bit is “1”, then the number is negative in value. The remaining bits in the number are used to represent the magnitude of the binary number in the usual unsigned binary number format way.
        */
        // "&" Truth Table
        /*
            A  |   B   |  A & B
        -------------------------
            0  |   0   |   0
            0  |   1   |   0
            1  |   0   |   0
            1  |   1   |   1
        */
        // "|" Truth Table
        /*
            A  |   B   |  A & B
        -------------------------
            0  |   0   |   0
            0  |   1   |   1
            1  |   0   |   1
            1  |   1   |   1
        */
        // "^" Truth Table
        /*
            A  |   B   |  A & B
        -------------------------
            0  |   0   |   0
            0  |   1   |   1
            1  |   0   |   1
            1  |   1   |   0
        */
        // "&" Operation On Numbers
        /*
            X = 10
            Y = 6
            int Z = X & Y;
            X -> 0 0 0 0 1 0 1 0
            Y -> 0 0 0 0 0 1 1 0
           ----------------------
                0 0 0 0 0 0 1 0

            1 0 (In binary) = 2
            So now z = 2
        */
        // "|" Operation On Numbers
        /*
            X = 10
            Y = 6
            int Z = X & Y;
            X -> 0 0 0 0 1 0 1 0
            Y -> 0 0 0 0 0 1 1 0
           ----------------------
                 0 0 0 0 1 1 1 0

            1 1 1 0 (In binary) = 14
            So now z = 14
        */
        // "^" Operation On Numbers
        /*
            X = 10
            Y = 6
            int Z = X & Y;
            X -> 0 0 0 0 1 0 1 0
            Y -> 0 0 0 0 0 1 1 0
           ----------------------
                 0 0 0 0 1 1 0 0

            1 1 0 0 (In binary) = 12
            So now z = 12
        */
        // Left shift
        /*
        x = 10;
        z = x<<1;
        1 0 1 0 (binary) = 10 (Decimal)
            "<<" Shift Bits To Left And Add A Zero At Starting
            For example
            0 0 0 0 1 0 1 0
          ------------------
            0 0 0 1 0 1 0 0

            See 0 0 0 0 1 0 1 0 Became 0 0 0 1 0 1 0 0
            At the right most 0 is placed

        Now After This:

        ----Output----
        z = 20;

        When we left shift any number it just do this:
        -> n*2^k
        For example
        lets say I want to shift 4 to 1 bit
        n = 4
        k = 1
        so, 4*2^1=8
        lets try 10:
        10*2^1=20
        let move 2 bits:
        10*2^2=40
        if we want to double(here double is not datatype) the number just "left shift it"
        In easy words
        if we left shift by 1 we multiply the number by 2 "*2"
        */
        // Right Shift
        /*
            0 0 0 0 1 0 1 0
            if we right shift by 1 it will divide the number by 2 "/2"
            formula:
            n/2^k

        */
        // Unsigned Left Shift
        /*
            (Integer) 10 = (Binary) 1010

            10 -> 0 0 0 0 1 0 1 0
1's compliment -> 1 1 1 1 0 1 0 1 (Just invert the bits)
                              + 1
                -------------------
                  1 1 1 1 0 1 1 0

                now this is after adding "1"

2's compliment (This is nothing but "-10") -> 1 1 1 1 0 1 1 0 (Just add "1")
        */
        /*
            If we perform unsigned right shift on a negative number it become positive
        */
        /*
            Not in java
            it invert all the bits in java
            For example
            10 will become -11
            6 will become -7
        */
        /*
            We can use "%32s" to show 32 bits
        */
        /*
            Method To See The Bits Of A Number
            System.out.println(String.format("%32s", Integer.toBinaryString(x)));
        */
        /*
            Bitmasking And Bitmerging
           ---------------------------
        */
        /*
            4 bits are called nibble
        */
    }
}
