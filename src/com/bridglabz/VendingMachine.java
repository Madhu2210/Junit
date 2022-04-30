package com.bridglabz;
import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class VendingMachine {
    static int note[] = {1,2,5,10,50,100,500,1000};
    static int i = 0;
    static int total = 0;

    public static int calculate(int money, int note[]) {
        int rem;
        if (money == 0) {
            return -1;
        } else {
            if (money >= note[i]) {
                int calcnotes = money / note[i];
                rem = money % note[i];
                money = rem;
                total += calcnotes;
                System.out.println(note[i] + "notes are: " + calcnotes);
            }
            i++;
            return calculate(money, note);
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount: ");
            int amount = sc.nextInt();
            VendingMachine.calculate(amount, note);
            System.out.println("Total number of notes are: " + total);
        }
}
