package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] doubleArray = new double[4];

        doubleArray[0] = 3.43;
        doubleArray[1] = 12.1212;
        doubleArray[2] = 12.22;
        doubleArray[3] = 2.29;

        System.out.println(doubleArray[0] + "; " + doubleArray[1] + "; " + doubleArray[2] + "; " + doubleArray[3]);


        String mmr = "Мама мила раму";

        String[] StringArray = mmr.split(" ");
        for (String words : StringArray) {
            System.out.println(words);
        }


        String iwtt = "Я хочу перенесення тексту";
        String SecondStringArray = iwtt.replace(" ", "\n");

        System.out.println(SecondStringArray);


        int[] intArray = new int[]{4, 13, 7, 18, 5, 20, 6, 15, 8, 17};

            System.out.println("Before change: " + Arrays.toString(intArray));
            for (int i = 0; i < intArray.length; i++)
            {
                intArray[i] = intArray[i] * 7;
            }
        System.out.println("After change: " + Arrays.toString(intArray));


            double[] doubleArray2 = new double[]{3.14, 8.16, 7.13, 9.7, 2.6};

        System.out.println("Result Double: " + Arrays.toString(doubleArray2));


        byte byteInt = 30;
        int intInt = 120;
        long longInt = 1005L;

        int[] intForArray = new int[3];

        intForArray[0] = byteInt;
        intForArray[1] = intInt;
        intForArray[2] = (int) longInt;

        System.out.println(intForArray[0]+ ", " + intForArray[1]+ ", " + intForArray[2]);


        int[][] twoDimArray = {
                {3, 5, 7},
                {2, 4, 6},
        };for (int i = 0; i < 2; i++)
        {
            for (int j  = 0; j < 3; j++)
            {
                System.out.print(" " +  twoDimArray[i][j] + " ");
            }
            System.out.println();
        }



        String StringForHello = "Hello world!";

        char firstChar = StringForHello.charAt(0);
        System.out.println("First char: " + firstChar);

        char lastChar = StringForHello.charAt(StringForHello.length()-1);
        System.out.println("Last char: " + lastChar);

        char[] charArray = StringForHello.substring(6,11).toCharArray();
        System.out.print(Arrays.toString(charArray));

        char beforelastChar = charArray [charArray.length -2];
        System.out.println(" penultimate char: " + beforelastChar);


        int x = 3;
        int y = 6;
        int result = ++x;

        x++;
        y--;

        System.out.println("Increment: " + x);
        System.out.println("Decrement: " + y);
        System.out.println("Preincrement: " + result);



    }
}

