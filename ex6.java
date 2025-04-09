import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nCárdapio\n");
        System.out.println("Código  Produto          Preço\n100     Cachorro Quente  R$ 1,20\n101     Bauru simples    R$ 1,30\n102     Bauru com ovo    R$ 1,50\n103     Hambúrguer       R$ 1,20\n104     Cheeseburguer    R$ 1,30\n105     Refrigerante     R$ 1,00");
        byte pedido = entrada.nextByte();
        System.out.println("Quantos você gostaria?");
        byte quantidade = entrada.nextByte();

        switch (pedido) {
            case 100:
                double coisa = 1.20 * quantidade;
                System.out.printf("Total a pagar: %.2f\n",coisa);
                System.out.println("Peidido: " + quantidade + " Cachorro(s) Quente(s)");
                break;

            case 101:
                double coisa1 = 1.30 * quantidade;
                System.out.printf("Total a pagar: %.2f\n",coisa1);
                System.out.println("Pedido: " + quantidade + " Bauru(s) Simples");
                break;

            case 102:
                double coisa2 = 1.50 * quantidade;
                System.out.printf("Total a pagar: %.2f\n",coisa2);
                System.out.println("Pedido: " + quantidade + " Bauru(s) com ovo");
                break;
                
            case 103:
                double coisa3 = 1.20 * quantidade;
                System.out.printf("Total a pagar: %.2f\n",coisa3);
                System.out.println("Pedido: " + quantidade + " Hambúrguer(s)");
                break;
                
            case 104:
                double coisa4 = 1.30 * quantidade;
                System.out.printf("Total a pagar: %.2f\n",coisa4);
                System.out.println("Pedido: " + quantidade + " Cheeseburguer(s)");
                break;  
                
            case 105:
                double coisa5 = 1.00 * quantidade;
                System.out.printf("Total a pagar: %.2f\n",coisa5);
                System.out.println("Pedido: " + quantidade + " Refrigerante(s)");
                break;   
        
            default:
                System.out.println("Pedido Inválido");
                break;
        }
        entrada.close();
    }
}
