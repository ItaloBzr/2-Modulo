import java.sql.Time;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\ndigite o valor 1: ");
        calc.setValor1(scanner.nextDouble());
        System.out.print("digite o valor 2: ");
        calc.setValor2(scanner.nextDouble());
        System.out.print("digite o valor 3 : ");
        calc.setValor3(scanner.nextDouble());

        while(true){
            System.out.println("\n-------------------------------------------");
            System.out.println("\ndigite a opção que desejar");
            System.out.println("\nopção 1: somar");
            System.out.println("opção 2: subtrair");
            System.out.println("opção 3: multiplicar");
            System.out.println("opção 4: dividir");
            System.out.println("opção 5: calcular area do quadrado");
            System.out.println("opção 6: calcular area do retangulo");
            System.out.println("opção 7: calcular area do triangulo");
            System.out.println("opção 8: calcular volume do cubo");
            System.out.println("opção 9 calcular volume do cone");
            System.out.println("opção 10: calcular bhaskara");
            
            System.out.print("\ndigite a opção desejada: ");
            int opcao = scanner.nextInt();
            
            System.out.println("\n-------------------------------------------");
            if(opcao == 1){
                calc.somar();
                break;
            }
            else if(opcao == 2){
                calc.subtrair();
                break;
            }
            else if(opcao == 3){
                calc.multiplicar();
                break;
            }
            else if(opcao == 4){
                calc.dividir();
                break;
            }
            else if(opcao == 5){
                calc.areaQuadrado();
                break;
            }
            else if(opcao == 6){
                calc.areaRetangulo();
                break;
            }
            else if(opcao == 7){
                calc.areaTriangulo();
                break;
            }
            else if(opcao == 8){
                calc.volumeCubo();
                break;
            }
            else if(opcao == 9){
                calc.volumeCone();
                break;
            }
            else if(opcao == 10){
                calc.bhaskara();
                break;
            }
            else{
                System.out.println("a opção digitada e invalida");
                continue;
            }
        }
    }
}
