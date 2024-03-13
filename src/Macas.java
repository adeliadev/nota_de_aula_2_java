import java.util.Scanner;

public class Macas {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Digite o número de maçãs compradas: ");
        int pedido = sc.nextInt();

        double total;
        if (pedido >= 12){
            total = pedido * 1.3;
        } else {
            total = pedido * 1.0;
        }

        System.out.printf("O preço final do pedido é igual a: R$ %.2f", total);
    }
}
