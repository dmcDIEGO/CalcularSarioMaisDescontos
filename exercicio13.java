package listadeexercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
/*Ao executar esse programa, ele solicitará que você digite o valor do salário 
por hora e o número de horas trabalhadas no mês. Após inserir os valores, ele 
calculará o salário bruto, os descontos e o salário líquido, e mostrará os 
resultados*/

public class exercicio13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.print("Digite o valor do salário por hora: ");
        double salarioHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double descontoIR = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.08;
        double descontoSindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;

        System.out.println("+ Salário Bruto: R$ " + decimalFormat.format(salarioBruto));
        System.out.println("- IR (11%): R$ " + decimalFormat.format(descontoIR));
        System.out.println("- INSS (8%): R$ " + decimalFormat.format(descontoINSS));
        System.out.println("- Sindicato (5%): R$ " + decimalFormat.format(descontoSindicato));
        System.out.println("= Salário Líquido: R$ " + decimalFormat.format(salarioLiquido));
    }
    
}
