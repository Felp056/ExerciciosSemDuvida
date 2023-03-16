/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.cadastroadvogado;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class CadastroAdvogado {

    public static void main(String[] args) {
        cadastro c = new cadastro();
        Scanner k = new Scanner(System.in);
        for(int i = 0; i < 8; i++){
        System.out.println("Digite seu nome");
        c.nome = k.next();
        System.out.println("digite seu sexo: ");
        c.sexo = k.next();
        if(c.nome == null || c.sexo == null){
            System.out.print("campo vazio");
            break;
        }else{
            c.CriaAdvogado();
            c.imprime();
        }
        }
    }
}
