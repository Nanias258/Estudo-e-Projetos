package com.mycompany.pite;

import java.util.Scanner;

//
public class Pite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A,B,C,H,area,perimetro;
        
        System.out.print("Digite o lado A do triângulo:");
        A = scanner.nextDouble();
         System.out.print("Digite o lado B do triângulo:");
        B = scanner.nextDouble();
         System.out.print("Digite o lado C do triângulo:");
        C = scanner.nextDouble();       
        H = Math.sqrt(Math.pow(A,2)-Math.pow(C/2, 2));
        area = C*H/2;
        perimetro = A+B+C;
        System.out.println("Este triângulo possuí uma área de "+area+"m² e o perimetro de "+perimetro+"m");
    }
    }
