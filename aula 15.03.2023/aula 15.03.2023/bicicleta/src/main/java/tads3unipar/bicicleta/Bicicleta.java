/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.bicicleta;

/**
 *
 * @author felip
 */
public class Bicicleta {

    public static void main(String[] args) {
        pecas p = new pecas();
        for(int i = 0; i < 5; i++){
            p.atribui();
            if(i < 3){
            p.CriaBicicleta();
            }
        }
    }
}
/*
Criar uma Classe Bicicleta com 3 Atributos públicos e 4 Atributos privados; criar 2 métodos para cadastrar os atributos privados; Criar um construtor para atribuir 2 atributos; 

Na Classes principal Cadastrar no mínimo 4 Bicicletas;

Na Classe principal Mostrar 4 Mensagens destacando os 7 atributos das 2 primeiras bicicletas cadastradas;
*/