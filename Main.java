package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            System.out.println("Введіть двозначне  число:");
            Scanner scanner1 = new Scanner(System.in);
            int x = scanner1.nextInt();
            int y = x % 10;
            int z = x / 10;
            System.out.println(y + " "+ z );
            System.out.println(y + z);

            System.out.print("Вкажіть число для округлення: ");
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            int b = (int)a;
            double c = a - (double)b;
            double d = c + 0.5D;
            int r = (int)a + (int)d;
            System.out.println(r);
    }
}
