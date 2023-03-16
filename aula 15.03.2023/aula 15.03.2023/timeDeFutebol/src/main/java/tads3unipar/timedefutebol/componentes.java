/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.timedefutebol;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class componentes {
    Scanner l = new Scanner(System.in);
      private int altura;
      private  int peso;
      private  String corDtime;
      private  int NumCamisa;
    private  String[] jogo = new String[24];
    public void cadastraJogadores(){
        for(int i =0 ; i < 4; i ++){
        System.out.println("Digite o numero da camisa: ");
        NumCamisa = l.nextInt();
        System.out.println("Digite o peso aproximado em kg :");
        peso = l.nextInt();
        System.out.println("Digite a altura em cm : ");
        altura = l.nextInt();
        System.out.println("digite a cor do time dele: ");
        corDtime = l.next();
        System.out.println("Digite nome do jogador: ");
        String x = l.next();
        jogador(x);
        jogo[i] = jogador(x);
        }
    }
    private String jogador(String Nname){
         int altura;
         int peso;
          int NumCamisa;
          String posiçao;
        String nome;
        nome = Nname;
        return nome;
    }
    public void jogo(){
        String [] time1 = new String[4];
        String [] time2 = new String[4];
        for(int i = 0;i < 24; i++ ){
            if(i < 12){
                 time1[i] = jogo[i];
            }else{
                 time2[i] = jogo[i];
            }
        }
        System.out.println("Time1 x time 2: ");
        for(int i = 0; i < 12; i++){
         System.out.print(time1[i]+" x "+time2[i+12]+"\n");
        }
    }
    
}
