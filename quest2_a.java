import java.util.Scanner;
import java.lang.Math;   //Simei Mondardo e Yuri
public class quest2_a {
        public static void main(String[] args) {
            double numero;
            int resultado;
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o numero decimal: ");
            numero = ler.nextDouble();
            resultado = (int) Math.round(numero);
            if (resultado < numero )
            {
                resultado++;
            }
            System.out.println("Resulatdo: " + resultado);
        }
    }
