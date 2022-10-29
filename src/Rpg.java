

import java.util.Scanner;

public class Rpg {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome;
        String sexo;
        String profisao;

        System.out.println("Qual o nome ? ");
        nome = ler.nextLine().toUpperCase().trim();
        System.out.println("Qual o  ? ");
        sexo = ler.nextLine().toUpperCase().trim();
        System.out.println(sexo);
            //iquinore o tamanho da letra para isso serve equalsIgnoreCase//
        if (sexo.equalsIgnoreCase("masculino"))
        {
            System.out.println(" homem ");
        } else System.out.println("mulher");

        System.out.println("qual a profissão escolha as opções?");
        profisao= ler.nextLine().toUpperCase().trim();




    }
}



















