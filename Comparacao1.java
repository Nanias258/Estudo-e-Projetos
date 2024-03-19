package com.mycompany.comparacao1;

import java.util.Scanner;
import javax.swing.JOptionPane;


//
public class Comparacao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a=Integer.parseInt(JOptionPane.showInputDialog("digite o numero A: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("digite o numero B: "));
        
        
        boolean igual = a==b;
        boolean diferente = a!=b;
        boolean maior = a>b;
        boolean menor = a<b;
        boolean maiorigual = a>=b;       
        boolean menorigual = a<=b;       
        
        JOptionPane.showMessageDialog(null, igual);
        JOptionPane.showMessageDialog(null, diferente);
        JOptionPane.showMessageDialog(null, maior);
        JOptionPane.showMessageDialog(null, menor);
        JOptionPane.showMessageDialog(null, maiorigual);
        JOptionPane.showMessageDialog(null, menorigual);
        
    }
}
