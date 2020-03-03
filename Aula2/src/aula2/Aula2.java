/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author aluno
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char inicial = 'L';
        String nome = "Lucas";
        
        int idade = 17;
        
        int dia = 24, mes = 8, ano = 2002;
        
        double peso = 78.1253412465283;
        double altura = 1.85;
        
        boolean dev = true;
        boolean ingresso = true;
        
        System.out.println(inicial+"ucas (Concatenação)");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        
        
        if(mes < 10){
            System.out.println("Nascimento: "+ dia+"/0"+mes+"/"+ano);
        }
        else{
            System.out.println("Nascimento: "+ dia+"/"+mes+"/"+ano);
        }
        
        System.out.println("Altura: " +altura);
        System.out.println("Peso: "+peso);
        System.out.println("Dev: " + dev);
        System.out.println(2*2+(2*6)/4);
        
        if(idade >= 18 && ingresso){
            System.out.println("Permitido");
        }
        else{
            System.out.println("Negado");
        }
    }
    
        
    
}
