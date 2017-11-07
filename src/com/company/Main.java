package com.company;

import java.util.Scanner;

public class Main {
    public static int num (String num) {
        int p = Integer.parseInt(num);
        return p;
    }
    public static String remove(String s, int pos) {
        return s.substring(pos + 1, s.length());
    }

    public static void main(String[] args) {
        int z = 0;
        String num1 = "", num2 = "";
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '+' || str.charAt(j) == '-') {
                num1 = str.substring (0,j);
                char sings = str.charAt(j);
                z = j;
                break;
            }
        }
        str = remove(str, z);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '=') { // В конце примера нужно поставить знак '='
                num2 = str.substring(0, i);
                break;
            }
        }
        int u = num (num1);
        int v = num (num2);
        System.out.print(u + v);

    }
}