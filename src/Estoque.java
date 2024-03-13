import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade atual do produto: ");
        int qtd_estoque = sc.nextInt();
        System.out.print("Quantidade máxima do produto: ");
        int qtd_maxima = sc.nextInt();
        System.out.print("Quantidade mínima do produto: ");
        int qtd_minima = sc.nextInt();

        int qtd_media = (qtd_maxima + qtd_minima) / 2;
        System.out.println("Quantidade média: " + qtd_media);

        if (qtd_estoque >= qtd_media){
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
