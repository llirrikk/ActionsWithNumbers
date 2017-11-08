package com.company;

import java.util.Scanner;

public class Main {
    public static int num(String num) {
        int p = Integer.parseInt(num);
        return p;
    }
    public static String remove(String s, int pos) {
        return s.substring(pos + 1, s.length());
    }

    public static void main(String[] args) {
        int z = 0;
        char[] array = new char[100];
        int[] array2 = new int[100];
        Scanner in = new Scanner(System.in);
        String myString = in.nextLine();
        for (int j = 0; j < myString.length(); j++) {
            if (myString.charAt(j) == '+' || myString.charAt(j) == '-' || myString.charAt(j) == '=') { // В конце примера нужно поставить знак '='
                array2[z] = num(myString.substring(0, j));
                array[z] = myString.charAt(j);
                z++;
                myString = remove(myString, j);
                j = 0;
            }
        }
        int answer = 0;
        z = 0;
        answer = array2[0];
        for (int i = 1; i < 99; i++) {
            if (array[z] == '+') {
                answer = answer + array2[i];
                z++;
            } else {
                if (array[z] == '-') {
                    answer = answer - array2[i];
                    z++;
                }
            }
        }
        System.out.print(answer);
    }
}
