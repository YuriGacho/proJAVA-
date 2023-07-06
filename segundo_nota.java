import java.util.Scanner;
//Simei Mondardo
public class segundo_nota {
    public static void main(String[] args) {
        // atividade 1
        Scanner dalva = new Scanner(System.in);
        String nome,cidade;
        System.out.println("Digite seu nome:");
        nome = dalva.nextLine();
        System.out.println("Digite sua cidade:");
        cidade = dalva.nextLine();
        System.out.println("Olá "+nome+", você mora na cidade de "+cidade+".");

        // atividade 2
        System.out.println("Digite seu nome:");
        nome = dalva.nextLine();
        System.out.println("Olá "+nome+", seja bem vindo ao meu programa :)");

        //atividade 3
        int idade;
        System.out.println("Digite sua idade:");
        idade = dalva.nextInt();
        System.out.println("Você tem "+idade+" anos.");

        //atividade 4
        int numer;
        System.out.println("Digite um número:");
        numer = dalva.nextInt();
        System.out.println("Você digitou o número "+numer);

        //atividade 5
        float numerf;
        System.out.println("Digite um número decimal:");
        numerf = dalva.nextFloat();
        System.out.println("Você digitou o número "+numerf);

        //atividade 6
        int numero, numer1;
        System.out.println("Digite um número:");
        numero = dalva.nextInt();
        System.out.println("Digite outro número:");
        numer1 = dalva.nextInt();
        System.out.println(numero+" e "+ numer1);

        //atividade 7
        System.out.println("Digite seu nome:");
        nome = dalva.next();
        System.out.println("Digite sua idade:");
        idade = dalva.nextInt();
        System.out.println("Digite em que cidade você mora:");
        cidade = dalva.next();
        System.out.println("Que incrivel, seu nome é "+nome+", tem "+idade+ " anos e mora em "+cidade+".");

        //atividade 8
        System.out.println("Digite um número inteiro:");
        numero = dalva.nextInt();
        System.out.println("Digite um número decimal:");
        numerf = dalva.nextFloat();
        System.out.println("Você digitou "+numero+" e "+numerf);

        //atividade 9
        String nomet, nome_rua, estado, cidadey ;
        double cpf, cep, num_casa, num_telefone;

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nomet = leia.next();
        System.out.println("Informe o estado em que você mora: ");
        estado = leia.next();
        System.out.println("Informe sua cidade: ");
        cidadey = leia.next();
        System.out.println("Informe o CEP: ");
        cep = leia.nextDouble();
        System.out.println("Informe o nome da sua rua: ");
        nome_rua = leia.next();
        System.out.println("Informe o número da sua casa: ");
        num_casa = leia.nextDouble();
        System.out.println("Informe seu CPF: ");
        cpf = leia.nextDouble();
        System.out.println("Informe seu número de telefone: ");
        num_telefone = leia.nextDouble();

        System.out.println("Nome .......: " + nomet);
        System.out.println("Endereço....: " + "RUA: "+ nome_rua +"," + " Número: "+ num_casa +","+ " Cep: "+ cep);
        System.out.println("Cidade......: " + cidadey);
        System.out.println("Estado......: " + estado);
        System.out.println("CPF.........: " + cpf);
        System.out.println("Tel. Celular: " + num_telefone);

        //atividade 10
        int A,B,X;
        System.out.println("Digite um número para A:");
        A = dalva.nextInt();
        System.out.println("Digite um número para B:");
        B = dalva.nextInt();

        X = A;
        A = B;
        B = X;
        System.out.println("Após a troca: A = "+A+" e B = "+B);


    }


}



