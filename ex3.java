import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o período do aluno:\nM.Diurno\nV.Vespertino\nN.Noturno");
        String letra = entrada.nextLine();

        switch (letra) {
            case "M","m":
                System.out.println("Bom dia");
                break;

            case "V", "v":
                System.out.println("Boa tarde");
                break;

            case "N","n":
                System.out.println("Boa noite");
                break;
        
            default:
                System.out.println("Entrada inválida");
                break;
        }
        entrada.close();

    }
}