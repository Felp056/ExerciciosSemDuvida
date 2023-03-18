/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.cosultorio1;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class dados {
    Scanner v = new Scanner(System.in);
    private String nome;
    private int idade;
    private double peso;
    private String sobreNome;
    private float altura;
    public void paciente(){
        System.out.println("Digite seu nome: ");
        String Nnome = v.next();
        nome = Nnome;
        System.out.println("Digite se sobrenome: ");
        String SobreNome = v.next();
        sobreNome = SobreNome;
        System.out.println("Digite sua idade: ");
        int Idade = v.nextInt();
        Idade = idade;
        System.out.println("Digite sua altura em cm: ");
        float Altura = v.nextFloat();
        altura = Altura;
        System.out.println("Digite seu peso: ");
        double Peso = v.nextDouble();
        Peso = peso;
    }
    public void sintomas(){
        String sintoma;
        boolean emergencia = false;
        System.out.println("Digite seu sintoma de forma resumida (EX: dor, desconforto, febre...): ");
        sintoma = v.next();
           double feb = 36;
         if(sintoma == null){
             System.out.println("sintoma nao listado");
         }else switch (sintoma) {
            case "sangramento":
                  System.out.println("Deve procurar ajuda");
                emergencia = true;
                break;
            case "Sangramento":
                System.out.println("Deve procurar ajuda");
                emergencia = true;
                break;
            case "desconforto":
                System.out.println("Procure uma posicao mais confortavel");
                break;
            case "Desconforto":
                System.out.println("Procure uma posicao mais confortavel");
                break;
            case "Febre":
                 System.out.println("Digite quantos graus de febre:");
                feb = v.nextDouble();
                if(feb > 36.9 && feb < 40){
                    System.out.println("Febre nao tao alta");
                }else{
                    emergencia = true;
                }
                break;
            case "febre":
                System.out.println("Digite quantos graus de febre:");
                feb = v.nextDouble();
                if(feb > 36.9 && feb < 40){
                    System.out.println("Febre nao tao alta");
                }else{
                    emergencia = true;
                }
                break;
            case "dor":
                 System.out.println("Pode auto medicar");
                break;
            case "Dor":
                System.out.println("Pode auto medicar");
                break;
            default:
                System.out.println("sintoma nao listado");
                break;
        }
             String quadro;
             if(emergencia == true){
                 quadro = "estado de emergencia";
             }else{
                 quadro = "estado nao emergencial";
             }
             System.out.print(nome+" "+sobreNome+" sente: "+sintoma+" sua temperatura é: "+feb+" , seu quadro se encontra em "+quadro+"\n");
    }
}
