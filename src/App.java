import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //8- Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

    //Entrada
    Double dinheiroHora, horaMes, salario;
    Scanner teclado;

    teclado = new Scanner(System.in);

    System.out.println("Quanto você ganha por hora? ");
    dinheiroHora = teclado.nextDouble();

    System.out.println("Qual é o número de horas trabalhadas no mês? ");
    horaMes = teclado.nextDouble();

    //Processamento
    salario = (dinheiroHora * horaMes);

    //Saída
    System.out.println("O seu salário é de: " + salario);








    





    }
}
