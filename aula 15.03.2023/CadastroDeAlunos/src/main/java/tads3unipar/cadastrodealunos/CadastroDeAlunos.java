/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.cadastrodealunos;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class CadastroDeAlunos {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        Dados p = new Dados();
        System.out.println("Digite o numero total de aluno");
        p.NumeroTotalAlunos = L.nextInt();
        for(int i = 0; i < p.NumeroTotalAlunos; i++){
        p.cadastraAluno();
        String texto;
        if(i < p.NumeroTotalAlunos/2){
                 texto = "Da turma 1: ";
                 System.out.print(texto+p.Nnome+" de registro "+(i+1)+"\n");
            }else if(i > p.NumeroTotalAlunos/2){
                texto = "Da turma 2: ";
                System.out.print(texto+p.Nnome+" de registro "+(i+1)+"\n");
            }
            
        }
    }
    
}
