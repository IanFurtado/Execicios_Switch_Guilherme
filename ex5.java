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
                double resposta1 = num1 + num2;
                double resposta0 = resposta1 / 2;
                System.out.println(resposta0);
                break;

            case "S","s":
                if (num1 > num2) {
                    int resposta2 = num1 - num2;
                    System.out.println(resposta2);
                } else {
                    int resposta2 = num2 - num1;
                    System.out.println(resposta2);
                }
                break;

            case "P","p":
                long resposta4 = num1 * num2;
                System.out.println(resposta4);
                break;

            case "D","d":
                double resposta5 = num1 / (double)num2;
                System.out.println(resposta5);
                break;
        
            default:
                System.out.println("Entrada inválida");
                break;
        }
        entrada.close();
    }
}