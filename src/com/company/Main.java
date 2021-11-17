package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть:");
        Model.x = sc.nextDouble();
        Model.znak = sc.next();
        Model.y = sc.nextDouble();
        switch (Model.znak)
        {
            case "+":
                Model.resultSum=Controller.summ();
                break;
            case "-":
                Model.resultSum=Controller.riz();
                break;
            case "*":
                Model.resultSum=Controller.dob();
                break;
            case "/":
                Model.resultSum=Controller.chast();
                break;
        }
        View.displey(Model.resultSum);
    }
}
