
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Cria um Objeto do tipo Scanner( scanner ) que recebe o System.in como parâmetro
        //para tratar a entrada de dados
        Scanner scanner = new Scanner(System.in);
        //Cria um Objeto do tipo Parfum( parfum ) 
        //para embelezar o programa
        Parfum parfum = new Parfum();

        // Variáveis
        String nome = ""; //Variável do tipo string com o valor ""
        int idade = 0; //Variável do tipo int com o valor 0
        double altura = 0; //Variável do tipo double com o valor 0

        parfum.start();
        System.out.println("Digite o seu nome: ");
        if(scanner.hasNext()){ //Verifica se existe uma entrada de dados
            nome = scanner.nextLine(); //Atribui o valor digitado para a variável nome
        }


        System.out.println("Digite a sua idade: ");
        if(scanner.hasNext()){ //Verifica se existe uma entrada de dados
            idade = scanner.nextInt(); //Atribui o valor digitado para a variável idade
        }
        
        System.out.println("Digite a sua altura: ");
        if(scanner.hasNext()){ //Verifica se existe uma entrada de dados
            altura = scanner.nextDouble(); //Atribui o valor digitado para a variável altura
        }
        
        parfum.end();
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);

        scanner.close();
    }
}
