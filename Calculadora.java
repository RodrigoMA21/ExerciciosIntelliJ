import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        double resultado;
        String operador;

        System.out.println("Digite o primeiro valor: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        num2 = entrada.nextInt();

        entrada.nextLine();
        System.out.println("Digite a operação: ");
        operador = entrada.nextLine();

        switch(operador) {
            case "+":
                resultado = num1 + num2;
                System.out.println(" Resultado é: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println(" Resultado é: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println(" Resultado é: " + resultado);
                break;
            case "/":
                resultado = (double) num1 / num2;
                System.out.println(" Resultado é: " + resultado);
                break;
            default:
                System.out.println("Operador inválido");
                break;

        }
        System.out.println("Fim!");
        entrada.close();





    }
}