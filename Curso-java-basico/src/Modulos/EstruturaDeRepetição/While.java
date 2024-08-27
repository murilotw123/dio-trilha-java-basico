package Modulos.EstruturaDeRepetição;
import java.util.Scanner;




public class While {
    public static void main(String[] args) {
        int mesada = 50;
        int valorDoce;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do doce: ");
        valorDoce = scanner.nextInt();

        while(valorDoce < mesada){
            System.out.println("Doce comprado!!");
            mesada = mesada - valorDoce;
            System.out.println("Valor do proximo doce: ");
            valorDoce = scanner.nextInt();
        }
        System.out.println("Acabou a mesada");
    }
    
}
