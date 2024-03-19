package com.mycompany.ex0304;

import java.util.Scanner;
import javax.swing.JOptionPane;



//
public class Ex0304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = null;
        int area;
        int base;
        int altura;
        
        
        System.out.println("Digite a altura e a base do triangulo para calcular a area de uma casa:");
        //resposta = JOptionPane.showInputDialog(null, "Digite o tamanho da base: ");
        //base = Integer.parseInt(resposta);
        System.out.print("Digite o tamanho da base: ");
        base = scanner.nextInt();   
        //resposta = JOptionPane.showInputDialog(null, "Digite o tamanho da altura: ");
        //altura = Integer.parseInt(resposta);
        System.out.print("Digite o tamnho da altura: ");
        altura = scanner.nextInt();      
        area = base*altura/2;
        
        System.out.println("Digite o lados x,y e z para calcular o perimetro do triangula da casa:");
        int perimetro;
        int x;
        int y;
        int z;        
        //resposta = JOptionPane.showInputDialog(null, "Digite o lado x: ");
        //x = Integer.parseInt(resposta);
        System.out.print("Digite o lado x: ");
        x = scanner.nextInt(); 
        //resposta = JOptionPane.showInputDialog(null, "Digite o lado y: ");
        //y = Integer.parseInt(resposta);
        System.out.print("Digite o lado y: ");
        y = scanner.nextInt();         
        z = base;        
        perimetro = x+y+z;
        System.out.println("Portanto, a casa tem area de "+area+"m²"+" e perimetro de "+perimetro+"m.");
        
        
        
        
        
        
        
        
        
        
      
    }
}
