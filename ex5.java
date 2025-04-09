import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números e digite a opção desejada\nM para cálculo de média entre os números digitados\nS para diferença entre o número maior para o menos\nP para o produto entre os números digitados\nD para divisão do primeiro pelo segundo número");
        String letra = entrada.nextLine();
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        switch (letra) {
            case "M","m":
                System.out.println((num1 + num2) / 2.0);
                break;

            case "S","s":
                if (num1 > num2) {
                    System.out.println((num1 - num2));
                } else {
                    System.out.println((num2 - num1));
                }
                break;

            case "P","p":
                System.out.println((num1 * num2));
                break;

            case "D","d":
                System.out.println((num1 / (double) num2));
                break;
        
            default:
                System.out.println("Entrada inválida");
                break;
        }
        entrada.close();
    }
}