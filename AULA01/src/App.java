import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Cria um Objeto do tipo Scanner( sc ) que recebe o System.in como parâmetro
        //para tratar a entrada de dados
        Scanner sc = new Scanner(System.in);

        // Variáveis
        String nome = ""; //Variável do tipo string com o valor ""
        int idade = 0; //Variável do tipo int com o valor 0


        System.out.println("Digite o seu nome: ");
        if(sc.hasNext()){ //Verifica se existe uma entrada de dados
            nome = sc.nextLine(); //Atribui o valor digitado para a variável nome
        }


        System.out.println("Digite a sua idade: ");
        if(sc.hasNext()){ //Verifica se existe uma entrada de dados
            idade = sc.nextInt(); //Atribui o valor digitado para a variável idade
        }
        
        System.out.println(" ===================");
        System.out.println("| Dados Cadastrados |");
        System.out.println(" ===================");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);

    }
}
