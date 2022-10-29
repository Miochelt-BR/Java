import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       double salario;
         double imposto = 0;
         double diferenca;
         String nome;
         double idade;

        System.out.println("Bem vindo a selva ");

         System.out.println("digite o seu nome ");
        nome = ler.next();

        System.out.println("digite o seu idade ");
        idade = ler.nextDouble();

         System.out.println("digite o seu salario ");
        salario = ler.nextDouble();

        if (salario>4500){
            imposto = 1000* 0.08 + 1500*0.18;
            diferenca = salario -4500;
            imposto += diferenca* .28;
            System.out.println("devorado pelo Leão RS$" +imposto);

        }
        else if (salario>3000){
            imposto= 1000* 0.08;
            diferenca= salario- 3000;
            imposto+= diferenca* 0.17;
            System.out.println(" devorado pelo Leão RS$" +imposto);

        }
        else if (salario>2000){
            diferenca=  salario-2000;
            imposto= diferenca *0.08;
            System.out.println(" sempre vivo RS$" );


            {


            }
        }


    }

}
