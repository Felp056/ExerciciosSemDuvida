/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.cadastroadvogado;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class cadastro {
    Scanner m = new Scanner(System.in);
    String nome;
    String sexo;
    private double altura;
    private double peso;
    private String cor;
    private int idade;
    private int tempoDeServico;
    public void CriaAdvogado(){
        System.out.println("Digite o peso");
        peso = m.nextDouble();
        System.out.println("Digite o tempo de serviço");
        tempoDeServico = m.nextInt();
        System.out.println("digite a idade");
        idade = m.nextInt();
        System.out.println("digite a altura");
        altura = m.nextDouble();
        System.out.println("informe sua cor");
        cor = m.next();
    }
    public void imprime(){
        System.out.println("nome : "+nome+"\n sexo :"+sexo+"\n altura: "+altura+"m \n peso: "+peso+"KG \n cor : "+cor+"\n idade: "+idade+" \n tempo de serviço: "+tempoDeServico);
    }
    
}
