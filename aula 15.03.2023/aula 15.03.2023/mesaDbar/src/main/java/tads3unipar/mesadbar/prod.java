/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.mesadbar;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class prod {
    Scanner L = new Scanner(System.in);
    String bebida;
    String comida;
    double qntB;
    double qntC;
    int mesa;
    double ValorBebida;
    double ValorComida;
   
    public void cadastraProduto(){
        System.out.println("Digite o numero da mesa:");
        mesa = L.nextInt();
        System.out.println("Digite uma bebida:");
        bebida = L.next();
        System.out.println("digite a quantidade:");
        qntB = L.nextDouble();
        System.out.println("Digite a comida");
        comida = L.next();
        System.out.println("Digite as unidades ");
        qntC = L.nextDouble();
        System.out.println("Digite o valor da bebida");
        ValorBebida = L.nextDouble();
        System.out.println("Digite o valor da comida");
        ValorComida = L.nextDouble();
        System.out.println("mesa: "+mesa+" valor conta: "+((ValorBebida*qntB)+(ValorComida*qntC))+" R$"+"\n"+(ValorBebida*qntB)+" de bebida "+bebida+" e "+ (ValorComida*qntC)+" em "+comida);
    }
}
