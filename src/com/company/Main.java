package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" weigh");	// write your code here
        Scanner scanner = new Scanner(System.in);
        int weigh = scanner.nextInt();
        System.out.println("height");
        int height = scanner.nextInt();
        int perimeter = (weigh + height)*2;
        System.out.println("perimeter :" + perimeter);
        int acreage = weigh * height;
        System.out.println("acreage :" + acreage);
    }
}