/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.bicicleta;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class pecas {
    String quadro;
    String MarcMarcha;
    String nomeBicicleta;
    private int aro;
    private int NdeMarchas;
    private double TamQuadro;
    private String freio;
    
    private String MarcFreio(String Mfreio){
        freio = Mfreio;
        return freio;
    }
    private int Medidas(int Naro){
        NdeMarchas = Naro;
        return NdeMarchas;
    }
    private int Marchas(int qnt){
        aro = qnt;
        return aro;
    }
    private double Nquadro(double cm){
        TamQuadro = cm;
        return TamQuadro;
    }
    public void CriaBicicleta(){
        System.out.println(nomeBicicleta+ " de quadro "+quadro+" de "+Nquadro(TamQuadro)+"cm de aro "+Medidas(Medidas(aro))+" com o freio "+MarcFreio(freio)+"\n com a marcha "+ MarcMarcha+" de "+Marchas(NdeMarchas)+" voce criou");
        
    }
    public void atribui(){
        Scanner L = new Scanner(System.in);
        System.out.println(" digite o nome da bicicleta: ");
        nomeBicicleta = L.next();
        System.out.println("Digite  a Marca da marcha: ");
        MarcMarcha = L.next();
        System.out.println("Digite a marca do quadro:");
        quadro = L.next();
        System.out.println("Digite a marca do freio: ");
        String g = L.next();
        MarcFreio(g);
        System.out.println("Digite o tamanho do aro em cm: ");
        int a = L.nextInt();
        Medidas(a);
        System.out.println("Digite quantidade marchas : ");
         a = L.nextInt();
        Marchas(a);
        System.out.println("Digite o tamanho do quadro: ");
        double b = L.nextInt();
        Nquadro(b);
        
    }
}
