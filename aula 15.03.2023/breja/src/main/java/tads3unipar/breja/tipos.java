/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.breja;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class tipos {
    String nome;
    int ml;
    String tipo;
    String fabricante;
    private int Codigo = 0000000;
    private double valor;
    Scanner T = new Scanner(System.in);
    public void malte(){
        System.out.println("Digite o nome da cerveja: ");
        nome = T.next();
        System.out.println("Digite o volume da cerveja em ml: ");
        ml = T.nextInt();
        System.out.println("Digite o tipo: ");
        tipo = T.next();
        System.out.println("Digite o fabricante: ");
        fabricante = T.next();
        System.out.println("Digite o valor: ");
        valor = T.nextDouble();
        Codigo ++;
        System.out.println("\n");
    }
    
    public void exibe(){
        System.out.println("cerveja "+nome+" do tipo "+tipo+" do fabricante "+fabricante+" esta sendo vendida a"+valor+"R$ com "+ml+" por garrafa\n");
        System.out.print("Codigos: "+Codigo);
    }
    
}
