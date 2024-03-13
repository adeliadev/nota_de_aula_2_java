import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        System.out.println("Comprimento dos lados de um triângulo");

        Scanner sc = new Scanner(System.in);
        System.out.print("Lado 1: ");
        double lado1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo isósceles");
            }else{
                System.out.println("Triângulo escaleno");
            }
        } else{
            System.out.println("As medidas fornecidas não formam um triângulo");
        }
    }
}
