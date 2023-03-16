/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.cadastrodealunos;
import java.util.Scanner;
/**
 *
 * @author felip
 */

public class Dados {
    Scanner L = new Scanner(System.in);
private String nome;
private int tamanho;
private String sexo;
private String cor;
        Boolean m = false;
        Boolean f = false;
private double peso;
int NumeroTotalAlunos;
String  Nnome = nome;
   

    public void cadastraAluno(){
        System.out.println("Digite nome do aluno: ");
    Nnome = L.next();
    nome =  Nnome;
    System.out.println("Digite Peso: ");
    peso = L.nextDouble();
    System.out.println("Digite o tamnho em cm: ");
    tamanho = L.nextInt();
    System.out.println("Digite M para masculino e F para feminino: ");
    sexo = L.next();
    if (sexo == "M"){
        m = true;
    }else{
        f = true;
    }
    System.out.println("Digite sua cor da pele:");
    cor = L.next();
    }

}
