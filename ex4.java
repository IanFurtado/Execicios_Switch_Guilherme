import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira seu plano de trabalho");
        String plano = entrada.nextLine();
        System.out.println("Insira o salário");
        double s = entrada.nextDouble();
        double salario = 0;
        

        switch (plano) {
            
            case "A","a":
                s += salario;
                double novoSalario = s * 0.10;
                double resposta = novoSalario + s;
                System.out.println(resposta);
                break;

            case "B","b":
                s += salario;
                double novoSalario2 = s * 0.15;
                double resposta2 = novoSalario2 + s;
                System.out.println(resposta2);
                break;

            case "C","c":
                s += salario;
                double novoSalario3 = s * 0.20;
                double resposta3 = novoSalario3 + s;
                System.out.println(resposta3);
                break;
        
            default:
                System.out.println("Plano inválido");
                break;
        }
        entrada.close();
    }
}