import java.util.Scanner;

public class Calculadora {
    Scanner dado = new Scanner(System.in);
    String nome;
    int idade;

    double valor1;
    double valor2;
    double valor3;
    double res;
    double raiz1;
    double raiz2;
    double delta;

    public void somar(){
        res = valor1 + valor2;
        System.out.println("\no resultado é: " + res);
    }

    public void subtrair(){
        res = valor1 - valor2;
        System.out.println("\no resultado é: " + res);
    }

    public void multiplicar(){
        res = valor1 * valor2;
        System.out.println("\no resultado é: " + res);
    }

    public void dividir(){
        res = valor1 / valor2;
        System.out.println("\no resultado é: " + res);
    }

    public void areaQuadrado(){
        res = valor1 * valor1;
        System.out.println("\no resultado é: " + res);
    }

    public void areaRetangulo(){
        res = valor1 * valor2;
        System.out.println("\no resultado é: " + res);
    }

    public void areaTriangulo(){
        res = valor1 * valor2 / 2;
        System.out.println("\no resultado é: " + res);
    }

    public void volumeCubo(){
        res = valor1 * valor2 * valor3;
        System.out.println("\no resultado é: " + res);
    }

    public void volumeCone(){
        res = (3.14 * (valor1 * valor1) * valor2)/3 ;
        System.out.println("\no resultado é: " + res);
    }

    public void bhaskara(){
        delta = (valor2 * valor2) - (4 * valor1 * valor3);

        if (delta<0) {
            System.out.println("a equação não possui raizes");
        }
        else{
        raiz1 = (-(valor2) + Math.sqrt(delta)) / (2*valor1);
        raiz2 = (-(valor2) - Math.sqrt(delta)) / (2*valor1);

        System.out.println("\nas duas raizes são:");
        System.out.println("raiz 1 = " + raiz1 + "\nraiz 2 = " + raiz2);
        
        }
        
    }

    public void setValor1(double valor1){
        this.valor1 = valor1;
    }
    
    public double getValor1(){
        return valor1;
    }

    public void setValor2(double valor2){
        this.valor2 = valor2;
    }

    public double getValor2(){
        return valor2;
    }

    public void setValor3(double valor3){
        this.valor3 = valor3;
    }

    public double getValor3(){
        return valor3;
    }

}