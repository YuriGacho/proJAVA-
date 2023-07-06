import java.util.Scanner;
import java.lang.Math;   //Simei Mondardo e Yuri
public class quest2_b {
    public static void main(String[] args) {
        double numero,resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero decimal: ");
        numero = ler.nextDouble();
        resultado = Math.floor(numero);
        System.out.println("Resultado igual a: " + resultado);
    }
}

